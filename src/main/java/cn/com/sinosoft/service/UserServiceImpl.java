package cn.com.sinosoft.service;

import cn.com.sinosoft.pojo.User;
import cn.com.sinosoft.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: jiazhiping
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2019-05-10 17:05
 * @Author: 贾治平
 * @Version: 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserByName(String name) {
        List<User> users = userMapper.queryUserByName(name);
        return users;
    }
}
