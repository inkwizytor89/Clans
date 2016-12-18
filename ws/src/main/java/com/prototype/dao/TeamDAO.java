package com.prototype.dao;

import com.prototype.entity.Team;

public interface TeamDAO {
    Team findMembersforTeam(Integer teamId);
}
