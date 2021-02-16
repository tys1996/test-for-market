package com.example.servingwebbookstore.userinfo.controller;

import com.example.servingwebbookstore.userinfo.entity.UserEntity;
import com.example.servingwebbookstore.userinfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

/*
* restcontroller = responsebody+controller
* controller层只管接收和返回数据，不做任何操作
* */

@Controller
@RequestMapping("/userinfo")   //访问路径
public class UserController {

    @Autowired
    UserService userService; // 引用

    //获取数据

    @RequestMapping("/getdata")
    @ResponseBody
    public List<UserEntity> getdata(Map map){
        // 请求发过来得到前端传回的参数map
        return userService.getdata(map); //返回给service接口，调用service的方法。接收到返回后到js的data
    }

    //根据id查询用户信息
    @RequestMapping("/dataByid")
    @ResponseBody
    public UserEntity dataByid(Integer userid){
        return  userService.dataByid(userid);
    }

    //修改密码
    @RequestMapping("/updatePSW")
    @ResponseBody
    public String updatePSW(@RequestBody UserEntity userEntity){
        userService.updatePSW(userEntity);
        return "success";
    }

    //上传头像

}
