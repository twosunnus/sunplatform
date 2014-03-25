/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.sunnus.sunplatform.repository;

import com.sunnus.sunplatform.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, Long> {

    User findByLoginName(String loginName);
}
