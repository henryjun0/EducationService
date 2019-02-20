package com.xuecheng.api.config.cms;

import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;

/**
 * @author WindJunn
 * @date 2019/2/19 22:35
 */
public interface CmsPageControllerApi {

    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);
}
