package com.data.provider;

import java.util.Date;

public class Provider {
    private Integer id;
    private String name;
    private Date createdDate;
    private Boolean active;
    private Integer userId;


    public Provider() {
    }

    public Provider(int id, String name, Date createdDate, Boolean active, Integer userId) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.active = active;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


}
