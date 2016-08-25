package cn.wzd.ssm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.wzd.ssm.dao.UserDao;
import cn.wzd.ssm.po.User;

public class UserDaoImpl implements UserDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	//通过id获取user对象
	@Override
	public User findUserById( int id ) throws Exception{
		SqlSession session = sqlSessionFactory.openSession();
		
		User user = session.selectOne("cn.wzd.ssm.mapper.UserMapper.findUserById", id);
		
		session.close();
		
		return user;
	}

}
