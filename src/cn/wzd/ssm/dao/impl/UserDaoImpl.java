package cn.wzd.ssm.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.wzd.ssm.dao.UserDao;
import cn.wzd.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
//	private SqlSessionFactory sqlSessionFactory;
//	
//	public UserDaoImpl(SqlSessionFactory sqlSessionFactory){
//		this.sqlSessionFactory = sqlSessionFactory;
//	}
	
	//通过id获取user对象
	@Override
	public User findUserById( int id ) throws Exception{
		SqlSession session = this.getSqlSession();
		
		User user = session.selectOne("cn.wzd.ssm.mapper.UserMapper.findUserById", id);
		
		/**
		 * Spring 管理 SqlSession后，不允许认为关闭session，Spring会自动关闭SqlSession
		 */
		//session.close();
		
		return user;
	}

}
