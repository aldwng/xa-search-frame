package net.xa.sf.frame.utils;

import net.xa.sf.frame.search.SearchResult;
import net.xa.sf.frame.search.ErrCode;

/**
 * @author aldwang
 */

public class EmptyResults {

  public static final SearchResult EMPTY_OK = new SearchResult(ErrCode.OK);
  public static final SearchResult EMPTY_WRONG_PARAMETERS = new SearchResult(ErrCode.WRONG_PARAMETERS);
  public static final SearchResult EMPTY_SERVER_WRONG = new SearchResult(ErrCode.SERVER_WRONG);
  public static final SearchResult EMPTY_NONE = new SearchResult(ErrCode.NONE);
  public static final SearchResult EMPTY_INTERNAL_FAILURE = new SearchResult(ErrCode.INTERNAL_FAILURE);
}
