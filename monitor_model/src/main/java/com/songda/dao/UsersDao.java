package com.songda.dao;

import com.songda.pojo.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by tangld on 2015/6/18.
 */
@Repository
public class UsersDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("JpaQlInspection")
    public List<Users> getAll() {
        String sql = "from Users";
        return sessionFactory.getCurrentSession().createQuery(sql).list();
    }
}
