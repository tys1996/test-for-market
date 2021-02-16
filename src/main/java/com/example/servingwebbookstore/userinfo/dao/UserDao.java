package com.example.servingwebbookstore.userinfo.dao;

import org.apache.ibatis.annotations.Mapper;
import com.example.servingwebbookstore.userinfo.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {

    List<UserEntity> getdata(@Param("content")Map map); //dao层数据库查到后返回给实现类，通过mapper里的sql语句查

    public UserEntity dataByid(Integer userid);

    public void updatePSW(UserEntity userEntity);


}
