package com.xiaomi.aiservice.search.rank;

import com.xiaomi.aiservice.query.RichQuery;
import com.xiaomi.aiservice.search.SearchCarrier;
import com.xiaomi.aiservice.search.SearchResult;

/**
 * @author wanglingda@xiaomi.com
 */

public class RankModelImpl implements RankModel {

  @Override
  public SearchResult rank(RichQuery richQuery, SearchCarrier carrier, SearchResult result) {
    return result;
  }
}
