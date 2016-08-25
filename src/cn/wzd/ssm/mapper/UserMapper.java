package cn.wzd.ssm.mapper;

import cn.wzd.ssm.po.User;

public interface UserMapper {
	
	//使用user的id查询user表
	public User findUserById( int id ) throws Exception;

}
