package com.example.servingwebbookstore.userinfo.service;

import com.example.servingwebbookstore.userinfo.dao.UserDao;
import com.example.servingwebbookstore.userinfo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

//用来实现userservice，实现类的注解service
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<UserEntity> getdata(Map map){
        //实现类
        return userDao.getdata(map); //接收到map给dao层的map，让他去执行。dao负责数据的操作，dao层返回后，再返给controller
    }

    @Override
    public UserEntity dataByid(Integer userid) {
        return userDao.dataByid(userid);
    }

    @Override
    public void updatePSW(UserEntity userEntity) {
        //控制dao层操作数据库
        userDao.updatePSW(userEntity);
    }
}
