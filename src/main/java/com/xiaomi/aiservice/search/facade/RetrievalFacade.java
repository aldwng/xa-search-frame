package com.xiaomi.aiservice.search.facade;

import com.xiaomi.aiservice.query.RichQuery;
import com.xiaomi.aiservice.search.SearchCarrier;
import com.xiaomi.aiservice.search.SearchResult;

/**
 * @author wanglingda@xiaomi.com
 */

public interface RetrievalFacade {

  SearchResult retrieve(RichQuery richQuery, SearchCarrier searchCarrier);
}
