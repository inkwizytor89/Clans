package com.prototype.dao;


import com.prototype.entity.Member;

import java.util.List;

public interface MemberDao {

    List<Member> findMembersforTeam(Integer teamId);
}
