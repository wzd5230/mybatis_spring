package cn.wzd.ssm.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.wzd.ssm.dao.UserDao;
import cn.wzd.ssm.po.User;

public class UserDaoTest {
	
	@Test
	public void testFindUserById() throws Exception{
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		UserDao userDao = (UserDao)ctx.getBean("userDaoImpl");
		
		User user = userDao.findUserById(3);
		
		System.out.println(user);
	}

}
