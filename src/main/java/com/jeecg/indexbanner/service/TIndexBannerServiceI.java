package com.jeecg.indexbanner.service;
import com.jeecg.indexbanner.entity.TIndexBannerEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TIndexBannerServiceI extends CommonService{
	
 	public void delete(TIndexBannerEntity entity) throws Exception;
 	
 	public Serializable save(TIndexBannerEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TIndexBannerEntity entity) throws Exception;
 	
}
