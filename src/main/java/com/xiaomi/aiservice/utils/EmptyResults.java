package com.xiaomi.aiservice.utils;

import com.xiaomi.aiservice.search.SearchResult;

import static com.xiaomi.aiservice.search.ErrCode.*;

/**
 * @author wanglingda@xiaomi.com
 */

public class EmptyResults {

  public static final SearchResult EMPTY_OK = new SearchResult(OK);
  public static final SearchResult EMPTY_WRONG_PARAMETERS = new SearchResult(WRONG_PARAMETERS);
  public static final SearchResult EMPTY_SERVER_WRONG = new SearchResult(SERVER_WRONG);
  public static final SearchResult EMPTY_NONE = new SearchResult(NONE);
  public static final SearchResult EMPTY_INTERNAL_FAILURE = new SearchResult(INTERNAL_FAILURE);
}
