package com.jjl.Dao;

import com.jjl.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoMapperImpl implements UserDaoMapper{
    private SqlSessionTemplate sqlsession;
    public void setSqlsession(SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }
    //之前是用sqlseesion 现在是用sqlsessiontemplate
    @Override
    public User getUserById(int id) {
        UserDaoMapper mapper = sqlsession.getMapper(UserDaoMapper.class);
        return mapper.getUserById(id);
    }

    @Override
    public int adduser(User user) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
