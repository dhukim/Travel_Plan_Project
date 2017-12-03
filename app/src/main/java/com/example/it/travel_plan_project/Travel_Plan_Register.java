package com.example.it.travel_plan_project;

/**
 * Created by Lee on 2017-12-03.
 */

public class Travel_Plan_Register {
    private String userid;
    private String passwd;

    public Travel_Plan_Register(String userid, String passwd) {
        this.userid = userid;
        this.passwd = passwd;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
