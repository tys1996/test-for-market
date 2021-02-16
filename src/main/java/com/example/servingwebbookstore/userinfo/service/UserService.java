package com.example.servingwebbookstore.userinfo.service;

import com.example.servingwebbookstore.userinfo.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<UserEntity> getdata(Map map); //接口，接收到map，实体类去实现

    public UserEntity dataByid(Integer userid);

    public void updatePSW(@RequestBody UserEntity userEntity);


}
