/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.lingxiang2014.dao.impl;

import javax.persistence.FlushModeType;

import org.springframework.stereotype.Repository;

import com.lingxiang2014.dao.LogDao;
import com.lingxiang2014.entity.Log;

@Repository("logDaoImpl")
public class LogDaoImpl extends BaseDaoImpl<Log, Long> implements LogDao {

	public void removeAll() {
		String jpql = "delete from Log log";
		entityManager.createQuery(jpql).setFlushMode(FlushModeType.COMMIT).executeUpdate();
	}

}