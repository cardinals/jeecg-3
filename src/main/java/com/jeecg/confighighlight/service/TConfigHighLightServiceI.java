package com.jeecg.confighighlight.service;
import com.jeecg.confighighlight.entity.TConfigHighLightEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TConfigHighLightServiceI extends CommonService{
	
 	public void delete(TConfigHighLightEntity entity) throws Exception;
 	
 	public Serializable save(TConfigHighLightEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TConfigHighLightEntity entity) throws Exception;
 	
}
