package net.xa.sf.frame.search.facade;

import net.xa.sf.frame.query.RichQuery;
import net.xa.sf.frame.search.SearchCarrier;
import net.xa.sf.frame.search.SearchResult;

/**
 * @author aldwang
 */

public interface RankFacade {

  SearchResult preRank(RichQuery richQuery, SearchCarrier searchCarrier, SearchResult searchResult);

  SearchResult rank(RichQuery richQuery, SearchCarrier carrier, SearchResult result);
}
