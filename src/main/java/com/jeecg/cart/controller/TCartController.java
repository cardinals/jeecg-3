package com.jeecg.cart.controller;
import com.jeecg.cart.entity.*;
import com.jeecg.cart.service.TCartServiceI;
import com.jeecg.cart.page.TCartPage;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.common.TreeChildCount;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import java.io.OutputStream;
import org.jeecgframework.core.util.BrowserUtils;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.jeecgframework.poi.excel.entity.TemplateExportParams;
import org.jeecgframework.poi.excel.entity.vo.NormalExcelConstants;
import org.jeecgframework.poi.excel.entity.vo.TemplateExcelConstants;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jeecgframework.core.util.ResourceUtil;
import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.core.util.ExceptionUtil;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;
import org.apache.commons.lang3.StringUtils;
import org.jeecgframework.jwt.util.GsonUtil;
import org.jeecgframework.jwt.util.ResponseMessage;
import org.jeecgframework.jwt.util.Result;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**   
 * @Title: Controller
 * @Description: 车辆信息表
 * @author onlineGenerator
 * @date 2019-03-07 08:54:10
 * @version V1.0   
 *
 */
@Api(value="TCart",description="车辆信息表",tags="tCartController")
@Controller
@RequestMapping("/tCartController")
public class TCartController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LoggerFactory.getLogger(TCartController.class);

	@Autowired
	private TCartServiceI tCartService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;

	/**
	 * 车辆信息表列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/jeecg/cart/tCartList");
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
	public void datagrid(TCartEntity tCart,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(TCartEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tCart,request.getParameterMap());
		try{
		//自定义追加查询条件
		}catch (Exception e) {
			throw new BusinessException(e.getMessage());
		}
		cq.add();
		this.tCartService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除车辆信息表
	 * 
	 * @return
	 */
	@RequestMapping(params = "doDel")
	@ResponseBody
	public AjaxJson doDel(TCartEntity tCart, HttpServletRequest request) {
		AjaxJson j = new AjaxJson();
		tCart = systemService.getEntity(TCartEntity.class, tCart.getId());
		String message = "车辆信息表删除成功";
		try{
			tCartService.delMain(tCart);
			systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "车辆信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 批量删除车辆信息表
	 * 
	 * @return
	 */
	 @RequestMapping(params = "doBatchDel")
	@ResponseBody
	public AjaxJson doBatchDel(String ids,HttpServletRequest request){
		AjaxJson j = new AjaxJson();
		String message = "车辆信息表删除成功";
		try{
			for(String id:ids.split(",")){
				TCartEntity tCart = systemService.getEntity(TCartEntity.class,
				id
				);
				tCartService.delMain(tCart);
				systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
			}
		}catch(Exception e){
			e.printStackTrace();
			message = "车辆信息表删除失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 添加车辆信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doAdd")
	@ResponseBody
	public AjaxJson doAdd(HttpServletRequest request,TCartPage tCartPage) {
		AjaxJson j = new AjaxJson();
		String message = "添加成功";
		try {
			tCartService.addMain(tCartPage);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		} catch (Exception e) {
			e.printStackTrace();
			message = "车辆信息表添加失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}
	/**
	 * 更新车辆信息表
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "doUpdate")
	@ResponseBody
	public AjaxJson doUpdate(HttpServletRequest request,TCartPage tCartPage) {
		AjaxJson j = new AjaxJson();
		String message = "更新成功";
		try{
			tCartService.updateMain(tCartPage);
			systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
		}catch(Exception e){
			e.printStackTrace();
			message = "更新车辆信息表失败";
			throw new BusinessException(e.getMessage());
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 车辆信息表新增页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "goAdd")
	public ModelAndView goAdd(HttpServletRequest req) {
		return new ModelAndView("com/jeecg/cart/tCart-add");
	}
	
	/**
	 * 车辆信息表编辑页面跳转
	 * @return
	 */
	@RequestMapping(params = "goUpdate")
	public ModelAndView goUpdate(HttpServletRequest req) {
		String id = req.getParameter("id");
		TCartPage tCartPage = new TCartPage();
		if (StringUtil.isNotEmpty(id)) {
			TCartEntity tCart = tCartService.getEntity(TCartEntity.class,id);
			try {
				MyBeanUtils.copyBeanNotNull2Bean(tCart,tCartPage);
			} catch (Exception e) {
				e.printStackTrace();
			}
			//===================================================================================
			//获取参数
			Object id0 = tCart.getId();
			//===================================================================================
		    //查询-实拍图
		    String hql0 = "from TCartBannerEntity where 1 = 1 AND cartId = ? ";
		    List<TCartBannerEntity> tCartBannerEntityList = systemService.findHql(hql0,id0);
		    if(tCartBannerEntityList==null || tCartBannerEntityList.size()<=0){
		    	tCartBannerEntityList = new ArrayList<TCartBannerEntity>();
		    	tCartBannerEntityList.add(new TCartBannerEntity());
		    }
		    tCartPage.setTCartBannerList(tCartBannerEntityList);
			//===================================================================================
			//获取参数
			Object id1 = tCart.getId();
			//===================================================================================
		    //查询-配置亮点
		    String hql1 = "from TCartConfigHightLightEntity where 1 = 1 AND cartId = ? ";
		    List<TCartConfigHightLightEntity> tCartConfigHightLightEntityList = systemService.findHql(hql1,id1);
		    if(tCartConfigHightLightEntityList==null || tCartConfigHightLightEntityList.size()<=0){
		    	tCartConfigHightLightEntityList = new ArrayList<TCartConfigHightLightEntity>();
		    	tCartConfigHightLightEntityList.add(new TCartConfigHightLightEntity());
		    }
		    tCartPage.setTCartConfigHightLightList(tCartConfigHightLightEntityList);
			//===================================================================================
			//获取参数
			Object id2 = tCart.getId();
			//===================================================================================
		    //查询-车身配置
		    String hql2 = "from TCartBodyEntity where 1 = 1 AND cartId = ? ";
		    List<TCartBodyEntity> tCartBodyEntityList = systemService.findHql(hql2,id2);
		    if(tCartBodyEntityList==null || tCartBodyEntityList.size()<=0){
		    	tCartBodyEntityList = new ArrayList<TCartBodyEntity>();
		    	tCartBodyEntityList.add(new TCartBodyEntity());
		    }
		    if(tCartBodyEntityList==null || tCartBodyEntityList.size()<=0){
		    	tCartPage.setTCartBodyEntity(new TCartBodyEntity());
		    }else{
		    	tCartPage.setTCartBodyEntity(tCartBodyEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id3 = tCart.getId();
			//===================================================================================
		    //查询-发动机配置
		    String hql3 = "from TCartEngineEntity where 1 = 1 AND cartId = ? ";
		    List<TCartEngineEntity> tCartEngineEntityList = systemService.findHql(hql3,id3);
		    if(tCartEngineEntityList==null || tCartEngineEntityList.size()<=0){
		    	tCartEngineEntityList = new ArrayList<TCartEngineEntity>();
		    	tCartEngineEntityList.add(new TCartEngineEntity());
		    }
		    if(tCartEngineEntityList==null || tCartEngineEntityList.size()<=0){
		    	tCartPage.setTCartEngineEntity(new TCartEngineEntity());
		    }else{
		    	tCartPage.setTCartEngineEntity(tCartEngineEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id4 = tCart.getId();
			//===================================================================================
		    //查询-变速箱配置
		    String hql4 = "from TCartGearboxEntity where 1 = 1 AND cartId = ? ";
		    List<TCartGearboxEntity> tCartGearboxEntityList = systemService.findHql(hql4,id4);
		    if(tCartGearboxEntityList==null || tCartGearboxEntityList.size()<=0){
		    	tCartGearboxEntityList = new ArrayList<TCartGearboxEntity>();
		    	tCartGearboxEntityList.add(new TCartGearboxEntity());
		    }
		    if(tCartGearboxEntityList==null || tCartGearboxEntityList.size()<=0){
		    	tCartPage.setTCartGearboxEntity(new TCartGearboxEntity());
		    }else{
		    	tCartPage.setTCartGearboxEntity(tCartGearboxEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id5 = tCart.getId();
			//===================================================================================
		    //查询-底盘配置
		    String hql5 = "from TCartChassisEntity where 1 = 1 AND cartId = ? ";
		    List<TCartChassisEntity> tCartChassisEntityList = systemService.findHql(hql5,id5);
		    if(tCartChassisEntityList==null || tCartChassisEntityList.size()<=0){
		    	tCartChassisEntityList = new ArrayList<TCartChassisEntity>();
		    	tCartChassisEntityList.add(new TCartChassisEntity());
		    }
		    if(tCartChassisEntityList==null || tCartChassisEntityList.size()<=0){
		    	tCartPage.setTCartChassisEntity(new TCartChassisEntity());
		    }else{
		    	tCartPage.setTCartChassisEntity(tCartChassisEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id6 = tCart.getId();
			//===================================================================================
		    //查询-车轮制动配置
		    String hql6 = "from TCartWheelBrakingEntity where 1 = 1 AND cartId = ? ";
		    List<TCartWheelBrakingEntity> tCartWheelBrakingEntityList = systemService.findHql(hql6,id6);
		    if(tCartWheelBrakingEntityList==null || tCartWheelBrakingEntityList.size()<=0){
		    	tCartWheelBrakingEntityList = new ArrayList<TCartWheelBrakingEntity>();
		    	tCartWheelBrakingEntityList.add(new TCartWheelBrakingEntity());
		    }
		    if(tCartWheelBrakingEntityList==null || tCartWheelBrakingEntityList.size()<=0){
		    	tCartPage.setTCartWheelBrakingEntity(new TCartWheelBrakingEntity());
		    }else{
		    	tCartPage.setTCartWheelBrakingEntity(tCartWheelBrakingEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id7 = tCart.getId();
			//===================================================================================
		    //查询-安全装备
		    String hql7 = "from TCartSafeEntity where 1 = 1 AND cartId = ? ";
		    List<TCartSafeEntity> tCartSafeEntityList = systemService.findHql(hql7,id7);
		    if(tCartSafeEntityList==null || tCartSafeEntityList.size()<=0){
		    	tCartSafeEntityList = new ArrayList<TCartSafeEntity>();
		    	tCartSafeEntityList.add(new TCartSafeEntity());
		    }
		    if(tCartSafeEntityList==null || tCartSafeEntityList.size()<=0){
		    	tCartPage.setTCartSafeEntity(new TCartSafeEntity());
		    }else{
		    	tCartPage.setTCartSafeEntity(tCartSafeEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id8 = tCart.getId();
			//===================================================================================
		    //查询-操控配置
		    String hql8 = "from TCartManipulationEntity where 1 = 1 AND cartId = ? ";
		    List<TCartManipulationEntity> tCartManipulationEntityList = systemService.findHql(hql8,id8);
		    if(tCartManipulationEntityList==null || tCartManipulationEntityList.size()<=0){
		    	tCartManipulationEntityList = new ArrayList<TCartManipulationEntity>();
		    	tCartManipulationEntityList.add(new TCartManipulationEntity());
		    }
		    if(tCartManipulationEntityList==null || tCartManipulationEntityList.size()<=0){
		    	tCartPage.setTCartManipulationEntity(new TCartManipulationEntity());
		    }else{
		    	tCartPage.setTCartManipulationEntity(tCartManipulationEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id9 = tCart.getId();
			//===================================================================================
		    //查询-外部配置
		    String hql9 = "from TCartExternalConfigEntity where 1 = 1 AND cartId = ? ";
		    List<TCartExternalConfigEntity> tCartExternalConfigEntityList = systemService.findHql(hql9,id9);
		    if(tCartExternalConfigEntityList==null || tCartExternalConfigEntityList.size()<=0){
		    	tCartExternalConfigEntityList = new ArrayList<TCartExternalConfigEntity>();
		    	tCartExternalConfigEntityList.add(new TCartExternalConfigEntity());
		    }
		    if(tCartExternalConfigEntityList==null || tCartExternalConfigEntityList.size()<=0){
		    	tCartPage.setTCartExternalConfigEntity(new TCartExternalConfigEntity());
		    }else{
		    	tCartPage.setTCartExternalConfigEntity(tCartExternalConfigEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id10 = tCart.getId();
			//===================================================================================
		    //查询-内部配置
		    String hql10 = "from TCartInterConfigEntity where 1 = 1 AND cartId = ? ";
		    List<TCartInterConfigEntity> tCartInterConfigEntityList = systemService.findHql(hql10,id10);
		    if(tCartInterConfigEntityList==null || tCartInterConfigEntityList.size()<=0){
		    	tCartInterConfigEntityList = new ArrayList<TCartInterConfigEntity>();
		    	tCartInterConfigEntityList.add(new TCartInterConfigEntity());
		    }
		    if(tCartInterConfigEntityList==null || tCartInterConfigEntityList.size()<=0){
		    	tCartPage.setTCartInterConfigEntity(new TCartInterConfigEntity());
		    }else{
		    	tCartPage.setTCartInterConfigEntity(tCartInterConfigEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id11 = tCart.getId();
			//===================================================================================
		    //查询-座椅配置
		    String hql11 = "from TCartSeatConfigEntity where 1 = 1 AND cartId = ? ";
		    List<TCartSeatConfigEntity> tCartSeatConfigEntityList = systemService.findHql(hql11,id11);
		    if(tCartSeatConfigEntityList==null || tCartSeatConfigEntityList.size()<=0){
		    	tCartSeatConfigEntityList = new ArrayList<TCartSeatConfigEntity>();
		    	tCartSeatConfigEntityList.add(new TCartSeatConfigEntity());
		    }
		    if(tCartSeatConfigEntityList==null || tCartSeatConfigEntityList.size()<=0){
		    	tCartPage.setTCartSeatConfigEntity(new TCartSeatConfigEntity());
		    }else{
		    	tCartPage.setTCartSeatConfigEntity(tCartSeatConfigEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id12 = tCart.getId();
			//===================================================================================
		    //查询-多媒体配置
		    String hql12 = "from TCartMultimediaConfigEntity where 1 = 1 AND cartId = ? ";
		    List<TCartMultimediaConfigEntity> tCartMultimediaConfigEntityList = systemService.findHql(hql12,id12);
		    if(tCartMultimediaConfigEntityList==null || tCartMultimediaConfigEntityList.size()<=0){
		    	tCartMultimediaConfigEntityList = new ArrayList<TCartMultimediaConfigEntity>();
		    	tCartMultimediaConfigEntityList.add(new TCartMultimediaConfigEntity());
		    }
		    if(tCartMultimediaConfigEntityList==null || tCartMultimediaConfigEntityList.size()<=0){
		    	tCartPage.setTCartMultimediaConfigEntity(new TCartMultimediaConfigEntity());
		    }else{
		    	tCartPage.setTCartMultimediaConfigEntity(tCartMultimediaConfigEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id13 = tCart.getId();
			//===================================================================================
		    //查询-灯光配置
		    String hql13 = "from TCartLightConfigEntity where 1 = 1 AND cartId = ? ";
		    List<TCartLightConfigEntity> tCartLightConfigEntityList = systemService.findHql(hql13,id13);
		    if(tCartLightConfigEntityList==null || tCartLightConfigEntityList.size()<=0){
		    	tCartLightConfigEntityList = new ArrayList<TCartLightConfigEntity>();
		    	tCartLightConfigEntityList.add(new TCartLightConfigEntity());
		    }
		    if(tCartLightConfigEntityList==null || tCartLightConfigEntityList.size()<=0){
		    	tCartPage.setTCartLightConfigEntity(new TCartLightConfigEntity());
		    }else{
		    	tCartPage.setTCartLightConfigEntity(tCartLightConfigEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id14 = tCart.getId();
			//===================================================================================
		    //查询-玻璃/后视镜配置
		    String hql14 = "from TCartGlassRearviewMirrorEntity where 1 = 1 AND cartId = ? ";
		    List<TCartGlassRearviewMirrorEntity> tCartGlassRearviewMirrorEntityList = systemService.findHql(hql14,id14);
		    if(tCartGlassRearviewMirrorEntityList==null || tCartGlassRearviewMirrorEntityList.size()<=0){
		    	tCartGlassRearviewMirrorEntityList = new ArrayList<TCartGlassRearviewMirrorEntity>();
		    	tCartGlassRearviewMirrorEntityList.add(new TCartGlassRearviewMirrorEntity());
		    }
		    if(tCartGlassRearviewMirrorEntityList==null || tCartGlassRearviewMirrorEntityList.size()<=0){
		    	tCartPage.setTCartGlassRearviewMirrorEntity(new TCartGlassRearviewMirrorEntity());
		    }else{
		    	tCartPage.setTCartGlassRearviewMirrorEntity(tCartGlassRearviewMirrorEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id15 = tCart.getId();
			//===================================================================================
		    //查询-空调/冰箱配置
		    String hql15 = "from TCartAirRefrigeratorEntity where 1 = 1 AND cartId = ? ";
		    List<TCartAirRefrigeratorEntity> tCartAirRefrigeratorEntityList = systemService.findHql(hql15,id15);
		    if(tCartAirRefrigeratorEntityList==null || tCartAirRefrigeratorEntityList.size()<=0){
		    	tCartAirRefrigeratorEntityList = new ArrayList<TCartAirRefrigeratorEntity>();
		    	tCartAirRefrigeratorEntityList.add(new TCartAirRefrigeratorEntity());
		    }
		    if(tCartAirRefrigeratorEntityList==null || tCartAirRefrigeratorEntityList.size()<=0){
		    	tCartPage.setTCartAirRefrigeratorEntity(new TCartAirRefrigeratorEntity());
		    }else{
		    	tCartPage.setTCartAirRefrigeratorEntity(tCartAirRefrigeratorEntityList.get(0));
		    }
			//===================================================================================
			//获取参数
			Object id16 = tCart.getId();
			//===================================================================================
		    //查询-高科技配置
		    String hql16 = "from TCartHighTechConfigEntity where 1 = 1 AND cartId = ? ";
		    List<TCartHighTechConfigEntity> tCartHighTechConfigEntityList = systemService.findHql(hql16,id16);
		    if(tCartHighTechConfigEntityList==null || tCartHighTechConfigEntityList.size()<=0){
		    	tCartHighTechConfigEntityList = new ArrayList<TCartHighTechConfigEntity>();
		    	tCartHighTechConfigEntityList.add(new TCartHighTechConfigEntity());
		    }
		    if(tCartHighTechConfigEntityList==null || tCartHighTechConfigEntityList.size()<=0){
		    	tCartPage.setTCartHighTechConfigEntity(new TCartHighTechConfigEntity());
		    }else{
		    	tCartPage.setTCartHighTechConfigEntity(tCartHighTechConfigEntityList.get(0));
		    }
		}
		req.setAttribute("tCartPage", tCartPage);
		return new ModelAndView("com/jeecg/cart/tCart-update");
	}
	
    /**
    * 导出excel
    *
    * @param request
    * @param response
    */
    @RequestMapping(params = "exportXls")
    public String exportXls(TCartEntity tCart,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid,ModelMap map) {
    	CriteriaQuery cq = new CriteriaQuery(TCartEntity.class, dataGrid);
    	//查询条件组装器
    	org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, tCart);
    	try{
    	//自定义追加查询条件
    	}catch (Exception e) {
    		throw new BusinessException(e.getMessage());
    	}
    	cq.add();
    	List<TCartEntity> list=this.tCartService.getListByCriteriaQuery(cq, false);
    	List<TCartPage> pageList=new ArrayList<TCartPage>();
        if(list!=null&&list.size()>0){
        	for(TCartEntity entity:list){
        		try{
        			TCartPage page=new TCartPage();
        			MyBeanUtils.copyBeanNotNull2Bean(entity,page);
            		Object id0 = entity.getId();
					String hql0 = "from TCartBannerEntity where 1 = 1 AND cartId = ? ";
					List<TCartBannerEntity> tCartBannerEntityList = systemService.findHql(hql0,id0);
					page.setTCartBannerList(tCartBannerEntityList);
            		Object id1 = entity.getId();
					String hql1 = "from TCartConfigHightLightEntity where 1 = 1 AND cartId = ? ";
					List<TCartConfigHightLightEntity> tCartConfigHightLightEntityList = systemService.findHql(hql1,id1);
					page.setTCartConfigHightLightList(tCartConfigHightLightEntityList);
            		Object id2 = entity.getId();
					String hql2 = "from TCartBodyEntity where 1 = 1 AND cartId = ? ";
					List<TCartBodyEntity> tCartBodyEntityList = systemService.findHql(hql2,id2);
				    if(tCartBodyEntityList!=null && tCartBodyEntityList.size()>0){
				    	page.setTCartBodyEntity(tCartBodyEntityList.get(0));
				    }
            		Object id3 = entity.getId();
					String hql3 = "from TCartEngineEntity where 1 = 1 AND cartId = ? ";
					List<TCartEngineEntity> tCartEngineEntityList = systemService.findHql(hql3,id3);
				    if(tCartEngineEntityList!=null && tCartEngineEntityList.size()>0){
				    	page.setTCartEngineEntity(tCartEngineEntityList.get(0));
				    }
            		Object id4 = entity.getId();
					String hql4 = "from TCartGearboxEntity where 1 = 1 AND cartId = ? ";
					List<TCartGearboxEntity> tCartGearboxEntityList = systemService.findHql(hql4,id4);
				    if(tCartGearboxEntityList!=null && tCartGearboxEntityList.size()>0){
				    	page.setTCartGearboxEntity(tCartGearboxEntityList.get(0));
				    }
            		Object id5 = entity.getId();
					String hql5 = "from TCartChassisEntity where 1 = 1 AND cartId = ? ";
					List<TCartChassisEntity> tCartChassisEntityList = systemService.findHql(hql5,id5);
				    if(tCartChassisEntityList!=null && tCartChassisEntityList.size()>0){
				    	page.setTCartChassisEntity(tCartChassisEntityList.get(0));
				    }
            		Object id6 = entity.getId();
					String hql6 = "from TCartWheelBrakingEntity where 1 = 1 AND cartId = ? ";
					List<TCartWheelBrakingEntity> tCartWheelBrakingEntityList = systemService.findHql(hql6,id6);
				    if(tCartWheelBrakingEntityList!=null && tCartWheelBrakingEntityList.size()>0){
				    	page.setTCartWheelBrakingEntity(tCartWheelBrakingEntityList.get(0));
				    }
            		Object id7 = entity.getId();
					String hql7 = "from TCartSafeEntity where 1 = 1 AND cartId = ? ";
					List<TCartSafeEntity> tCartSafeEntityList = systemService.findHql(hql7,id7);
				    if(tCartSafeEntityList!=null && tCartSafeEntityList.size()>0){
				    	page.setTCartSafeEntity(tCartSafeEntityList.get(0));
				    }
            		Object id8 = entity.getId();
					String hql8 = "from TCartManipulationEntity where 1 = 1 AND cartId = ? ";
					List<TCartManipulationEntity> tCartManipulationEntityList = systemService.findHql(hql8,id8);
				    if(tCartManipulationEntityList!=null && tCartManipulationEntityList.size()>0){
				    	page.setTCartManipulationEntity(tCartManipulationEntityList.get(0));
				    }
            		Object id9 = entity.getId();
					String hql9 = "from TCartExternalConfigEntity where 1 = 1 AND cartId = ? ";
					List<TCartExternalConfigEntity> tCartExternalConfigEntityList = systemService.findHql(hql9,id9);
				    if(tCartExternalConfigEntityList!=null && tCartExternalConfigEntityList.size()>0){
				    	page.setTCartExternalConfigEntity(tCartExternalConfigEntityList.get(0));
				    }
            		Object id10 = entity.getId();
					String hql10 = "from TCartInterConfigEntity where 1 = 1 AND cartId = ? ";
					List<TCartInterConfigEntity> tCartInterConfigEntityList = systemService.findHql(hql10,id10);
				    if(tCartInterConfigEntityList!=null && tCartInterConfigEntityList.size()>0){
				    	page.setTCartInterConfigEntity(tCartInterConfigEntityList.get(0));
				    }
            		Object id11 = entity.getId();
					String hql11 = "from TCartSeatConfigEntity where 1 = 1 AND cartId = ? ";
					List<TCartSeatConfigEntity> tCartSeatConfigEntityList = systemService.findHql(hql11,id11);
				    if(tCartSeatConfigEntityList!=null && tCartSeatConfigEntityList.size()>0){
				    	page.setTCartSeatConfigEntity(tCartSeatConfigEntityList.get(0));
				    }
            		Object id12 = entity.getId();
					String hql12 = "from TCartMultimediaConfigEntity where 1 = 1 AND cartId = ? ";
					List<TCartMultimediaConfigEntity> tCartMultimediaConfigEntityList = systemService.findHql(hql12,id12);
				    if(tCartMultimediaConfigEntityList!=null && tCartMultimediaConfigEntityList.size()>0){
				    	page.setTCartMultimediaConfigEntity(tCartMultimediaConfigEntityList.get(0));
				    }
            		Object id13 = entity.getId();
					String hql13 = "from TCartLightConfigEntity where 1 = 1 AND cartId = ? ";
					List<TCartLightConfigEntity> tCartLightConfigEntityList = systemService.findHql(hql13,id13);
				    if(tCartLightConfigEntityList!=null && tCartLightConfigEntityList.size()>0){
				    	page.setTCartLightConfigEntity(tCartLightConfigEntityList.get(0));
				    }
            		Object id14 = entity.getId();
					String hql14 = "from TCartGlassRearviewMirrorEntity where 1 = 1 AND cartId = ? ";
					List<TCartGlassRearviewMirrorEntity> tCartGlassRearviewMirrorEntityList = systemService.findHql(hql14,id14);
				    if(tCartGlassRearviewMirrorEntityList!=null && tCartGlassRearviewMirrorEntityList.size()>0){
				    	page.setTCartGlassRearviewMirrorEntity(tCartGlassRearviewMirrorEntityList.get(0));
				    }
            		Object id15 = entity.getId();
					String hql15 = "from TCartAirRefrigeratorEntity where 1 = 1 AND cartId = ? ";
					List<TCartAirRefrigeratorEntity> tCartAirRefrigeratorEntityList = systemService.findHql(hql15,id15);
				    if(tCartAirRefrigeratorEntityList!=null && tCartAirRefrigeratorEntityList.size()>0){
				    	page.setTCartAirRefrigeratorEntity(tCartAirRefrigeratorEntityList.get(0));
				    }
            		Object id16 = entity.getId();
					String hql16 = "from TCartHighTechConfigEntity where 1 = 1 AND cartId = ? ";
					List<TCartHighTechConfigEntity> tCartHighTechConfigEntityList = systemService.findHql(hql16,id16);
				    if(tCartHighTechConfigEntityList!=null && tCartHighTechConfigEntityList.size()>0){
				    	page.setTCartHighTechConfigEntity(tCartHighTechConfigEntityList.get(0));
				    }
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
        map.put(NormalExcelConstants.FILE_NAME,"车辆信息表");
        map.put(NormalExcelConstants.CLASS,TCartPage.class);
        map.put(NormalExcelConstants.PARAMS,new ExportParams("车辆信息表列表", "导出人:Jeecg", "导出信息"));
        map.put(NormalExcelConstants.DATA_LIST,pageList);
        return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}

    /**
	 * 通过excel导入数据
	 * @param request
	 * @param
	 * @return
	 */
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
			params.setHeadRows(2);
			params.setNeedSave(true);
			try {
				List<TCartPage> list =  ExcelImportUtil.importExcel(file.getInputStream(), TCartPage.class, params);
				for (TCartPage page : list) {
		            tCartService.addMain(page);
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
	* 导出excel 使模板
	*/
	@RequestMapping(params = "exportXlsByT")
	public String exportXlsByT(ModelMap map) {
		map.put(NormalExcelConstants.FILE_NAME,"车辆信息表");
		map.put(NormalExcelConstants.CLASS,TCartPage.class);
		map.put(NormalExcelConstants.PARAMS,new ExportParams("车辆信息表列表", "导出人:"+ ResourceUtil.getSessionUser().getRealName(),
		"导出信息"));
		map.put(NormalExcelConstants.DATA_LIST,new ArrayList());
		return NormalExcelConstants.JEECG_EXCEL_VIEW;
	}
	/**
	* 导入功能跳转
	*
	* @return
	*/
	@RequestMapping(params = "upload")
	public ModelAndView upload(HttpServletRequest req) {
		req.setAttribute("controller_name", "tCartController");
		return new ModelAndView("common/upload/pub_excel_upload");
	}

 	
 	@RequestMapping(value="/list/{pageNo}/{pageSize}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="车辆信息表列表信息",produces="application/json",httpMethod="GET")
	public ResponseMessage<List<TCartPage>> list(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, HttpServletRequest request) {
		if(pageSize>Globals.MAX_PAGESIZE){
			return Result.error("每页请求不能超过" + Globals.MAX_PAGESIZE + "条");
		}
		CriteriaQuery query = new CriteriaQuery(TCartEntity.class);
		query.setCurPage(pageNo<=0?1:pageNo);
		query.setPageSize(pageSize<1?1:pageSize);
		List<TCartEntity> list = this.tCartService.getListByCriteriaQuery(query,true);
    	List<TCartPage> pageList=new ArrayList<TCartPage>();
        if(list!=null&&list.size()>0){
        	for(TCartEntity entity:list){
        		try{
        			TCartPage page=new TCartPage();
        		   MyBeanUtils.copyBeanNotNull2Bean(entity,page);
					Object id0 = entity.getId();
					Object id1 = entity.getId();
					Object id2 = entity.getId();
					Object id3 = entity.getId();
					Object id4 = entity.getId();
					Object id5 = entity.getId();
					Object id6 = entity.getId();
					Object id7 = entity.getId();
					Object id8 = entity.getId();
					Object id9 = entity.getId();
					Object id10 = entity.getId();
					Object id11 = entity.getId();
					Object id12 = entity.getId();
					Object id13 = entity.getId();
					Object id14 = entity.getId();
					Object id15 = entity.getId();
					Object id16 = entity.getId();
				    String hql0 = "from TCartBannerEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartBannerEntity> tCartBannerOldList = this.tCartService.findHql(hql0,id0);
				    page.setTCartBannerList(tCartBannerOldList);
				    String hql1 = "from TCartConfigHightLightEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartConfigHightLightEntity> tCartConfigHightLightOldList = this.tCartService.findHql(hql1,id1);
				    page.setTCartConfigHightLightList(tCartConfigHightLightOldList);
				    String hql2 = "from TCartBodyEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartBodyEntity> tCartBodyOldList = this.tCartService.findHql(hql2,id2);
				    if(tCartBodyOldList!=null && tCartBodyOldList.size()>0){
				    	page.setTCartBodyEntity(tCartBodyOldList.get(0));
				    }
				    String hql3 = "from TCartEngineEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartEngineEntity> tCartEngineOldList = this.tCartService.findHql(hql3,id3);
				    if(tCartEngineOldList!=null && tCartEngineOldList.size()>0){
				    	page.setTCartEngineEntity(tCartEngineOldList.get(0));
				    }
				    String hql4 = "from TCartGearboxEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartGearboxEntity> tCartGearboxOldList = this.tCartService.findHql(hql4,id4);
				    if(tCartGearboxOldList!=null && tCartGearboxOldList.size()>0){
				    	page.setTCartGearboxEntity(tCartGearboxOldList.get(0));
				    }
				    String hql5 = "from TCartChassisEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartChassisEntity> tCartChassisOldList = this.tCartService.findHql(hql5,id5);
				    if(tCartChassisOldList!=null && tCartChassisOldList.size()>0){
				    	page.setTCartChassisEntity(tCartChassisOldList.get(0));
				    }
				    String hql6 = "from TCartWheelBrakingEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartWheelBrakingEntity> tCartWheelBrakingOldList = this.tCartService.findHql(hql6,id6);
				    if(tCartWheelBrakingOldList!=null && tCartWheelBrakingOldList.size()>0){
				    	page.setTCartWheelBrakingEntity(tCartWheelBrakingOldList.get(0));
				    }
				    String hql7 = "from TCartSafeEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartSafeEntity> tCartSafeOldList = this.tCartService.findHql(hql7,id7);
				    if(tCartSafeOldList!=null && tCartSafeOldList.size()>0){
				    	page.setTCartSafeEntity(tCartSafeOldList.get(0));
				    }
				    String hql8 = "from TCartManipulationEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartManipulationEntity> tCartManipulationOldList = this.tCartService.findHql(hql8,id8);
				    if(tCartManipulationOldList!=null && tCartManipulationOldList.size()>0){
				    	page.setTCartManipulationEntity(tCartManipulationOldList.get(0));
				    }
				    String hql9 = "from TCartExternalConfigEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartExternalConfigEntity> tCartExternalConfigOldList = this.tCartService.findHql(hql9,id9);
				    if(tCartExternalConfigOldList!=null && tCartExternalConfigOldList.size()>0){
				    	page.setTCartExternalConfigEntity(tCartExternalConfigOldList.get(0));
				    }
				    String hql10 = "from TCartInterConfigEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartInterConfigEntity> tCartInterConfigOldList = this.tCartService.findHql(hql10,id10);
				    if(tCartInterConfigOldList!=null && tCartInterConfigOldList.size()>0){
				    	page.setTCartInterConfigEntity(tCartInterConfigOldList.get(0));
				    }
				    String hql11 = "from TCartSeatConfigEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartSeatConfigEntity> tCartSeatConfigOldList = this.tCartService.findHql(hql11,id11);
				    if(tCartSeatConfigOldList!=null && tCartSeatConfigOldList.size()>0){
				    	page.setTCartSeatConfigEntity(tCartSeatConfigOldList.get(0));
				    }
				    String hql12 = "from TCartMultimediaConfigEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartMultimediaConfigEntity> tCartMultimediaConfigOldList = this.tCartService.findHql(hql12,id12);
				    if(tCartMultimediaConfigOldList!=null && tCartMultimediaConfigOldList.size()>0){
				    	page.setTCartMultimediaConfigEntity(tCartMultimediaConfigOldList.get(0));
				    }
				    String hql13 = "from TCartLightConfigEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartLightConfigEntity> tCartLightConfigOldList = this.tCartService.findHql(hql13,id13);
				    if(tCartLightConfigOldList!=null && tCartLightConfigOldList.size()>0){
				    	page.setTCartLightConfigEntity(tCartLightConfigOldList.get(0));
				    }
				    String hql14 = "from TCartGlassRearviewMirrorEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartGlassRearviewMirrorEntity> tCartGlassRearviewMirrorOldList = this.tCartService.findHql(hql14,id14);
				    if(tCartGlassRearviewMirrorOldList!=null && tCartGlassRearviewMirrorOldList.size()>0){
				    	page.setTCartGlassRearviewMirrorEntity(tCartGlassRearviewMirrorOldList.get(0));
				    }
				    String hql15 = "from TCartAirRefrigeratorEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartAirRefrigeratorEntity> tCartAirRefrigeratorOldList = this.tCartService.findHql(hql15,id15);
				    if(tCartAirRefrigeratorOldList!=null && tCartAirRefrigeratorOldList.size()>0){
				    	page.setTCartAirRefrigeratorEntity(tCartAirRefrigeratorOldList.get(0));
				    }
				    String hql16 = "from TCartHighTechConfigEntity where 1 = 1 AND cartId = ? ";
	    			List<TCartHighTechConfigEntity> tCartHighTechConfigOldList = this.tCartService.findHql(hql16,id16);
				    if(tCartHighTechConfigOldList!=null && tCartHighTechConfigOldList.size()>0){
				    	page.setTCartHighTechConfigEntity(tCartHighTechConfigOldList.get(0));
				    }
            		pageList.add(page);
            	}catch(Exception e){
            		logger.info(e.getMessage());
            	}
            }
        }
		return Result.success(pageList);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value="根据ID获取车辆信息表信息",notes="根据ID获取车辆信息表信息",httpMethod="GET",produces="application/json")
	public ResponseMessage<?> get(@ApiParam(required=true,name="id",value="ID")@PathVariable("id") String id) {
		TCartEntity task = tCartService.get(TCartEntity.class, id);
		if (task == null) {
			return Result.error("根据ID获取车辆信息表信息为空");
		}
		TCartPage page = new TCartPage();
		try {
			MyBeanUtils.copyBeanNotNull2Bean(task, page);
				Object id0 = task.getId();
				Object id1 = task.getId();
				Object id2 = task.getId();
				Object id3 = task.getId();
				Object id4 = task.getId();
				Object id5 = task.getId();
				Object id6 = task.getId();
				Object id7 = task.getId();
				Object id8 = task.getId();
				Object id9 = task.getId();
				Object id10 = task.getId();
				Object id11 = task.getId();
				Object id12 = task.getId();
				Object id13 = task.getId();
				Object id14 = task.getId();
				Object id15 = task.getId();
				Object id16 = task.getId();
		    String hql0 = "from TCartBannerEntity where 1 = 1 AND cartId = ? ";
			List<TCartBannerEntity> tCartBannerOldList = this.tCartService.findHql(hql0,id0);
		    page.setTCartBannerList(tCartBannerOldList);
			
			
		    String hql1 = "from TCartConfigHightLightEntity where 1 = 1 AND cartId = ? ";
			List<TCartConfigHightLightEntity> tCartConfigHightLightOldList = this.tCartService.findHql(hql1,id1);
		    page.setTCartConfigHightLightList(tCartConfigHightLightOldList);
			
			
		    String hql2 = "from TCartBodyEntity where 1 = 1 AND cartId = ? ";
			List<TCartBodyEntity> tCartBodyOldList = this.tCartService.findHql(hql2,id2);
		    if(tCartBodyOldList!=null && tCartBodyOldList.size()>0){
		    	page.setTCartBodyEntity(tCartBodyOldList.get(0));
		    }
			
			
		    String hql3 = "from TCartEngineEntity where 1 = 1 AND cartId = ? ";
			List<TCartEngineEntity> tCartEngineOldList = this.tCartService.findHql(hql3,id3);
		    if(tCartEngineOldList!=null && tCartEngineOldList.size()>0){
		    	page.setTCartEngineEntity(tCartEngineOldList.get(0));
		    }
			
			
		    String hql4 = "from TCartGearboxEntity where 1 = 1 AND cartId = ? ";
			List<TCartGearboxEntity> tCartGearboxOldList = this.tCartService.findHql(hql4,id4);
		    if(tCartGearboxOldList!=null && tCartGearboxOldList.size()>0){
		    	page.setTCartGearboxEntity(tCartGearboxOldList.get(0));
		    }
			
			
		    String hql5 = "from TCartChassisEntity where 1 = 1 AND cartId = ? ";
			List<TCartChassisEntity> tCartChassisOldList = this.tCartService.findHql(hql5,id5);
		    if(tCartChassisOldList!=null && tCartChassisOldList.size()>0){
		    	page.setTCartChassisEntity(tCartChassisOldList.get(0));
		    }
			
			
		    String hql6 = "from TCartWheelBrakingEntity where 1 = 1 AND cartId = ? ";
			List<TCartWheelBrakingEntity> tCartWheelBrakingOldList = this.tCartService.findHql(hql6,id6);
		    if(tCartWheelBrakingOldList!=null && tCartWheelBrakingOldList.size()>0){
		    	page.setTCartWheelBrakingEntity(tCartWheelBrakingOldList.get(0));
		    }
			
			
		    String hql7 = "from TCartSafeEntity where 1 = 1 AND cartId = ? ";
			List<TCartSafeEntity> tCartSafeOldList = this.tCartService.findHql(hql7,id7);
		    if(tCartSafeOldList!=null && tCartSafeOldList.size()>0){
		    	page.setTCartSafeEntity(tCartSafeOldList.get(0));
		    }
			
			
		    String hql8 = "from TCartManipulationEntity where 1 = 1 AND cartId = ? ";
			List<TCartManipulationEntity> tCartManipulationOldList = this.tCartService.findHql(hql8,id8);
		    if(tCartManipulationOldList!=null && tCartManipulationOldList.size()>0){
		    	page.setTCartManipulationEntity(tCartManipulationOldList.get(0));
		    }
			
			
		    String hql9 = "from TCartExternalConfigEntity where 1 = 1 AND cartId = ? ";
			List<TCartExternalConfigEntity> tCartExternalConfigOldList = this.tCartService.findHql(hql9,id9);
		    if(tCartExternalConfigOldList!=null && tCartExternalConfigOldList.size()>0){
		    	page.setTCartExternalConfigEntity(tCartExternalConfigOldList.get(0));
		    }
			
			
		    String hql10 = "from TCartInterConfigEntity where 1 = 1 AND cartId = ? ";
			List<TCartInterConfigEntity> tCartInterConfigOldList = this.tCartService.findHql(hql10,id10);
		    if(tCartInterConfigOldList!=null && tCartInterConfigOldList.size()>0){
		    	page.setTCartInterConfigEntity(tCartInterConfigOldList.get(0));
		    }
			
			
		    String hql11 = "from TCartSeatConfigEntity where 1 = 1 AND cartId = ? ";
			List<TCartSeatConfigEntity> tCartSeatConfigOldList = this.tCartService.findHql(hql11,id11);
		    if(tCartSeatConfigOldList!=null && tCartSeatConfigOldList.size()>0){
		    	page.setTCartSeatConfigEntity(tCartSeatConfigOldList.get(0));
		    }
			
			
		    String hql12 = "from TCartMultimediaConfigEntity where 1 = 1 AND cartId = ? ";
			List<TCartMultimediaConfigEntity> tCartMultimediaConfigOldList = this.tCartService.findHql(hql12,id12);
		    if(tCartMultimediaConfigOldList!=null && tCartMultimediaConfigOldList.size()>0){
		    	page.setTCartMultimediaConfigEntity(tCartMultimediaConfigOldList.get(0));
		    }
			
			
		    String hql13 = "from TCartLightConfigEntity where 1 = 1 AND cartId = ? ";
			List<TCartLightConfigEntity> tCartLightConfigOldList = this.tCartService.findHql(hql13,id13);
		    if(tCartLightConfigOldList!=null && tCartLightConfigOldList.size()>0){
		    	page.setTCartLightConfigEntity(tCartLightConfigOldList.get(0));
		    }
			
			
		    String hql14 = "from TCartGlassRearviewMirrorEntity where 1 = 1 AND cartId = ? ";
			List<TCartGlassRearviewMirrorEntity> tCartGlassRearviewMirrorOldList = this.tCartService.findHql(hql14,id14);
		    if(tCartGlassRearviewMirrorOldList!=null && tCartGlassRearviewMirrorOldList.size()>0){
		    	page.setTCartGlassRearviewMirrorEntity(tCartGlassRearviewMirrorOldList.get(0));
		    }
			
			
		    String hql15 = "from TCartAirRefrigeratorEntity where 1 = 1 AND cartId = ? ";
			List<TCartAirRefrigeratorEntity> tCartAirRefrigeratorOldList = this.tCartService.findHql(hql15,id15);
		    if(tCartAirRefrigeratorOldList!=null && tCartAirRefrigeratorOldList.size()>0){
		    	page.setTCartAirRefrigeratorEntity(tCartAirRefrigeratorOldList.get(0));
		    }
			
			
		    String hql16 = "from TCartHighTechConfigEntity where 1 = 1 AND cartId = ? ";
			List<TCartHighTechConfigEntity> tCartHighTechConfigOldList = this.tCartService.findHql(hql16,id16);
		    if(tCartHighTechConfigOldList!=null && tCartHighTechConfigOldList.size()>0){
		    	page.setTCartHighTechConfigEntity(tCartHighTechConfigOldList.get(0));
		    }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Result.success(page);
	}
 	
 	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="创建车辆信息表")
	public ResponseMessage<?> create(@ApiParam(name="车辆信息表对象")@RequestBody TCartPage tCartPage, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TCartPage>> failures = validator.validate(tCartPage);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}
		try{
			tCartService.addMain(tCartPage);
		}catch(Exception e){
            logger.info(e.getMessage());
            return Result.error("保存车辆信息表失败");
        }
		return Result.success();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@ApiOperation(value="更新车辆信息表",notes="更新车辆信息表")
	public ResponseMessage<?> update(@RequestBody TCartPage tCartPage) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<TCartPage>> failures = validator.validate(tCartPage);
		if (!failures.isEmpty()) {
			return Result.error(JSONArray.toJSONString(BeanValidators.extractPropertyAndMessage(failures)));
		}
		try {
			tCartService.updateMain(tCartPage);
		} catch (Exception e) {
			logger.info(e.getMessage());
	        return Result.error("更新车辆信息表失败");
		}
		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return Result.success();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value="删除车辆信息表")
	public ResponseMessage<?> delete(@ApiParam(name="id",value="ID",required=true)@PathVariable("id") String id) {
		logger.info("delete[{}]" + id);
		// 验证
		if (StringUtils.isEmpty(id)) {
			return Result.error("ID不能为空");
		}
		try {
			TCartEntity tCart = tCartService.get(TCartEntity.class, id);
			tCartService.delMain(tCart);
		} catch (Exception e) {
			e.printStackTrace();
			return Result.error("车辆信息表删除失败");
		}

		return Result.success();
	}
	
}
