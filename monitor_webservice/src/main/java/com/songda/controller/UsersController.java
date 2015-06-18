package com.songda.controller;

import com.songda.pojo.Users;
import com.songda.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by tangld on 2015/6/18.
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public
    @ResponseBody
    List<Users> getAll() {
        return usersService.getAll();
    }
}
