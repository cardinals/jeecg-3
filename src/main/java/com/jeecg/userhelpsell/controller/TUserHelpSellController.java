package com.jeecg.userhelpsell.controller;
import com.jeecg.userhelpsell.entity.TUserHelpSellEntity;
import com.jeecg.userhelpsell.service.TUserHelpSellServiceI;

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
 * @Description: 帮我卖车
 * @author onlineGenerator
 * @date 2019-03-13 22:18:30
 * @version V1.0   
 *
 */
@Api(value="TUserHelpSell",description="帮我卖车",tags="tUserHelpSellController")
@Controller
@RequestMapping("/tUserHelpSellController")
public class TUserHelpSellController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(TUserHelpSellController.class);

	@Autowired
	private TUserHelpSellServiceI tUserHelpSellService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 帮我卖车列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/userhelpsell/tUserHelpSellList");
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
	public void datagrid(TUserHelpSellEntity tUserHelpSell,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TUserHelpSellEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tUserHelpSell, request.getParameterMap());
		try{
		//自定义追加查询条件
		
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tUserHelpSellService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}
	
	/**
	 * 删除帮我卖车
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TUserHelpSellEntity tUserHelpSell, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		tUserHelpSell = systemService.getEntity(TUserHelpSellEntity.class, tUserHelpSell.getId());
		message = "帮我卖车删除成功";
		try{
			tUserHelpSellService.delete(tUserHelpSell);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "帮我卖车删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 批量删除帮我卖车
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "帮我卖车删除成功";
		try{
			for(String id:ids.split(",")){
				TUserHelpSellEntity tUserHelpSell = systemService.getEntity(TUserHelpSellEntity.class, 
				id
				);
				tUserHelpSellService.delete(tUserHelpSell);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "帮我卖车删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加帮我卖车
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(TUserHelpSellEntity tUserHelpSell, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "帮我卖车添加成功";
		try{
			tUserHelpSellService.save(tUserHelpSell);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "帮我卖车添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	
	/**
	 * 更新帮我卖车
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(TUserHelpSellEntity tUserHelpSell, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		message = "帮我卖车更新成功";
		TUserHelpSellEntity t = tUserHelpSellService.get(TUserHelpSellEntity.class, tUserHelpSell.getId());
		try {
			MyBeanUtils.copyBeanNotNull2Bean(tUserHelpSell, t);
			tUserHelpSellService.saveOrUpdate(t);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "帮我卖车更新失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	

	/**
	 * 帮我卖车新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(TUserHelpSellEntity tUserHelpSell, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tUserHelpSell.getId())) {
			tUserHelpSell = tUserHelpSellService.getEntity(TUserHelpSellEntity.class, tUserHelpSell.getId());
			req.setAttribute("tUserHelpSell", tUserHelpSell);
		}
		return new ModelAndView("com/jeecg/userhelpsell/tUserHelpSell-add");
	}
	/**
	 * 帮我卖车编辑页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(TUserHelpSellEntity tUserHelpSell, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(tUserHelpSell.getId())) {
			tUserHelpSell = tUserHelpSellService.getEntity(TUserHelpSellEntity.class, tUserHelpSell.getId());
			req.setAttribute("tUserHelpSell", tUserHelpSell);
		}
		return new ModelAndView("com/jeecg/userhelpsell/tUserHelpSell-update");
	}
	
	/**
	 * 导入功能跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name","tUserHelpSellController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}
	
	/**
	 * 导出excel
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXls")
	public String exportXls(TUserHelpSellEntity tUserHelpSell,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
		CriteriaQuery cq = new CriteriaQuery(TUserHelpSellEntity.class, dataGrid);
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tUserHelpSell, request.getParameterMap());
		List<TUserHelpSellEntity> tUserHelpSells = this.tUserHelpSellService.getListByCriteriaQuery(cq,false);
		modelMap.put(NormalExcelConstants.FILE_NAME,"帮我卖车");
		modelMap.put(NormalExcelConstants.CLASS,TUserHelpSellEntity.class);
		modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("帮我卖车列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
			"导出信息"));
		modelMap.put(NormalExcelConstants.DATA_LIST,tUserHelpSells);
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	 * 导出excel 使模板
	 * 
	 * @param request
	 * @param response
	 */
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(TUserHelpSellEntity tUserHelpSell,HttpServletRequest request,HttpServletResponse response
			, DataGrid dataGrid,ModelMap modelMap) {
    	modelMap.put(NormalExcelConstants.FILE_NAME,"帮我卖车");
    	modelMap.put(NormalExcelConstants.CLASS,TUserHelpSellEntity.class);
    	modelMap.put(NormalExcelConstants.PARAMS,new ExportParams("帮我卖车列表", "导出人:"+ResourceUtil.getSessionUser().getRealName(),
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
				List<TUserHelpSellEntity> listTUserHelpSellEntitys = ExcelImportUtil.importExcel(file.getInputStream(),TUserHelpSellEntity.class,params);
				for (TUserHelpSellEntity tUserHelpSell : listTUserHelpSellEntitys) {
					tUserHelpSellService.save(tUserHelpSell);
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
	@ApiOperation(value="帮我卖车列表信息",produces="application/json",httpMethod="GET")
	public ResponseMessage<List<TUserHelpSellEntity>> list(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, HttpServletRequest request) {
		if(pageSize > Globals.MAX_PAGESIZE){
			return Result.error("每页请求不能超过" + Globals.MAX_PAGESIZE + "条");
		}
		CriteriaQuery query = new CriteriaQuery(TUserHelpSellEntity.class);
		query.setCurPage(pageNo<=0?1:pageNo);
		query.setPageSize(pageSize<1?1:pageSize);
		List<TUserHelpSellEntity> listTUserHelpSells = this.tUserHelpSellService.getListByCriteriaQuery(query,true);
		return Result.success(listTUserHelpSells);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="根据ID获取帮我卖车信息",notes="根据ID获取帮我卖车信息",httpMethod="GET",produces="application/json")
	public ResponseMessage<?> get(@ApiParam(required=true,name="id",value="ID")@PathVariable("id") String id) {
		TUserHelpSellEntity task = tUserHelpSellService.get(TUserHelpSellEntity.class, id);
		if (task == null) {
			return Result.error("根据ID获取帮我卖车信息为空");
		}
		return Result.success(task);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="创建帮我卖车")
	public ResponseMessage<?> create(@ApiParam(name="帮我卖车对象")@RequestBody TUserHelpSellEntity tUserHelpSell, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TUserHelpSellEntity>> failures = validator.validate(tUserHelpSell);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}

		//保存
		try{
			tUserHelpSellService.save(tUserHelpSell);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("帮我卖车信息保存失败");
		}
		return Result.success(tUserHelpSell);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="更新帮我卖车",notes="更新帮我卖车")
	public ResponseMessage<?> update(@ApiParam(name="帮我卖车对象")@RequestBody TUserHelpSellEntity tUserHelpSell) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TUserHelpSellEntity>> failures = validator.validate(tUserHelpSell);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}

		//保存
		try{
			tUserHelpSellService.saveOrUpdate(tUserHelpSell);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("更新帮我卖车信息失败");
		}

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return Result.success("更新帮我卖车信息成功");
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value="删除帮我卖车")
	public ResponseMessage<?> delete(@ApiParam(name="id",value="ID",required=true)@PathVariable("id") String id) {
		logger.info("delete[{}]" , id);
		// 验证
		if (StringUtils.isEmpty(id)) {
			return Result.error("ID不能为空");
		}
		try {
			tUserHelpSellService.deleteEntityById(TUserHelpSellEntity.class, id);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("帮我卖车删除失败");
		}

		return Result.success();
	}
}
