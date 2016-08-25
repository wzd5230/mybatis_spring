package cn.wzd.ssm.test.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzd.ssm.dao.UserDao;
import cn.wzd.ssm.po.User;

public class UserDaoTest {
	
	private ApplicationContext ctx;
	
	@Before
	public void setUp(){		
		this.ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception{
	
		
		UserDao userDao = (UserDao)this.ctx.getBean("userDaoImpl");
		
		User user = userDao.findUserById(3);
		
		System.out.println(user);
	}

}
