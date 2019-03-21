package com.jeecg.indexlogo.service;
import com.jeecg.indexlogo.entity.TIndexLogoEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TIndexLogoServiceI extends CommonService{
	
 	public void delete(TIndexLogoEntity entity) throws Exception;
 	
 	public Serializable save(TIndexLogoEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TIndexLogoEntity entity) throws Exception;
 	
}
