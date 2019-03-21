package com.jeecg.userhelpsell.service;
import com.jeecg.userhelpsell.entity.TUserHelpSellEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TUserHelpSellServiceI extends CommonService{
	
 	public void delete(TUserHelpSellEntity entity) throws Exception;
 	
 	public Serializable save(TUserHelpSellEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TUserHelpSellEntity entity) throws Exception;
 	
}
