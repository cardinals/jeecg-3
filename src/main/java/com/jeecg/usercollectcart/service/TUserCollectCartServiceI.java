package com.jeecg.usercollectcart.service;
import com.jeecg.usercollectcart.entity.TUserCollectCartEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TUserCollectCartServiceI extends CommonService{
	
 	public void delete(TUserCollectCartEntity entity) throws Exception;
 	
 	public Serializable save(TUserCollectCartEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TUserCollectCartEntity entity) throws Exception;
 	
}
