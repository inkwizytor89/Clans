package com.prototype.server;

import com.prototype.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerDetailsController {


    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/player_details", method = RequestMethod.GET)
    public String getPlayerDetails(@RequestParam(value = "user_id", required = true) Integer userId) {

        return userDao.getPlayerDetails(userId);
    }
}
