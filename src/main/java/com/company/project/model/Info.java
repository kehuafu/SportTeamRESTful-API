package com.company.project.model;

import javax.persistence.*;

public class Info {
    @Id
    @Column(name = "OrdeID")
    private Integer ordeid;

    @Column(name = "openId")
    private String openid;

    @Column(name = "MyWechat")
    private String mywechat;

    @Column(name = "State")
    private Integer state;

    @Column(name = "MyTeam")
    private String myteam;

    @Column(name = "OpposingTeam")
    private String opposingteam;

    @Column(name = "OpposingWechat")
    private String opposingwechat;

    @Column(name = "StratTime")
    private String strattime;

    @Column(name = "EndTime")
    private String endtime;

    /**
     * @return OrdeID
     */
    public Integer getOrdeid() {
        return ordeid;
    }

    /**
     * @param ordeid
     */
    public void setOrdeid(Integer ordeid) {
        this.ordeid = ordeid;
    }

    /**
     * @return openId
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * @return MyWechat
     */
    public String getMywechat() {
        return mywechat;
    }

    /**
     * @param mywechat
     */
    public void setMywechat(String mywechat) {
        this.mywechat = mywechat;
    }

    /**
     * @return State
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return MyTeam
     */
    public String getMyteam() {
        return myteam;
    }

    /**
     * @param myteam
     */
    public void setMyteam(String myteam) {
        this.myteam = myteam;
    }

    /**
     * @return OpposingTeam
     */
    public String getOpposingteam() {
        return opposingteam;
    }

    /**
     * @param opposingteam
     */
    public void setOpposingteam(String opposingteam) {
        this.opposingteam = opposingteam;
    }

    /**
     * @return OpposingWechat
     */
    public String getOpposingwechat() {
        return opposingwechat;
    }

    /**
     * @param opposingwechat
     */
    public void setOpposingwechat(String opposingwechat) {
        this.opposingwechat = opposingwechat;
    }

    /**
     * @return StratTime
     */
    public String getStrattime() {
        return strattime;
    }

    /**
     * @param strattime
     */
    public void setStrattime(String strattime) {
        this.strattime = strattime;
    }

    /**
     * @return EndTime
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }
}