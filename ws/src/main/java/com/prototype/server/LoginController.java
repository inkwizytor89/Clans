package com.prototype.server;

import com.prototype.dao.UserDao;
import com.prototype.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@RequestParam(value = "login", required = true) String login,
                              @RequestParam(value = "password", required = true) String password) {

        User user = userDao.findByUserName(login);
        return user;

//        if(user == null) {
//            return "Użytkownik "+login+" nie występuje w bazie";
//        }
//
//        if(!user.getPassword().equals(password)) {
//            return "Niepoprawne hasło dla użytkownika "+login;
//        }
//
//        return "Witaj użytkowniku "+login+" o haśle "+password;

    }
}
