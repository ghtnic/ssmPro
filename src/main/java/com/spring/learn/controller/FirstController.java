package com.spring.learn.controller;

import com.spring.learn.model.User;
import com.spring.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by baiguantao on 2017/5/22.
 */
@Controller
public class FirstController {
    @Autowired
    UserService userService;
    @RequestMapping("index")
    public String index(ModelMap map){
        User user=userService.getUserById("1");
        System.out.println(user.getUserName());
        map.put("user",user);
        return "test";
    }

    @RequestMapping("regist")
    public String Regist(ModelMap modelMap, @ModelAttribute("form")User user){
        userService.insert(user);
        System.out.println(user);
        return "login";
    }

    @RequestMapping("login")
    public String Login(@RequestParam("userId") String userId,@RequestParam("password") String password,ModelMap map){
        User user = userService.getUserById(userId);
        if (user.getPassword().equals(password)){
            return "redirect:/list.action";
        }
        else {
            return "error";
        }
    }
    @RequestMapping("list")
    public void List() throws SQLException {
        List<User> list = userService.findAll();
        System.out.println(list);
    }

}
