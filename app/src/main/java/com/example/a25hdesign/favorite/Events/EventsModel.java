package com.example.a25hdesign.favorite.Events;

public class EventsModel {
    private int eventLogo;
    private String status;
    private String eventName;
    private String desc;
    private String eventDateTime;

    public EventsModel(int eventLogo, String status, String eventName, String desc, String eventDateTime) {
        this.eventLogo = eventLogo;
        this.status = status;
        this.eventName = eventName;
        this.desc = desc;
        this.eventDateTime = eventDateTime;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public int getEventLogo() {
        return eventLogo;
    }

    public void setEventLogo(int eventLogo) {
        this.eventLogo = eventLogo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
