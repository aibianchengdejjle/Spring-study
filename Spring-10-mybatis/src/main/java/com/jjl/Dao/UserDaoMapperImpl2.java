package com.jjl.Dao;

import com.jjl.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoMapperImpl2 extends SqlSessionDaoSupport implements UserDaoMapper {
    @Override
    public User getUserById(int id) {
        User user1=new User(5,"jjlljj","123456");
        SqlSession sqlSession = getSqlSession();
        UserDaoMapper mapper = sqlSession.getMapper(UserDaoMapper.class);
        mapper.adduser(user1);
        mapper.delete(6);
        return mapper.getUserById(id);
    }

    @Override
    public int adduser(User user) {
        return getSqlSession().getMapper(UserDaoMapper.class).adduser(user);
    }

    @Override
    public int delete(int id) {
        return  getSqlSession().getMapper(UserDaoMapper.class).delete(1);
    }
}
