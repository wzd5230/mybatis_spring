package cn.wzd.ssm.test.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzd.ssm.mapper.UserMapper;
import cn.wzd.ssm.po.User;

public class UserMapperTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() {
		this.ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) this.ctx.getBean("userMapper");
		
		User user = userMapper.findUserById(3);
		
		System.out.println(user);
	}
}
