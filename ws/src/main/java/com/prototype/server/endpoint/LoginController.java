package com.prototype.server.endpoint;

import com.prototype.dao.UserDao;
import com.prototype.server.endpoint.request_body.LoginRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Boolean login(@RequestBody LoginRequestBody loginRequestBody) {

        Boolean isAccept = userDao.login(loginRequestBody.getLogin(), loginRequestBody.getPassword());
        return isAccept;
    }
}
