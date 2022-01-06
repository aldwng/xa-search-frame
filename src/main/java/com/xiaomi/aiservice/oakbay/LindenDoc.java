package com.xiaomi.aiservice.oakbay;

import java.io.Serializable;

/**
 * @author wanglingda@xiaomi.com
 */

public class LindenDoc implements Serializable {

  protected String id;
  protected String cp;
  protected String cpId;

  protected String tags;

  protected int status;

  protected float rank;

  protected SrcData _srcData;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public float getRank() {
    return rank;
  }

  public void setRank(float rank) {
    this.rank = rank;
  }

  public SrcData get_srcData() {
    return _srcData;
  }

  public void set_srcData(SrcData _srcData) {
    this._srcData = _srcData;
  }
}
