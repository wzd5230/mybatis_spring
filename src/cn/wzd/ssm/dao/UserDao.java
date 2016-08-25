package cn.wzd.ssm.dao;

import cn.wzd.ssm.po.User;

public interface UserDao {
	
	//通过id获取user对象
	public User findUserById( int id ) throws Exception;

}
