package net.xa.sf.frame.search.rank;

import net.xa.sf.frame.query.RichQuery;
import net.xa.sf.frame.search.SearchCarrier;
import net.xa.sf.frame.search.SearchResult;

/**
 * @author aldwang
 */

public class DefaultRankModel implements RankModel {

  @Override
  public SearchResult rank(RichQuery richQuery, SearchCarrier carrier, SearchResult result) {
    return result;
  }
}
