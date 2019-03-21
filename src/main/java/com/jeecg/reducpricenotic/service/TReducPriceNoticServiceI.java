package com.jeecg.reducpricenotic.service;
import com.jeecg.reducpricenotic.entity.TReducPriceNoticEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TReducPriceNoticServiceI extends CommonService{
	
 	public void delete(TReducPriceNoticEntity entity) throws Exception;
 	
 	public Serializable save(TReducPriceNoticEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TReducPriceNoticEntity entity) throws Exception;
 	
}
