package com.jeecg.confighighlight.controller;
import com.jeecg.confighighlight.entity.TConfigHighLightEntity;
import com.jeecg.confighighlight.service.TConfigHighLightServiceI;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;
import org.apache.commons.lang3.StringUtils;
import org.jeecgframework.jwt.util.ResponseMessage;
import org.jeecgframework.jwt.util.Result;
import com.alibaba.fastjson.JSONArray;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.jeecgframework.web.cgform.entity.upload.CgUploadEntity;
import org.jeecgframework.web.cgform.service.config.CgFormFieldServiceI;
import java.util.HashMap;
/**   
 * @Title: Controller  
 * @Description: 配置亮点
 * @author onlineGenerator
 * @date 2019-03-06 13:51:31
 * @version V1.0   
 *
 */
@Api(value="TConfigHighLight",description="配置亮点",tags="tConfigHighLightController")
@Controller
@RequestMapping("/tConfigHighLightController")
public class TConfigHighLightController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TConfigHighLightController.class);

	@Autowired
	private TConfigHighLightServiceI tConfigHighLightService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	@Autowired
	private CgFormFieldServiceI cgFormFieldService;
	


	/**
	 * 配置亮点列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/confighighlight/tConfigHighLightList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(TConfigHighLightEntity tConfigHighLight,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TConfigHighLightEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tConfigHighLight, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tConfigHighLightService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除配置亮点
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TConfigHighLightEntity tConfigHighLight, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tConfigHighLight = systemService.getEntity(TConfigHighLightEntity.class, tConfigHighLight.getId());
		message = "配置亮点删除成功";
		try{
			tConfigHighLightService.delete(tConfigHighLight);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "配置亮点删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除配置亮点
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "配置亮点删除成功";
		try{
			for(String id:ids.split(",")){
				TConfigHighLightEntity tConfigHighLight = systemService.getEntity(TConfigHighLightEntity.class, 
				id
				);
				tConfigHighLightService.delete(tConfigHighLight);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "配置亮点删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加配置亮点
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TConfigHighLightEntity tConfigHighLight, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "配置亮点添加成功";
		try{
			tConfigHighLightService.save(tConfigHighLight);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "配置亮点添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新配置亮点
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TConfigHighLightEntity tConfigHighLight, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "配置亮点更新成功";
		TConfigHighLightEntity t = tConfigHighLightService.get(TConfigHighLightEntity.class, tConfigHighLight.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tConfigHighLight, t);
			tConfigHighLightService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "配置亮点更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 配置亮点新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TConfigHighLightEntity tConfigHighLight, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tConfigHighLight.getId())) {
			tConfigHighLight = tConfigHighLightService.getEntity(TConfigHighLightEntity.class, tConfigHighLight.getId());
			req.setAttribute("tConfigHighLight", tConfigHighLight);
		}
		return new ModelAndView("com/jeecg/confighighlight/tConfigHighLight-add");
	}
	/**
	 * 配置亮点编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TConfigHighLightEntity tConfigHighLight, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tConfigHighLight.getId())) {
			tConfigHighLight = tConfigHighLightService.getEntity(TConfigHighLightEntity.class, tConfigHighLight.getId());
			req.setAttribute("tConfigHighLight", tConfigHighLight);
		}
		return new ModelAndView("com/jeecg/confighighlight/tConfigHighLight-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tConfigHighLightController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TConfigHighLightEntity tConfigHighLight,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TConfigHighLightEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tConfigHighLight, request.getParameterMap());
		List<TConfigHighLightEntity> tConfigHighLights = this.tConfigHighLightService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"配置亮点");
		modelMap.put(NormalExcelConstants.CLASS,TConfigHighLightEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("配置亮点列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tConfigHighLights);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TConfigHighLightEntity tConfigHighLight,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"配置亮点");
    	modelMap.put(NormalExcelConstants.CLASS,TConfigHighLightEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("配置亮点列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
    	"导出信息"));
    	modelMap.put(NormalExcelConstants.DATA_LIST,new ArrayList());
    	return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(params = "importExcel", method = RequestMethod.POST)
	@ResponseBody
	public AjaxJson importExcel(HttpServletRequest request, HttpServletResponse response) {
		AjaxJson j = new AjaxJson();
		
		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
		Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
		for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
			MultipartFile file = entity.getValue();// 获取上传文件对象
			ImportParams params = new ImportParams();
			params.setTitleRows(2);
			params.setHeadRows(1);
			params.setNeedSave(true);
			try {
				List<TConfigHighLightEntity> listTConfigHighLightEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TConfigHighLightEntity.class,params);
				for (TConfigHighLightEntity tConfigHighLight : listTConfigHighLightEntitys) {
					tConfigHighLightService.save(tConfigHighLight);
				}
				j.setMsg("文件导入成功！");
			} catch (Exception e) {
				j.setMsg("文件导入失败！");
				logger.error(ExceptionUtil.getExceptionMessage(e));
			}finally{
				try {
					file.getInputStream().close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return j;
	}
	
	/**
	 * 获取文件附件信息
	 * 
	 * @param id tConfigHighLight主键id
	 */
	@RequestMapping(params = "getFiles")
	@ResponseBody
	public AjaxJson getFiles(String id){
		List<CgUploadEntity> uploadBeans = cgFormFieldService.findByProperty(CgUploadEntity.class, "cgformId", id);
		List<Map<String,Object>> files = new ArrayList<Map<String,Object>>(0);
		for(CgUploadEntity b:uploadBeans){
			String title = b.getAttachmenttitle();//附件名
			String fileKey = b.getId();//附件主键
			String path = b.getRealpath();//附件路径
			String field = b.getCgformField();//表单中作为附件控件的字段
			Map<String, Object> file = new HashMap<String, Object>();
			file.put("title", title);
			file.put("fileKey", fileKey);
			file.put("path", path);
			file.put("field", field==null?"":field);
			files.add(file);
		}
		AjaxJson j = new AjaxJson();
		j.setObj(files);
		return j;
	}
	
	@RequestMapping(value="/list/{pageNo}/{pageSize}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="配置亮点列表信息",produces="application/json",httpMethod="GET")
	public ResponseMessage<List<TConfigHighLightEntity>> list(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, HttpServletRequest request) {
		if(pageSize > Globals.MAX_PAGESIZE){
			return Result.error("每页请求不能超过" + Globals.MAX_PAGESIZE + "条");
		}
		CriteriaQuery query = new CriteriaQuery(TConfigHighLightEntity.class);
		query.setCurPage(pageNo<=0?1:pageNo);
		query.setPageSize(pageSize<1?1:pageSize);
		List<TConfigHighLightEntity> listTConfigHighLights = this.tConfigHighLightService.getListByCriteriaQuery(query,true);
		return Result.success(listTConfigHighLights);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="根据ID获取配置亮点信息",notes="根据ID获取配置亮点信息",httpMethod="GET",produces="application/json")
	public ResponseMessage<?> get(@ApiParam(required=true,name="id",value="ID")@PathVariable("id") String id) {
		TConfigHighLightEntity task = tConfigHighLightService.get(TConfigHighLightEntity.class, id);
		if (task == null) {
			return Result.error("根据ID获取配置亮点信息为空");
		}
		return Result.success(task);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="创建配置亮点")
	public ResponseMessage<?> create(@ApiParam(name="配置亮点对象")@RequestBody TConfigHighLightEntity tConfigHighLight, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TConfigHighLightEntity>> failures = validator.validate(tConfigHighLight);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}

		//保存
		try{
			tConfigHighLightService.save(tConfigHighLight);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("配置亮点信息保存失败");
		}
		return Result.success(tConfigHighLight);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="更新配置亮点",notes="更新配置亮点")
	public ResponseMessage<?> update(@ApiParam(name="配置亮点对象")@RequestBody TConfigHighLightEntity tConfigHighLight) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TConfigHighLightEntity>> failures = validator.validate(tConfigHighLight);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}

		//保存
		try{
			tConfigHighLightService.saveOrUpdate(tConfigHighLight);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("更新配置亮点信息失败");
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return Result.success("更新配置亮点信息成功");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value="删除配置亮点")
	public ResponseMessage<?> delete(@ApiParam(name="id",value="ID",required=true)@PathVariable("id") String id) {
		logger.info("delete[{}]" , id);
		// 验证
		if (StringUtils.isEmpty(id)) {
			return Result.error("ID不能为空");
		}
		try {
			tConfigHighLightService.deleteEntityById(TConfigHighLightEntity.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("配置亮点删除失败");
		}

		return Result.success();
	}
}
