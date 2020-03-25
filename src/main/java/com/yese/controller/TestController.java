package com.yese.controller;

import com.yese.pojo.User;
import com.yese.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test1")
    @ResponseBody
    public List<User> test1() {
        List<User> users = testService.getUsers();
        return users;
    }

    @GetMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("msg", "测试成功");
        return "test";
    }

}
