package cn.com.sinosoft.service;

import cn.com.sinosoft.pojo.User;

import java.util.List;

/**
 * @Title: jiazhiping
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2019-05-10 17:04
 * @Author: 贾治平
 * @Version: 1.0
 **/
public interface UserService {

    List<User> queryUserByName(String name);
}
