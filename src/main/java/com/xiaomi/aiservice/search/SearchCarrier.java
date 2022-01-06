package com.xiaomi.aiservice.search;

import java.io.Serializable;

import com.google.gson.JsonObject;

/**
 * @author wanglingda@xiaomi.com
 */

public class SearchCarrier implements Serializable {

  protected JsonObject schObj;

  public JsonObject getSchObj() {
    return schObj;
  }

  public void setSchObj(JsonObject schObj) {
    this.schObj = schObj;
  }

  @Override
  public String toString() {
    return "SearchCarrier{" +
           "schObj=" + schObj +
           '}';
  }
}
