package com.prototype.dao.impl;

import com.prototype.dao.TeamDAO;
import com.prototype.entity.Team;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Repository
public class TeamDAOImpl implements TeamDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Team findMembersforTeam(Integer teamId) {

        List<Team> teams = new ArrayList<Team>();

        teams = sessionFactory.getCurrentSession()
                .createQuery("from Team where id=?")
                .setParameter(0, teamId)
                .list();

        if (teams.size() > 0) {
            return teams.get(0);
        } else {
            return null;
        }
    }
}
