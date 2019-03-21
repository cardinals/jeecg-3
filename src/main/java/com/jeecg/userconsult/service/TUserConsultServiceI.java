package com.jeecg.userconsult.service;
import com.jeecg.userconsult.entity.TUserConsultEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TUserConsultServiceI extends CommonService{
	
 	public void delete(TUserConsultEntity entity) throws Exception;
 	
 	public Serializable save(TUserConsultEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TUserConsultEntity entity) throws Exception;
 	
}
