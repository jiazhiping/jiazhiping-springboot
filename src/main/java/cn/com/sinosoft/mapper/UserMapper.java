package cn.com.sinosoft.mapper;

import cn.com.sinosoft.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Title: jiazhiping
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2019-05-10 17:01
 * @Author: 贾治平
 * @Version: 1.0
 **/
@Mapper
public interface UserMapper {
    @Select("select * from user where name like '%${value}%'")
    public List<User> queryUserByName(String name);
}
