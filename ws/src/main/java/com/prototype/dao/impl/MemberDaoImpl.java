package com.prototype.dao.impl;

import com.prototype.dao.MemberDao;
import com.prototype.entity.Member;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class MemberDaoImpl implements MemberDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Member> findMembersforTeam(Integer teamId) {
        List<Member> members = sessionFactory.getCurrentSession()
                .createQuery("from Member where team_id=?")
                .setParameter(0,teamId)
                .list();
        return members;
    }
}
