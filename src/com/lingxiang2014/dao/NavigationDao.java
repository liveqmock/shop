/*
 * Copyright 2005-2013 shopxx.net. All rights reserved.
 * Support: http://www.shopxx.net
 * License: http://www.shopxx.net/license
 */
package com.lingxiang2014.dao;

import java.util.List;

import com.lingxiang2014.entity.Navigation;
import com.lingxiang2014.entity.Navigation.Position;

public interface NavigationDao extends BaseDao<Navigation, Long> {

	List<Navigation> findList(Position position);

}