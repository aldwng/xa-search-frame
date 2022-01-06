package com.xiaomi.aiservice.utils;

import static com.xiaomi.aiservice.search.ErrCode.NONE;
import static com.xiaomi.aiservice.search.ErrCode.OK;
import static com.xiaomi.aiservice.search.ErrCode.SERVER_WRONG;
import static com.xiaomi.aiservice.search.ErrCode.WRONG_PARAMETERS;

import com.xiaomi.aiservice.search.SearchResult;

/**
 * @author wanglingda@xiaomi.com
 */

public class EmptyResults {

  public static final SearchResult EMPTY_OK = new SearchResult(OK);
  public static final SearchResult EMPTY_WRONG_PARAMETERS = new SearchResult(WRONG_PARAMETERS);
  public static final SearchResult EMPTY_SERVER_WRONG = new SearchResult(SERVER_WRONG);
  public static final SearchResult EMPTY_NONE = new SearchResult(NONE);
}
