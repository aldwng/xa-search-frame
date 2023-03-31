package net.xa.sf.frame.query;

import net.xa.sf.frame.search.SearchCarrier;

/**
 * @author aldwang
 */

public interface CheckFacade {

  SearchCarrier check(RichQuery richQuery, SearchCarrier carrier);
}
