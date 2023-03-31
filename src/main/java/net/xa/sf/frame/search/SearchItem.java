package net.xa.sf.frame.search;

import java.io.Serializable;

/**
 * @author aldwang
 */

public class SearchItem implements Serializable {

  protected String cp;
  protected String cpId;
  protected long audioId;

  protected String tags;

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getCpId() {
    return cpId;
  }

  public void setCpId(String cpId) {
    this.cpId = cpId;
  }

  public long getAudioId() {
    return audioId;
  }

  public void setAudioId(long audioId) {
    this.audioId = audioId;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }
}
