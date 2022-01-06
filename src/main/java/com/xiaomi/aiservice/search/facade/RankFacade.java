package com.xiaomi.aiservice.search.facade;

import com.xiaomi.aiservice.query.RichQuery;
import com.xiaomi.aiservice.search.SearchCarrier;
import com.xiaomi.aiservice.search.SearchResult;

/**
 * @author wanglingda@xiaomi.com
 */

public interface RankFacade {

  SearchResult rank(RichQuery richQuery, SearchCarrier carrier, SearchResult result);
}
