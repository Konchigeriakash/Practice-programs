package com.ecommerce.project.Controller.Model;

public class Category {
    private Long catid;
    private String catname;

    public Category(Long catid, String catname) {
        this.catid = catid;
        this.catname = catname;
    }

    public Long getCatid() {
        return catid;
    }

    public void setCatid(Long catid) {
        this.catid = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
}
