/* 
 * EnterpriseRealnameApplyService.java  
 * 
 * version TODO
 *
 * 2016年8月22日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.service;

import com.zlebank.zplatform.commons.service.IBasePageService;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameBean;
import com.zlebank.zplatform.member.bean.EnterpriseRealNameQueryBean;
import com.zlebank.zplatform.member.pojo.PojoEnterpriseRealnameApply;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年8月22日 上午10:46:34
 * @since 
 */
public interface EnterpriseRealnameApplyService extends IBasePageService<EnterpriseRealNameQueryBean, EnterpriseRealNameBean>{

	/**
	 * 保存实名认证申请
	 * @param enterpriseRealnameApply
	 */
	public void saveEnterpriseRealnameApply(PojoEnterpriseRealnameApply enterpriseRealnameApply);
	
	/**
	 * 通过
	 * @param tn
	 * @return
	 */
	public PojoEnterpriseRealnameApply getDetaByTN(String tn);
	
	/**
	 * 更新企业实名认证申请状态
	 * @param enterpriseRealnameApply
	 */
	public void updateApplyStatus(PojoEnterpriseRealnameApply enterpriseRealnameApply);
	
	/**
	 * 通过主键获取实名认证数据
	 * @param tid
	 * @return
	 */
	public PojoEnterpriseRealnameApply get(Long tid);
	
	//public PagedResult<EnterpriseRealNameBean> queryEnterpriseRealNameApply(int pageSize,int page,EnterpriseRealNameQueryBean queryBean);
}
