package com.ktdsuniversity.edu.ods.bbs.vo;

import java.util.Date;

public class BoardVO {
    private Long id;
    private String subject;
    private String content;
    private String email;        
    private Integer viewCnt;
    private Date crtDt;
    private Date mdfyDt;
    private String fileName;
    private String originFileName;
    
    
    
    

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getViewCnt() {
        return this.viewCnt;
    }
    public void setViewCnt(Integer viewCnt) {
        this.viewCnt = viewCnt;
    }
    public Date getCrtDt() {
        return this.crtDt;
    }
    public void setCrtDt(Date crtDt) {
        this.crtDt = crtDt;
    }
    public Date getMdfyDt() {
        return this.mdfyDt;
    }
    public void setMdfyDt(Date mdfyDt) {
        this.mdfyDt = mdfyDt;
    }
    public String getFileName() {
        return this.fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getOriginFileName() {
        return this.originFileName;
    }
    public void setOriginFileName(String originFileName) {
        this.originFileName = originFileName;
    }
}