package com.nhnent.spring;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// TODO: 7. Mybatis DAO
@Repository
public class PlayerDao {
    private static final String NAMESPACE = "playerDao.";


    @Autowired
    SqlSessionTemplate sqlSessionTemplate;


    public Player selectPlayer(long id) {
        return sqlSessionTemplate.selectOne(NAMESPACE + "selectPlayer", id);
    }

}
