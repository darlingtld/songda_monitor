package com.songda.service;

import com.songda.dao.UsersDao;
import com.songda.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by tangld on 2015/6/18.
 */
@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    @Transactional
    public List<Users> getAll() {
        return usersDao.getAll();
    }
}
