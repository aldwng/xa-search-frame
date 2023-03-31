package net.xa.sf.frame.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import static net.xa.sf.frame.search.ErrCode.OK;

/**
 * @author aldwang
 */

public class SearchResult implements Serializable {

  protected ErrCode errorCode;
  protected int hits;
  protected List<SearchItem> items;
  protected boolean isFound;
  protected Map<String, String> extraInfo;

  public SearchResult(ErrCode errCode) {
    this.errorCode = errCode;
    this.hits = 0;
    this.items = new ArrayList<>(1);
    this.isFound = false;
  }

  public SearchResult() {
    this.errorCode = OK;
  }

  public ErrCode getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrCode errorCode) {
    this.errorCode = errorCode;
  }

  public int getHits() {
    return hits;
  }

  public void setHits(int hits) {
    this.hits = hits;
  }

  public List<SearchItem> getItems() {
    return items;
  }

  public void setItems(List<SearchItem> items) {
    this.items = items;
  }

  public boolean isFound() {
    return isFound;
  }

  public void setFound(boolean found) {
    isFound = found;
  }

  public Map<String, String> getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(Map<String, String> extraInfo) {
    this.extraInfo = extraInfo;
  }

  public void putToExtraInfo(String key, String value) {
    if (this.extraInfo == null) {
      this.extraInfo = new HashMap<>();
    }
    this.extraInfo.put(key, value);
  }

  @Override
  public String toString() {
    return "SearchResult{" +
           "errorCode=" + errorCode +
           ", hits=" + hits +
           ", items=" + StringUtils.join(getItems().subList(0, Math.min(getItems().size(), 30)).stream().map(
        Object::toString).collect(
        Collectors.toList()), ",") +
           ", isFound=" + isFound +
           ", extraInfo=" + extraInfo +
           '}';
  }
}
