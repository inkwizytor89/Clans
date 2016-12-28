package com.prototype.dao.impl;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.List;

import com.prototype.dao.UserDao;
import com.prototype.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

//    @SuppressWarnings("unchecked")
//    public User findByUserName(String login) {
//
//        List<User> users = sessionFactory.getCurrentSession()
//                .createQuery("from User where login=?")
//                .setParameter(0, login)
//                .list();
//
//        if (users.size() > 0) {
//            return users.get(0);
//        } else {
//            return null;
//        }
//
//    }

    @SuppressWarnings("unchecked")
    public Boolean login(String login, String password) {

        Boolean accept = sessionFactory.getCurrentSession()
                .doReturningWork(connection -> {
                    try (CallableStatement function = connection.prepareCall(
                            "{ ? = call check_password(?, ?) }" )) {
                        function.registerOutParameter(1, Types.BOOLEAN);
                        function.setString(2, login);
                        function.setString(3, password);
                        function.execute();
                        return function.getBoolean(1);
                    }
                } );

        return accept;
    }

}
