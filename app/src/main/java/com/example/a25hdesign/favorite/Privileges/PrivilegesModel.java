package com.example.a25hdesign.favorite.Privileges;

public class PrivilegesModel {
    private int logoPrivileges;
    private String status;
    private String title;
    private String category;
    private String desc;

    public PrivilegesModel(int logoPrivileges, String status, String title, String category, String desc) {
        this.logoPrivileges = logoPrivileges;
        this.status = status;
        this.title = title;
        this.category = category;
        this.desc = desc;
    }

    public int getLogoPrivileges() {
        return logoPrivileges;
    }

    public void setLogoPrivileges(int logoPrivileges) {
        this.logoPrivileges = logoPrivileges;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
