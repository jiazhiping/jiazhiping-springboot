package cn.com.sinosoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication()
@MapperScan({"cn.com.sinosoft.mapper"})
public class JiazhipingApplication {

	public static void main(String[] args) {

		SpringApplication.run(JiazhipingApplication.class, args);

	}

}
