package com.ktdsuniversity.edu.ods.bbs.vo;

public class MemberVO {
    private String email;
    private String name;
    private String password;
    
    // 일단 테이블 있어서 만들기
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}