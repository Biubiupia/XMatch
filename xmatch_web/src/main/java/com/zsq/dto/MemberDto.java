package com.zsq.dto;

/**
 * Created by ${wyy} on 2017/11/12/012.
 */
public class MemberDto {

    private long depMemberId;
    private long depId;
    private long userId;
    //入部状态 1 申请中 2 部门正式成员 3 退休成员
    private int state;
    private long joinTime;
    /**在部门里的角色 */
    private String role;

    //用户相关
    private String username;
    /**
     * 性别
     */
    private int sex;
    /**
     * 学院
     */
    private String college;
    /**
     * 手机号  0 未绑定 1 绑定
     */
    private int bindPhone;
    /**手机号*/
    private String phoneNum;
    /**邮箱, 为 null则未绑定*/
    private String email;

    public long getDepMemberId() {
        return depMemberId;
    }

    public void setDepMemberId(long depMemberId) {
        this.depMemberId = depMemberId;
    }

    public long getDepId() {
        return depId;
    }

    public void setDepId(long depId) {
        this.depId = depId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public long getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(long joinTime) {
        this.joinTime = joinTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(int bindPhone) {
        this.bindPhone = bindPhone;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
