package cn.com.sinosoft.jiazhiping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title: jiazhiping
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2019-05-10 15:43
 * @Author: 贾治平
 * @Version: 1.0
 **/

public class webTest {

    @Resource
    private Environment environment;

    @RequestMapping("/hello")
    public String index(){
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("url"));
        return "Hello Spring Boot";
    }

    @Value("${name}")
    private String name;

    @Value("${url}")
    private String url;
}
