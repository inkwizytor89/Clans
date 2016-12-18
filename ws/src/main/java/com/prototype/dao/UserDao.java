package com.prototype.dao;

import com.prototype.entity.User;

public interface UserDao {

    User findByUserName(String username);

    String getPlayerDetails(Integer userId);
}