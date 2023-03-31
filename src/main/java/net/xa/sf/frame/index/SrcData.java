package net.xa.sf.frame.index;

import java.io.Serializable;

/**
 * @author aldwang
 */

public class SrcData implements Serializable {

  protected String id;
  protected String cpId;
  protected String cp;
  protected long audioId;

  protected float rank;
  protected String tags;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCpId() {
    return cpId;
  }

  public void setCpId(String cpId) {
    this.cpId = cpId;
  }

  public String getCp() {
    return cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public long getAudioId() {
    return audioId;
  }

  public void setAudioId(long audioId) {
    this.audioId = audioId;
  }

  public float getRank() {
    return rank;
  }

  public void setRank(float rank) {
    this.rank = rank;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }
}
