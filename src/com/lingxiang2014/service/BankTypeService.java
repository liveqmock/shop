
package com.lingxiang2014.service;

import com.lingxiang2014.entity.BankType;

public interface BankTypeService extends BaseService<BankType, Long> {
    boolean usernameExists(String fullName);
}