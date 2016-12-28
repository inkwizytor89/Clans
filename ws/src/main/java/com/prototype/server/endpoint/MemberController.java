package com.prototype.server.endpoint;

import com.prototype.dao.MemberDao;
import com.prototype.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberDao memberDao;

    @RequestMapping(value = "/teams", method = RequestMethod.GET)
    public List<Member> team(@RequestParam(value = "team_id", required = true) Integer teamId) {

        return memberDao.findMembersforTeam(teamId);
    }
}
