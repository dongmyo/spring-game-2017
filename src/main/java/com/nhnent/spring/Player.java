package com.nhnent.spring;

public class Player {
    private long id;

    private String nick;

    private String ip;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

}
