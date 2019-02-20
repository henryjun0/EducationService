package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author WindJunn
 * @date 2019/2/20 09:37
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
