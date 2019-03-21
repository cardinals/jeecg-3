package com.jeecg.userhelpbug.service;
import com.jeecg.userhelpbug.entity.TUserHelpBuyEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TUserHelpBuyServiceI extends CommonService{
	
 	public void delete(TUserHelpBuyEntity entity) throws Exception;
 	
 	public Serializable save(TUserHelpBuyEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TUserHelpBuyEntity entity) throws Exception;
 	
}
