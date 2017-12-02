package com.example.it.travel_plan_project;

/**
 * Created by Lee on 2017-12-02.
 */

public class Travel_Plan_Information {
    private String userid;
    private String start;
    private String destination;
    private String start_date;
    private String finish_date;
    private String rooms;
    private String course;

    public Travel_Plan_Information(String userid, String start, String destination, String start_date, String finish_date, String rooms, String course) {
        this.userid = userid;
        this.start = start;
        this.destination = destination;
        this.start_date = start_date;
        this.finish_date = finish_date;
        this.rooms = rooms;
        this.course = course;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(String finish_date) {
        this.finish_date = finish_date;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}