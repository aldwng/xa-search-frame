package com.xiaomi.aiservice.query;

import java.util.Map;

/**
 * @author wanglingda@xiaomi.com
 */

public class RichQuery {

  protected String uid;
  protected String maskUid;
  protected String requestId;
  protected String appId;
  protected int offset;
  protected int length;

  protected String sessionId;
  protected long requestTime;

  protected Map<String, String> params;

  protected boolean valid;

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getMaskUid() {
    return maskUid;
  }

  public void setMaskUid(String maskUid) {
    this.maskUid = maskUid;
  }

  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public long getRequestTime() {
    return requestTime;
  }

  public void setRequestTime(long requestTime) {
    this.requestTime = requestTime;
  }

  public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  public boolean isValid() {
    return valid;
  }

  public void setValid(boolean valid) {
    this.valid = valid;
  }

  @Override
  public String toString() {
    return "RichQuery{" +
           "uid='" + uid + '\'' +
           ", maskUid='" + maskUid + '\'' +
           ", requestId='" + requestId + '\'' +
           ", appId='" + appId + '\'' +
           ", offset=" + offset +
           ", length=" + length +
           ", sessionId='" + sessionId + '\'' +
           ", requestTime=" + requestTime +
           ", params=" + params +
           '}';
  }
}
