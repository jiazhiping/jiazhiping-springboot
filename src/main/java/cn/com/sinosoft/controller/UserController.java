package cn.com.sinosoft.controller;

import cn.com.sinosoft.pojo.User;
import cn.com.sinosoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Title: jiazhiping
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2019-05-10 17:11
 * @Author: 贾治平
 * @Version: 1.0
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list/{name}")
    public List<User> queryUserbyName(@PathVariable String name){
        List<User> users = userService.queryUserByName(name);
        return users;
    }
}
