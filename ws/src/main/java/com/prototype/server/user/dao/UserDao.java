package com.prototype.server.user.dao;

import com.prototype.server.user.entity.User;

public interface UserDao {

    User findByUserName(String username);

}