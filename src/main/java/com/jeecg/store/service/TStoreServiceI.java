package com.jeecg.store.service;
import com.jeecg.store.entity.TStoreEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TStoreServiceI extends CommonService{
	
 	public void delete(TStoreEntity entity) throws Exception;
 	
 	public Serializable save(TStoreEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TStoreEntity entity) throws Exception;
 	
}
