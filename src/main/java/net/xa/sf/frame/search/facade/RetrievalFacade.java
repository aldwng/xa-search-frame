package net.xa.sf.frame.search.facade;

import net.xa.sf.frame.query.RichQuery;
import net.xa.sf.frame.search.SearchCarrier;
import net.xa.sf.frame.search.SearchResult;

/**
 * @author aldwang
 */

public interface RetrievalFacade {

  SearchResult retrieve(RichQuery richQuery, SearchCarrier searchCarrier);
}
