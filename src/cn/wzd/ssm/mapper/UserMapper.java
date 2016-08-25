package cn.wzd.ssm.mapper;

import org.springframework.stereotype.Component;

import cn.wzd.ssm.po.User;

//默认bean的id为类名的首字母小写，也可以在注解中设置注解中的value值。这里就指定bean的id为fuckUserMapper
@Component("fuckUserMapper")
public interface UserMapper {
	
	//使用user的id查询user表
	public User findUserById( int id ) throws Exception;

}
