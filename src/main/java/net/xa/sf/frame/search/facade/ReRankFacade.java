package net.xa.sf.frame.search.facade;

import net.xa.sf.frame.query.RichQuery;
import net.xa.sf.frame.search.SearchCarrier;
import net.xa.sf.frame.search.SearchResult;

/**
 * @author aldwang
 */

public interface ReRankFacade {

  SearchResult reRank(RichQuery richQuery, SearchCarrier carrier, SearchResult result);
}
