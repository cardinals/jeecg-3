package com.jeecg.cart.service;
import com.jeecg.cart.entity.TCartEntity;
import com.jeecg.cart.page.TCartPage;

import java.util.List;
import org.jeecgframework.core.common.service.CommonService;
import java.io.Serializable;

public interface TCartServiceI extends CommonService{
 	public void delete(TCartEntity entity) throws Exception;
	/**
	 * 添加一对多
	 * 
	 */
	public void addMain(TCartPage tCartPage) throws Exception;
	        
	/**
	 * 修改一对多
	 * 
	 */
	public void updateMain(TCartPage tCartPage) throws Exception;
	
	/**
	 * 删除一对多
	 * 
	 */
	public void delMain(TCartEntity tCart) throws Exception;
}
