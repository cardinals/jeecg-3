package com.jeecg.cart.service.impl;
import com.jeecg.cart.entity.*;
import com.jeecg.cart.service.TCartServiceI;
import com.jeecg.confighighlight.entity.TConfigHighLightEntity;
import com.jeecg.confighighlight.service.TConfigHighLightServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.cart.page.TCartPage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.jeecgframework.core.common.exception.BusinessException;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import org.jeecgframework.core.util.MyBeanUtils;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.core.util.oConvertUtils;
import java.util.ArrayList;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;
import java.util.Map;
import java.util.HashMap;
import org.jeecgframework.minidao.util.FreemarkerParseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.jeecgframework.core.util.ResourceUtil;

@Service("tCartService")
@Transactional
public class TCartServiceImpl extends CommonServiceImpl implements TCartServiceI {
	@Autowired
	private TConfigHighLightServiceI configHighLightServiceI;
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
 	public void delete(TCartEntity entity) throws Exception{
 		super.delete(entity);
 	}
	
	public void addMain(TCartPage tCartPage) throws Exception {
		TCartEntity tCart = new TCartEntity();
		MyBeanUtils.copyBeanNotNull2Bean(tCartPage, tCart);
		//保存主信息
		this.save(tCart);
		/**保存-实拍图*/
		List<TCartBannerEntity> tCartBannerList = tCartPage.getTCartBannerList();
		for(TCartBannerEntity tCartBanner:tCartBannerList){
			//外键设置
			tCartBanner.setCartId(tCart.getId());
			this.save(tCartBanner);
		}
		/**保存-配置亮点*/
		List<TCartConfigHightLightEntity> tCartConfigHightLightList = tCartPage.getTCartConfigHightLightList();
		for(TCartConfigHightLightEntity tCartConfigHightLight:tCartConfigHightLightList){
			//外键设置
			tCartConfigHightLight.setCartId(tCart.getId());
			TConfigHighLightEntity tConfigHighLightEntity = this.configHighLightServiceI.get(TConfigHighLightEntity.class,tCartConfigHightLight.getConfigHightLightId());
			if(tConfigHighLightEntity!=null){
				tCartConfigHightLight.setName(tConfigHighLightEntity.getName());
				tCartConfigHightLight.setIcon(tConfigHighLightEntity.getIcon());
			}
			this.save(tCartConfigHightLight);
		}
		/**保存-车身配置*/
		TCartBodyEntity tCartBody = tCartPage.getTCartBodyEntity();
		//外键设置
		tCartBody.setCartId(tCart.getId());
		this.save(tCartBody);
		/**保存-发动机配置*/
		TCartEngineEntity tCartEngine = tCartPage.getTCartEngineEntity();
		//外键设置
		tCartEngine.setCartId(tCart.getId());
		this.save(tCartEngine);
		/**保存-变速箱配置*/
		TCartGearboxEntity tCartGearbox = tCartPage.getTCartGearboxEntity();
		//外键设置
		tCartGearbox.setCartId(tCart.getId());
		this.save(tCartGearbox);
		/**保存-底盘配置*/
		TCartChassisEntity tCartChassis = tCartPage.getTCartChassisEntity();
		//外键设置
		tCartChassis.setCartId(tCart.getId());
		this.save(tCartChassis);
		/**保存-车轮制动配置*/
		TCartWheelBrakingEntity tCartWheelBraking = tCartPage.getTCartWheelBrakingEntity();
		//外键设置
		tCartWheelBraking.setCartId(tCart.getId());
		this.save(tCartWheelBraking);
		/**保存-安全装备*/
		TCartSafeEntity tCartSafe = tCartPage.getTCartSafeEntity();
		//外键设置
		tCartSafe.setCartId(tCart.getId());
		this.save(tCartSafe);
		/**保存-操控配置*/
		TCartManipulationEntity tCartManipulation = tCartPage.getTCartManipulationEntity();
		//外键设置
		tCartManipulation.setCartId(tCart.getId());
		this.save(tCartManipulation);
		/**保存-外部配置*/
		TCartExternalConfigEntity tCartExternalConfig = tCartPage.getTCartExternalConfigEntity();
		//外键设置
		tCartExternalConfig.setCartId(tCart.getId());
		this.save(tCartExternalConfig);
		/**保存-内部配置*/
		TCartInterConfigEntity tCartInterConfig = tCartPage.getTCartInterConfigEntity();
		//外键设置
		tCartInterConfig.setCartId(tCart.getId());
		this.save(tCartInterConfig);
		/**保存-座椅配置*/
		TCartSeatConfigEntity tCartSeatConfig = tCartPage.getTCartSeatConfigEntity();
		//外键设置
		tCartSeatConfig.setCartId(tCart.getId());
		this.save(tCartSeatConfig);
		/**保存-多媒体配置*/
		TCartMultimediaConfigEntity tCartMultimediaConfig = tCartPage.getTCartMultimediaConfigEntity();
		//外键设置
		tCartMultimediaConfig.setCartId(tCart.getId());
		this.save(tCartMultimediaConfig);
		/**保存-灯光配置*/
		TCartLightConfigEntity tCartLightConfig = tCartPage.getTCartLightConfigEntity();
		//外键设置
		tCartLightConfig.setCartId(tCart.getId());
		this.save(tCartLightConfig);
		/**保存-玻璃/后视镜配置*/
		TCartGlassRearviewMirrorEntity tCartGlassRearviewMirror = tCartPage.getTCartGlassRearviewMirrorEntity();
		//外键设置
		tCartGlassRearviewMirror.setCartId(tCart.getId());
		this.save(tCartGlassRearviewMirror);
		/**保存-空调/冰箱配置*/
		TCartAirRefrigeratorEntity tCartAirRefrigerator = tCartPage.getTCartAirRefrigeratorEntity();
		//外键设置
		tCartAirRefrigerator.setCartId(tCart.getId());
		this.save(tCartAirRefrigerator);
		/**保存-高科技配置*/
		TCartHighTechConfigEntity tCartHighTechConfig = tCartPage.getTCartHighTechConfigEntity();
		//外键设置
		tCartHighTechConfig.setCartId(tCart.getId());
		this.save(tCartHighTechConfig);
	}

	
	public void updateMain(TCartPage tCartPage) throws Exception{
		TCartEntity tCart = new TCartEntity();
		//保存主表信息
		if(StringUtil.isNotEmpty(tCartPage.getId())){
			tCart = findUniqueByProperty(TCartEntity.class, "id", tCartPage.getId());
			MyBeanUtils.copyBeanNotNull2Bean(tCartPage, tCart);
			this.saveOrUpdate(tCart);
		}else{
			this.saveOrUpdate(tCart);
		}
		//===================================================================================
		//获取参数
		Object id0 = tCart.getId();
		Object id1 = tCart.getId();
		Object id2 = tCart.getId();
		Object id3 = tCart.getId();
		Object id4 = tCart.getId();
		Object id5 = tCart.getId();
		Object id6 = tCart.getId();
		Object id7 = tCart.getId();
		Object id8 = tCart.getId();
		Object id9 = tCart.getId();
		Object id10 = tCart.getId();
		Object id11 = tCart.getId();
		Object id12 = tCart.getId();
		Object id13 = tCart.getId();
		Object id14 = tCart.getId();
		Object id15 = tCart.getId();
		Object id16 = tCart.getId();
		//===================================================================================
		//1.实拍图数据库的数据
	    String hql0 = "from TCartBannerEntity where 1 = 1 AND cartId = ? ";
	    List<TCartBannerEntity> tCartBannerOldList = this.findHql(hql0,id0);
		//2.实拍图新的数据
		List<TCartBannerEntity> tCartBannerList = tCartPage.getTCartBannerList();
	    //3.筛选更新明细数据-实拍图
		if(tCartBannerList!=null &&tCartBannerList.size()>0){
			for(TCartBannerEntity oldE:tCartBannerOldList){
				boolean isUpdate = false;
				for(TCartBannerEntity sendE:tCartBannerList){
					//需要更新的明细数据-实拍图
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-实拍图
		    		super.delete(oldE);
	    		}
	    		
			}
			//4.持久化新增的数据-实拍图
			for(TCartBannerEntity tCartBanner:tCartBannerList){
				if(oConvertUtils.isEmpty(tCartBanner.getId())){
					//外键设置
					tCartBanner.setCartId(tCart.getId());
					this.save(tCartBanner);
				}
			}
		}
		//===================================================================================
		//1.配置亮点数据库的数据
	    String hql1 = "from TCartConfigHightLightEntity where 1 = 1 AND cartId = ? ";
	    List<TCartConfigHightLightEntity> tCartConfigHightLightOldList = this.findHql(hql1,id1);
		//2.配置亮点新的数据
		List<TCartConfigHightLightEntity> tCartConfigHightLightList = tCartPage.getTCartConfigHightLightList();
	    //3.筛选更新明细数据-配置亮点
		if(tCartConfigHightLightList!=null &&tCartConfigHightLightList.size()>0){
			for(TCartConfigHightLightEntity oldE:tCartConfigHightLightOldList){
				boolean isUpdate = false;
				for(TCartConfigHightLightEntity sendE:tCartConfigHightLightList){
					//需要更新的明细数据-配置亮点
					if(oldE.getId().equals(sendE.getId())){
		    			try {
							MyBeanUtils.copyBeanNotNull2Bean(sendE,oldE);
							this.saveOrUpdate(oldE);
						} catch (Exception e) {
							e.printStackTrace();
							throw new BusinessException(e.getMessage());
						}
						isUpdate= true;
		    			break;
		    		}
		    	}
	    		if(!isUpdate){
		    		//如果数据库存在的明细，前台没有传递过来则是删除-配置亮点
		    		super.delete(oldE);
	    		}
	    		
			}
			//4.持久化新增的数据-配置亮点
			for(TCartConfigHightLightEntity tCartConfigHightLight:tCartConfigHightLightList){
				if(oConvertUtils.isEmpty(tCartConfigHightLight.getId())){
					//外键设置
					tCartConfigHightLight.setCartId(tCart.getId());
					TConfigHighLightEntity tConfigHighLightEntity = this.configHighLightServiceI.get(TConfigHighLightEntity.class,tCartConfigHightLight.getConfigHightLightId());
					if(tConfigHighLightEntity!=null){
						tCartConfigHightLight.setName(tConfigHighLightEntity.getName());
						tCartConfigHightLight.setIcon(tConfigHighLightEntity.getIcon());
					}
					this.save(tCartConfigHightLight);
				}
			}
		}
		//===================================================================================
		//1.车身配置数据库的数据
	    String hql2 = "from TCartBodyEntity where 1 = 1 AND cartId = ? ";
	    List<TCartBodyEntity> tCartBodyOldList = this.findHql(hql2,id2);
		//2.车身配置新的数据
		TCartBodyEntity tCartBody = tCartPage.getTCartBodyEntity();
		if(tCartBody!=null){
			if(tCartBodyOldList!=null && tCartBodyOldList.size()>0){
				TCartBodyEntity tCartBodyTemp =  tCartBodyOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartBody,tCartBodyTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartBody.setCartId(tCart.getId());
				this.save(tCartBody);
			}
		}
		//===================================================================================
		//1.发动机配置数据库的数据
	    String hql3 = "from TCartEngineEntity where 1 = 1 AND cartId = ? ";
	    List<TCartEngineEntity> tCartEngineOldList = this.findHql(hql3,id3);
		//2.发动机配置新的数据
		TCartEngineEntity tCartEngine = tCartPage.getTCartEngineEntity();
		if(tCartEngine!=null){
			if(tCartEngineOldList!=null && tCartEngineOldList.size()>0){
				TCartEngineEntity tCartEngineTemp =  tCartEngineOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartEngine,tCartEngineTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartEngine.setCartId(tCart.getId());
				this.save(tCartEngine);
			}
		}
		//===================================================================================
		//1.变速箱配置数据库的数据
	    String hql4 = "from TCartGearboxEntity where 1 = 1 AND cartId = ? ";
	    List<TCartGearboxEntity> tCartGearboxOldList = this.findHql(hql4,id4);
		//2.变速箱配置新的数据
		TCartGearboxEntity tCartGearbox = tCartPage.getTCartGearboxEntity();
		if(tCartGearbox!=null){
			if(tCartGearboxOldList!=null && tCartGearboxOldList.size()>0){
				TCartGearboxEntity tCartGearboxTemp =  tCartGearboxOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartGearbox,tCartGearboxTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartGearbox.setCartId(tCart.getId());
				this.save(tCartGearbox);
			}
		}
		//===================================================================================
		//1.底盘配置数据库的数据
	    String hql5 = "from TCartChassisEntity where 1 = 1 AND cartId = ? ";
	    List<TCartChassisEntity> tCartChassisOldList = this.findHql(hql5,id5);
		//2.底盘配置新的数据
		TCartChassisEntity tCartChassis = tCartPage.getTCartChassisEntity();
		if(tCartChassis!=null){
			if(tCartChassisOldList!=null && tCartChassisOldList.size()>0){
				TCartChassisEntity tCartChassisTemp =  tCartChassisOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartChassis,tCartChassisTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartChassis.setCartId(tCart.getId());
				this.save(tCartChassis);
			}
		}
		//===================================================================================
		//1.车轮制动配置数据库的数据
	    String hql6 = "from TCartWheelBrakingEntity where 1 = 1 AND cartId = ? ";
	    List<TCartWheelBrakingEntity> tCartWheelBrakingOldList = this.findHql(hql6,id6);
		//2.车轮制动配置新的数据
		TCartWheelBrakingEntity tCartWheelBraking = tCartPage.getTCartWheelBrakingEntity();
		if(tCartWheelBraking!=null){
			if(tCartWheelBrakingOldList!=null && tCartWheelBrakingOldList.size()>0){
				TCartWheelBrakingEntity tCartWheelBrakingTemp =  tCartWheelBrakingOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartWheelBraking,tCartWheelBrakingTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartWheelBraking.setCartId(tCart.getId());
				this.save(tCartWheelBraking);
			}
		}
		//===================================================================================
		//1.安全装备数据库的数据
	    String hql7 = "from TCartSafeEntity where 1 = 1 AND cartId = ? ";
	    List<TCartSafeEntity> tCartSafeOldList = this.findHql(hql7,id7);
		//2.安全装备新的数据
		TCartSafeEntity tCartSafe = tCartPage.getTCartSafeEntity();
		if(tCartSafe!=null){
			if(tCartSafeOldList!=null && tCartSafeOldList.size()>0){
				TCartSafeEntity tCartSafeTemp =  tCartSafeOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartSafe,tCartSafeTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartSafe.setCartId(tCart.getId());
				this.save(tCartSafe);
			}
		}
		//===================================================================================
		//1.操控配置数据库的数据
	    String hql8 = "from TCartManipulationEntity where 1 = 1 AND cartId = ? ";
	    List<TCartManipulationEntity> tCartManipulationOldList = this.findHql(hql8,id8);
		//2.操控配置新的数据
		TCartManipulationEntity tCartManipulation = tCartPage.getTCartManipulationEntity();
		if(tCartManipulation!=null){
			if(tCartManipulationOldList!=null && tCartManipulationOldList.size()>0){
				TCartManipulationEntity tCartManipulationTemp =  tCartManipulationOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartManipulation,tCartManipulationTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartManipulation.setCartId(tCart.getId());
				this.save(tCartManipulation);
			}
		}
		//===================================================================================
		//1.外部配置数据库的数据
	    String hql9 = "from TCartExternalConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartExternalConfigEntity> tCartExternalConfigOldList = this.findHql(hql9,id9);
		//2.外部配置新的数据
		TCartExternalConfigEntity tCartExternalConfig = tCartPage.getTCartExternalConfigEntity();
		if(tCartExternalConfig!=null){
			if(tCartExternalConfigOldList!=null && tCartExternalConfigOldList.size()>0){
				TCartExternalConfigEntity tCartExternalConfigTemp =  tCartExternalConfigOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartExternalConfig,tCartExternalConfigTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartExternalConfig.setCartId(tCart.getId());
				this.save(tCartExternalConfig);
			}
		}
		//===================================================================================
		//1.内部配置数据库的数据
	    String hql10 = "from TCartInterConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartInterConfigEntity> tCartInterConfigOldList = this.findHql(hql10,id10);
		//2.内部配置新的数据
		TCartInterConfigEntity tCartInterConfig = tCartPage.getTCartInterConfigEntity();
		if(tCartInterConfig!=null){
			if(tCartInterConfigOldList!=null && tCartInterConfigOldList.size()>0){
				TCartInterConfigEntity tCartInterConfigTemp =  tCartInterConfigOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartInterConfig,tCartInterConfigTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartInterConfig.setCartId(tCart.getId());
				this.save(tCartInterConfig);
			}
		}
		//===================================================================================
		//1.座椅配置数据库的数据
	    String hql11 = "from TCartSeatConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartSeatConfigEntity> tCartSeatConfigOldList = this.findHql(hql11,id11);
		//2.座椅配置新的数据
		TCartSeatConfigEntity tCartSeatConfig = tCartPage.getTCartSeatConfigEntity();
		if(tCartSeatConfig!=null){
			if(tCartSeatConfigOldList!=null && tCartSeatConfigOldList.size()>0){
				TCartSeatConfigEntity tCartSeatConfigTemp =  tCartSeatConfigOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartSeatConfig,tCartSeatConfigTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartSeatConfig.setCartId(tCart.getId());
				this.save(tCartSeatConfig);
			}
		}
		//===================================================================================
		//1.多媒体配置数据库的数据
	    String hql12 = "from TCartMultimediaConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartMultimediaConfigEntity> tCartMultimediaConfigOldList = this.findHql(hql12,id12);
		//2.多媒体配置新的数据
		TCartMultimediaConfigEntity tCartMultimediaConfig = tCartPage.getTCartMultimediaConfigEntity();
		if(tCartMultimediaConfig!=null){
			if(tCartMultimediaConfigOldList!=null && tCartMultimediaConfigOldList.size()>0){
				TCartMultimediaConfigEntity tCartMultimediaConfigTemp =  tCartMultimediaConfigOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartMultimediaConfig,tCartMultimediaConfigTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartMultimediaConfig.setCartId(tCart.getId());
				this.save(tCartMultimediaConfig);
			}
		}
		//===================================================================================
		//1.灯光配置数据库的数据
	    String hql13 = "from TCartLightConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartLightConfigEntity> tCartLightConfigOldList = this.findHql(hql13,id13);
		//2.灯光配置新的数据
		TCartLightConfigEntity tCartLightConfig = tCartPage.getTCartLightConfigEntity();
		if(tCartLightConfig!=null){
			if(tCartLightConfigOldList!=null && tCartLightConfigOldList.size()>0){
				TCartLightConfigEntity tCartLightConfigTemp =  tCartLightConfigOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartLightConfig,tCartLightConfigTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartLightConfig.setCartId(tCart.getId());
				this.save(tCartLightConfig);
			}
		}
		//===================================================================================
		//1.玻璃/后视镜配置数据库的数据
	    String hql14 = "from TCartGlassRearviewMirrorEntity where 1 = 1 AND cartId = ? ";
	    List<TCartGlassRearviewMirrorEntity> tCartGlassRearviewMirrorOldList = this.findHql(hql14,id14);
		//2.玻璃/后视镜配置新的数据
		TCartGlassRearviewMirrorEntity tCartGlassRearviewMirror = tCartPage.getTCartGlassRearviewMirrorEntity();
		if(tCartGlassRearviewMirror!=null){
			if(tCartGlassRearviewMirrorOldList!=null && tCartGlassRearviewMirrorOldList.size()>0){
				TCartGlassRearviewMirrorEntity tCartGlassRearviewMirrorTemp =  tCartGlassRearviewMirrorOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartGlassRearviewMirror,tCartGlassRearviewMirrorTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartGlassRearviewMirror.setCartId(tCart.getId());
				this.save(tCartGlassRearviewMirror);
			}
		}
		//===================================================================================
		//1.空调/冰箱配置数据库的数据
	    String hql15 = "from TCartAirRefrigeratorEntity where 1 = 1 AND cartId = ? ";
	    List<TCartAirRefrigeratorEntity> tCartAirRefrigeratorOldList = this.findHql(hql15,id15);
		//2.空调/冰箱配置新的数据
		TCartAirRefrigeratorEntity tCartAirRefrigerator = tCartPage.getTCartAirRefrigeratorEntity();
		if(tCartAirRefrigerator!=null){
			if(tCartAirRefrigeratorOldList!=null && tCartAirRefrigeratorOldList.size()>0){
				TCartAirRefrigeratorEntity tCartAirRefrigeratorTemp =  tCartAirRefrigeratorOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartAirRefrigerator,tCartAirRefrigeratorTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartAirRefrigerator.setCartId(tCart.getId());
				this.save(tCartAirRefrigerator);
			}
		}
		//===================================================================================
		//1.高科技配置数据库的数据
	    String hql16 = "from TCartHighTechConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartHighTechConfigEntity> tCartHighTechConfigOldList = this.findHql(hql16,id16);
		//2.高科技配置新的数据
		TCartHighTechConfigEntity tCartHighTechConfig = tCartPage.getTCartHighTechConfigEntity();
		if(tCartHighTechConfig!=null){
			if(tCartHighTechConfigOldList!=null && tCartHighTechConfigOldList.size()>0){
				TCartHighTechConfigEntity tCartHighTechConfigTemp =  tCartHighTechConfigOldList.get(0);
					MyBeanUtils.copyBeanNotNull2Bean(tCartHighTechConfig,tCartHighTechConfigTemp);
					this.saveOrUpdate(tCart);
			}else{
				//外键设置
				tCartHighTechConfig.setCartId(tCart.getId());
				this.save(tCartHighTechConfig);
			}
		}
	}

	
	public void delMain(TCartEntity tCart) throws Exception{
		//删除主表信息
		this.delete(tCart);
		//===================================================================================
		//获取参数
		Object id0 = tCart.getId();
		Object id1 = tCart.getId();
		Object id2 = tCart.getId();
		Object id3 = tCart.getId();
		Object id4 = tCart.getId();
		Object id5 = tCart.getId();
		Object id6 = tCart.getId();
		Object id7 = tCart.getId();
		Object id8 = tCart.getId();
		Object id9 = tCart.getId();
		Object id10 = tCart.getId();
		Object id11 = tCart.getId();
		Object id12 = tCart.getId();
		Object id13 = tCart.getId();
		Object id14 = tCart.getId();
		Object id15 = tCart.getId();
		Object id16 = tCart.getId();
		//===================================================================================
		//删除-实拍图
	    String hql0 = "from TCartBannerEntity where 1 = 1 AND cartId = ? ";
	    List<TCartBannerEntity> tCartBannerOldList = this.findHql(hql0,id0);
		this.deleteAllEntitie(tCartBannerOldList);
		//===================================================================================
		//删除-配置亮点
	    String hql1 = "from TCartConfigHightLightEntity where 1 = 1 AND cartId = ? ";
	    List<TCartConfigHightLightEntity> tCartConfigHightLightOldList = this.findHql(hql1,id1);
		this.deleteAllEntitie(tCartConfigHightLightOldList);
		//===================================================================================
		//删除-车身配置
	    String hql2 = "from TCartBodyEntity where 1 = 1 AND cartId = ? ";
	    List<TCartBodyEntity> tCartBodyOldList = this.findHql(hql2,id2);
		this.deleteAllEntitie(tCartBodyOldList);
		//===================================================================================
		//删除-发动机配置
	    String hql3 = "from TCartEngineEntity where 1 = 1 AND cartId = ? ";
	    List<TCartEngineEntity> tCartEngineOldList = this.findHql(hql3,id3);
		this.deleteAllEntitie(tCartEngineOldList);
		//===================================================================================
		//删除-变速箱配置
	    String hql4 = "from TCartGearboxEntity where 1 = 1 AND cartId = ? ";
	    List<TCartGearboxEntity> tCartGearboxOldList = this.findHql(hql4,id4);
		this.deleteAllEntitie(tCartGearboxOldList);
		//===================================================================================
		//删除-底盘配置
	    String hql5 = "from TCartChassisEntity where 1 = 1 AND cartId = ? ";
	    List<TCartChassisEntity> tCartChassisOldList = this.findHql(hql5,id5);
		this.deleteAllEntitie(tCartChassisOldList);
		//===================================================================================
		//删除-车轮制动配置
	    String hql6 = "from TCartWheelBrakingEntity where 1 = 1 AND cartId = ? ";
	    List<TCartWheelBrakingEntity> tCartWheelBrakingOldList = this.findHql(hql6,id6);
		this.deleteAllEntitie(tCartWheelBrakingOldList);
		//===================================================================================
		//删除-安全装备
	    String hql7 = "from TCartSafeEntity where 1 = 1 AND cartId = ? ";
	    List<TCartSafeEntity> tCartSafeOldList = this.findHql(hql7,id7);
		this.deleteAllEntitie(tCartSafeOldList);
		//===================================================================================
		//删除-操控配置
	    String hql8 = "from TCartManipulationEntity where 1 = 1 AND cartId = ? ";
	    List<TCartManipulationEntity> tCartManipulationOldList = this.findHql(hql8,id8);
		this.deleteAllEntitie(tCartManipulationOldList);
		//===================================================================================
		//删除-外部配置
	    String hql9 = "from TCartExternalConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartExternalConfigEntity> tCartExternalConfigOldList = this.findHql(hql9,id9);
		this.deleteAllEntitie(tCartExternalConfigOldList);
		//===================================================================================
		//删除-内部配置
	    String hql10 = "from TCartInterConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartInterConfigEntity> tCartInterConfigOldList = this.findHql(hql10,id10);
		this.deleteAllEntitie(tCartInterConfigOldList);
		//===================================================================================
		//删除-座椅配置
	    String hql11 = "from TCartSeatConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartSeatConfigEntity> tCartSeatConfigOldList = this.findHql(hql11,id11);
		this.deleteAllEntitie(tCartSeatConfigOldList);
		//===================================================================================
		//删除-多媒体配置
	    String hql12 = "from TCartMultimediaConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartMultimediaConfigEntity> tCartMultimediaConfigOldList = this.findHql(hql12,id12);
		this.deleteAllEntitie(tCartMultimediaConfigOldList);
		//===================================================================================
		//删除-灯光配置
	    String hql13 = "from TCartLightConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartLightConfigEntity> tCartLightConfigOldList = this.findHql(hql13,id13);
		this.deleteAllEntitie(tCartLightConfigOldList);
		//===================================================================================
		//删除-玻璃/后视镜配置
	    String hql14 = "from TCartGlassRearviewMirrorEntity where 1 = 1 AND cartId = ? ";
	    List<TCartGlassRearviewMirrorEntity> tCartGlassRearviewMirrorOldList = this.findHql(hql14,id14);
		this.deleteAllEntitie(tCartGlassRearviewMirrorOldList);
		//===================================================================================
		//删除-空调/冰箱配置
	    String hql15 = "from TCartAirRefrigeratorEntity where 1 = 1 AND cartId = ? ";
	    List<TCartAirRefrigeratorEntity> tCartAirRefrigeratorOldList = this.findHql(hql15,id15);
		this.deleteAllEntitie(tCartAirRefrigeratorOldList);
		//===================================================================================
		//删除-高科技配置
	    String hql16 = "from TCartHighTechConfigEntity where 1 = 1 AND cartId = ? ";
	    List<TCartHighTechConfigEntity> tCartHighTechConfigOldList = this.findHql(hql16,id16);
		this.deleteAllEntitie(tCartHighTechConfigOldList);
	}
	
 	
}