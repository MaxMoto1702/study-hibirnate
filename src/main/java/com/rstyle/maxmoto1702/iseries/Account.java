package com.rstyle.maxmoto1702.iseries;

import java.util.Date;

/**
 * Created by maksim.serebryanskiy on 01.04.2015.
 */
public class Account {

    private Long insnmb;
    private String inscnd;
    private Long insnmbOwn;
    private Date insdth;
    private Integer insloc;

    public Long getInsnmb() {
        return insnmb;
    }

    public void setInsnmb(Long insnmb) {
        this.insnmb = insnmb;
    }

    public String getInscnd() {
        return inscnd;
    }

    public void setInscnd(String inscnd) {
        this.inscnd = inscnd;
    }

    public Long getInsnmbOwn() {
        return insnmbOwn;
    }

    public void setInsnmbOwn(Long insnmbOwn) {
        this.insnmbOwn = insnmbOwn;
    }

    public Date getInsdth() {
        return insdth;
    }

    public void setInsdth(Date insdth) {
        this.insdth = insdth;
    }

    public Integer getInsloc() {
        return insloc;
    }

    public void setInsloc(Integer insloc) {
        this.insloc = insloc;
    }

    @Override
    public String toString() {
        return "Account{" +
                "INSNMB=" + insnmb +
                ", INSCND='" + inscnd + '\'' +
                ", INSNMB_OWN=" + insnmbOwn +
                ", INSDTH=" + insdth +
                ", INSLOC=" + insloc +
                '}';
    }
}
