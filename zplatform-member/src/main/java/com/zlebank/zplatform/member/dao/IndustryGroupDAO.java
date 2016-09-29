/* 
 * IndustryGroupDAO.java  
 * 
 * version TODO
 *
 * 2016年9月28日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.member.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zlebank.zplatform.commons.dao.BaseDAO;
import com.zlebank.zplatform.member.bean.IndustryGroupBean;
import com.zlebank.zplatform.member.bean.IndustryGroupQuery;
import com.zlebank.zplatform.member.pojo.PojoIndustryGroup;

/**
 * 行业群组Dao
 *
 * @author houyong
 * @version
 * @date 2016年9月28日 上午9:27:33
 * @since 
 */
public interface IndustryGroupDAO extends BaseDAO<PojoIndustryGroup> {

    /**
     * @param groupBean
     * @return
     */
    PojoIndustryGroup getByCode(IndustryGroupBean groupBean);

    /**
     * 查询群组
     * @param queryBean
     * @return
     */
    List<PojoIndustryGroup> queryGroup(IndustryGroupQuery queryBean);
        
}
