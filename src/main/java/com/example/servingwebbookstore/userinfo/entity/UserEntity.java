package com.example.servingwebbookstore.userinfo.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

//实体类
public class UserEntity {
    //添加属性，对应数据库表格字段
    private Integer userid;

    private  String username;

    private Integer phone;

    private String password;

    private String rePSWanswer; //修改密码的问题验证答案

    private Byte[] userinmage;  // 头像

    private String address;  // 收货地址

    private Date createtime;

    // 加入构造方法
    public UserEntity() {
    }

    //有参构造生成
    public UserEntity(Integer userid, String username, Integer phone, String password, String rePSWanswer, Byte[] userinmage, String address, Timestamp createtime) {
        this.userid = userid;
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.rePSWanswer = rePSWanswer;
        this.userinmage = userinmage;
        this.address = address;
        this.createtime = createtime;
    }

    //生成get set方法
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePSWanswer() {
        return rePSWanswer;
    }

    public void setRePSWanswer(String rePSWanswer) {
        this.rePSWanswer = rePSWanswer;
    }

    public Byte[] getUserinmage() {
        return userinmage;
    }

    public void setUserinmage(Byte[] userinmage) {
        this.userinmage = userinmage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    //生成tostring()方法
    @Override
    public String toString() {
        return "UserEntity{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                ", rePSWanswer='" + rePSWanswer + '\'' +
                ", userinmage=" + Arrays.toString(userinmage) +
                ", address='" + address + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
