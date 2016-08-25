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

	/**
	 * 
	 * @Title: testFindUserById 
	 * @Description: 测试mybatis和spring 整合后，使用MapperScannerConfigurer的方式获取mapper代理类。 
	 * @param @throws Exception    设定文件 
	 * @return void    返回类型 
	 * @throws
	 */
	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) this.ctx.getBean("fuckUserMapper");
		
		User user = userMapper.findUserById(3);
		
		System.out.println(user);
	}
}
