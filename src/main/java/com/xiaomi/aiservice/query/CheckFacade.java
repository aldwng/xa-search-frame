package com.xiaomi.aiservice.query;

import com.xiaomi.aiservice.search.SearchCarrier;

/**
 * @author wanglingda@xiaomi.com
 */

public interface CheckFacade {

  SearchCarrier check(RichQuery richQuery, SearchCarrier carrier);
}
