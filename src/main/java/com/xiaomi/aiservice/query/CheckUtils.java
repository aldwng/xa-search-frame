package com.xiaomi.aiservice.query;

import org.apache.commons.lang3.StringUtils;

/**
 * @author wanglingda@xiaomi.com
 */

public class CheckUtils {

  public static boolean isRealUser(String userId) {
    if (StringUtils.isBlank(userId) || !StringUtils.isNumeric(userId)) {
      return false;
    }
    return Long.parseLong(userId) > 50000;
  }

  public static boolean isIllegal(RichQuery richQuery) {
    if (StringUtils.isBlank(richQuery.getRequestId())) {
      return true;
    }
    if (StringUtils.isBlank(richQuery.getUid()) && StringUtils.isBlank(richQuery.getMaskUid())) {
      return true;
    }
    if (StringUtils.isBlank(richQuery.getAppId())) {
      return true;
    }
    return richQuery.getOffset() < 0 || richQuery.getLength() < 1;
  }
}
