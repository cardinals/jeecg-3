package com.jeecg.reducpricenotic.controller;
import com.jeecg.reducpricenotic.entity.TReducPriceNoticEntity;
import com.jeecg.reducpricenotic.service.TReducPriceNoticServiceI;

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

/**   
 * @Title: Controller  
 * @Description: 降价通知
 * @author onlineGenerator
 * @date 2019-03-09 20:00:44
 * @version V1.0   
 *
 */
@Api(value="TReducPriceNotic",description="降价通知",tags="tReducPriceNoticController")
@Controller
@RequestMapping("/tReducPriceNoticController")
public class TReducPriceNoticController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TReducPriceNoticController.class);

	@Autowired
	private TReducPriceNoticServiceI tReducPriceNoticService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 降价通知列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/reducpricenotic/tReducPriceNoticList");
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
	public void datagrid(TReducPriceNoticEntity tReducPriceNotic,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TReducPriceNoticEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tReducPriceNotic, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tReducPriceNoticService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除降价通知
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TReducPriceNoticEntity tReducPriceNotic, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tReducPriceNotic = systemService.getEntity(TReducPriceNoticEntity.class, tReducPriceNotic.getId());
		message = "降价通知删除成功";
		try{
			tReducPriceNoticService.delete(tReducPriceNotic);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "降价通知删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除降价通知
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "降价通知删除成功";
		try{
			for(String id:ids.split(",")){
				TReducPriceNoticEntity tReducPriceNotic = systemService.getEntity(TReducPriceNoticEntity.class, 
				id
				);
				tReducPriceNoticService.delete(tReducPriceNotic);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "降价通知删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加降价通知
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TReducPriceNoticEntity tReducPriceNotic, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "降价通知添加成功";
		try{
			tReducPriceNoticService.save(tReducPriceNotic);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "降价通知添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新降价通知
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TReducPriceNoticEntity tReducPriceNotic, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "降价通知更新成功";
		TReducPriceNoticEntity t = tReducPriceNoticService.get(TReducPriceNoticEntity.class, tReducPriceNotic.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tReducPriceNotic, t);
			tReducPriceNoticService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "降价通知更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 降价通知新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TReducPriceNoticEntity tReducPriceNotic, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tReducPriceNotic.getId())) {
			tReducPriceNotic = tReducPriceNoticService.getEntity(TReducPriceNoticEntity.class, tReducPriceNotic.getId());
			req.setAttribute("tReducPriceNotic", tReducPriceNotic);
		}
		return new ModelAndView("com/jeecg/reducpricenotic/tReducPriceNotic-add");
	}
	/**
	 * 降价通知编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TReducPriceNoticEntity tReducPriceNotic, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tReducPriceNotic.getId())) {
			tReducPriceNotic = tReducPriceNoticService.getEntity(TReducPriceNoticEntity.class, tReducPriceNotic.getId());
			req.setAttribute("tReducPriceNotic", tReducPriceNotic);
		}
		return new ModelAndView("com/jeecg/reducpricenotic/tReducPriceNotic-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tReducPriceNoticController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TReducPriceNoticEntity tReducPriceNotic,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TReducPriceNoticEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tReducPriceNotic, request.getParameterMap());
		List<TReducPriceNoticEntity> tReducPriceNotics = this.tReducPriceNoticService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"降价通知");
		modelMap.put(NormalExcelConstants.CLASS,TReducPriceNoticEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("降价通知列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tReducPriceNotics);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TReducPriceNoticEntity tReducPriceNotic,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"降价通知");
    	modelMap.put(NormalExcelConstants.CLASS,TReducPriceNoticEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("降价通知列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<TReducPriceNoticEntity> listTReducPriceNoticEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TReducPriceNoticEntity.class,params);
				for (TReducPriceNoticEntity tReducPriceNotic : listTReducPriceNoticEntitys) {
					tReducPriceNoticService.save(tReducPriceNotic);
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
	
	
	@RequestMapping(value="/list/{pageNo}/{pageSize}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="降价通知列表信息",produces="application/json",httpMethod="GET")
	public ResponseMessage<List<TReducPriceNoticEntity>> list(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, HttpServletRequest request) {
		if(pageSize > Globals.MAX_PAGESIZE){
			return Result.error("每页请求不能超过" + Globals.MAX_PAGESIZE + "条");
		}
		CriteriaQuery query = new CriteriaQuery(TReducPriceNoticEntity.class);
		query.setCurPage(pageNo<=0?1:pageNo);
		query.setPageSize(pageSize<1?1:pageSize);
		List<TReducPriceNoticEntity> listTReducPriceNotics = this.tReducPriceNoticService.getListByCriteriaQuery(query,true);
		return Result.success(listTReducPriceNotics);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="根据ID获取降价通知信息",notes="根据ID获取降价通知信息",httpMethod="GET",produces="application/json")
	public ResponseMessage<?> get(@ApiParam(required=true,name="id",value="ID")@PathVariable("id") String id) {
		TReducPriceNoticEntity task = tReducPriceNoticService.get(TReducPriceNoticEntity.class, id);
		if (task == null) {
			return Result.error("根据ID获取降价通知信息为空");
		}
		return Result.success(task);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="创建降价通知")
	public ResponseMessage<?> create(@ApiParam(name="降价通知对象")@RequestBody TReducPriceNoticEntity tReducPriceNotic, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TReducPriceNoticEntity>> failures = validator.validate(tReducPriceNotic);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}

		//保存
		try{
			tReducPriceNoticService.save(tReducPriceNotic);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("降价通知信息保存失败");
		}
		return Result.success(tReducPriceNotic);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="更新降价通知",notes="更新降价通知")
	public ResponseMessage<?> update(@ApiParam(name="降价通知对象")@RequestBody TReducPriceNoticEntity tReducPriceNotic) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TReducPriceNoticEntity>> failures = validator.validate(tReducPriceNotic);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}

		//保存
		try{
			tReducPriceNoticService.saveOrUpdate(tReducPriceNotic);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("更新降价通知信息失败");
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return Result.success("更新降价通知信息成功");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value="删除降价通知")
	public ResponseMessage<?> delete(@ApiParam(name="id",value="ID",required=true)@PathVariable("id") String id) {
		logger.info("delete[{}]" , id);
		// 验证
		if (StringUtils.isEmpty(id)) {
			return Result.error("ID不能为空");
		}
		try {
			tReducPriceNoticService.deleteEntityById(TReducPriceNoticEntity.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("降价通知删除失败");
		}

		return Result.success();
	}
}
