package com.example.demo.model;

import lombok.Data;

import java.util.Date;

@Data
public class Info {
    private long oid;
    private String oname;
    private Date otime;
    private String oaddress;
    private User user;

    public Info() {

    }

    public Info(long oid, String oname, Date otime, String oaddress, User user) {
        this.oid = oid;
        this.oname = oname;
        this.otime = otime;
        this.oaddress = oaddress;
        this.user = user;
    }
}
