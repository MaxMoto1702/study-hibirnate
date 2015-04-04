package com.rstyle.maxmoto1702.iseries;

import java.util.Date;

/**
 * Created by maksim.serebryanskiy on 01.04.2015.
 */
public class Application {
    
    /*
    DPTCOD	4	INTEGER
    DCINMB	3	DECIMAL
    DCIDCK	5	SMALLINT
    DCICPY	5	SMALLINT
    REGNMB	1	CHAR
    REGDAT	91	DATE
    CHSPRS_FAM	1	CHAR
    CHSPRS_NAM	1	CHAR
    CHSPRS_PTR	1	CHAR
    CHSPRS_BRD	91	DATE
    CHSPRS_SEX	1	CHAR
    INSNMB	4	INTEGER
    INSNMB_CHK	5	SMALLINT
    CMPNPFCOD	1	CHAR
    CMPPRFCOD	1	CHAR
    DOCTYP	1	CHAR
    COD_CMPNPF	1	CHAR
    COD_CMPPRF	1	CHAR
    CMPDCL_YER	5	SMALLINT
    PROCDATE	91	DATE
    OPRTYP	1	CHAR
    PRCACM	5	SMALLINT
    REALTYP	1	CHAR
     */
    
    private Integer dptcod;
    private Integer dcinmb;
    private Integer dcidck;
    private Integer dcicpy;
    private String regnmb;
    private Date regdat;
    private String chsprsFam;
    private String chsprsNam;
    private String chsprsPtr;
    private Date chsprsBrd;
    private String chsprsSex;
    private Long insnmb;
    private Integer insnmbChk;
    private String cmpnpfcod;
    private String cmpprfcod;
    private String doctyp;
    private String codCmpnpf;
    private String codCmpprf;
    private Integer cmpdclYer;
    private Date procdate;
    private String oprtyp;
    private Integer prcacm;
    private String realtyp;

    public Integer getDptcod() {
        return dptcod;
    }

    public void setDptcod(Integer dptcod) {
        this.dptcod = dptcod;
    }

    public Integer getDcinmb() {
        return dcinmb;
    }

    public void setDcinmb(Integer dcinmb) {
        this.dcinmb = dcinmb;
    }

    public Integer getDcidck() {
        return dcidck;
    }

    public void setDcidck(Integer dcidck) {
        this.dcidck = dcidck;
    }

    public Integer getDcicpy() {
        return dcicpy;
    }

    public void setDcicpy(Integer dcicpy) {
        this.dcicpy = dcicpy;
    }

    public String getRegnmb() {
        return regnmb;
    }

    public void setRegnmb(String regnmb) {
        this.regnmb = regnmb;
    }

    public Date getRegdat() {
        return regdat;
    }

    public void setRegdat(Date regdat) {
        this.regdat = regdat;
    }

    public String getChsprsFam() {
        return chsprsFam;
    }

    public void setChsprsFam(String chsprsFam) {
        this.chsprsFam = chsprsFam;
    }

    public String getChsprsNam() {
        return chsprsNam;
    }

    public void setChsprsNam(String chsprsNam) {
        this.chsprsNam = chsprsNam;
    }

    public String getChsprsPtr() {
        return chsprsPtr;
    }

    public void setChsprsPtr(String chsprsPtr) {
        this.chsprsPtr = chsprsPtr;
    }

    public Date getChsprsBrd() {
        return chsprsBrd;
    }

    public void setChsprsBrd(Date chsprsBrd) {
        this.chsprsBrd = chsprsBrd;
    }

    public String getChsprsSex() {
        return chsprsSex;
    }

    public void setChsprsSex(String chsprsSex) {
        this.chsprsSex = chsprsSex;
    }

    public Long getInsnmb() {
        return insnmb;
    }

    public void setInsnmb(Long insnmb) {
        this.insnmb = insnmb;
    }

    public Integer getInsnmbChk() {
        return insnmbChk;
    }

    public void setInsnmbChk(Integer insnmbChk) {
        this.insnmbChk = insnmbChk;
    }

    public String getCmpnpfcod() {
        return cmpnpfcod;
    }

    public void setCmpnpfcod(String cmpnpfcod) {
        this.cmpnpfcod = cmpnpfcod;
    }

    public String getCmpprfcod() {
        return cmpprfcod;
    }

    public void setCmpprfcod(String cmpprfcod) {
        this.cmpprfcod = cmpprfcod;
    }

    public String getDoctyp() {
        return doctyp;
    }

    public void setDoctyp(String doctyp) {
        this.doctyp = doctyp;
    }

    public String getCodCmpnpf() {
        return codCmpnpf;
    }

    public void setCodCmpnpf(String codCmpnpf) {
        this.codCmpnpf = codCmpnpf;
    }

    public String getCodCmpprf() {
        return codCmpprf;
    }

    public void setCodCmpprf(String codCmpprf) {
        this.codCmpprf = codCmpprf;
    }

    public Integer getCmpdclYer() {
        return cmpdclYer;
    }

    public void setCmpdclYer(Integer cmpdclYer) {
        this.cmpdclYer = cmpdclYer;
    }

    public Date getProcdate() {
        return procdate;
    }

    public void setProcdate(Date procdate) {
        this.procdate = procdate;
    }

    public String getOprtyp() {
        return oprtyp;
    }

    public void setOprtyp(String oprtyp) {
        this.oprtyp = oprtyp;
    }

    public Integer getPrcacm() {
        return prcacm;
    }

    public void setPrcacm(Integer prcacm) {
        this.prcacm = prcacm;
    }

    public String getRealtyp() {
        return realtyp;
    }

    public void setRealtyp(String realtyp) {
        this.realtyp = realtyp;
    }

    @Override
    public String toString() {
        return "Application{" +
                "dptcod=" + dptcod +
                ", dcinmb=" + dcinmb +
                ", dcidck=" + dcidck +
                ", dcicpy=" + dcicpy +
                ", regnmb='" + regnmb + '\'' +
                ", regdat=" + regdat +
                ", chsprsFam='" + chsprsFam + '\'' +
                ", chsprsNam='" + chsprsNam + '\'' +
                ", chsprsPtr='" + chsprsPtr + '\'' +
                ", chsprsBrd=" + chsprsBrd +
                ", chsprsSex='" + chsprsSex + '\'' +
                ", insnmb=" + insnmb +
                ", insnmbChk=" + insnmbChk +
                ", cmpnpfcod='" + cmpnpfcod + '\'' +
                ", cmpprfcod='" + cmpprfcod + '\'' +
                ", doctyp='" + doctyp + '\'' +
                ", codCmpnpf='" + codCmpnpf + '\'' +
                ", codCmpprf='" + codCmpprf + '\'' +
                ", cmpdclYer=" + cmpdclYer +
                ", procdate=" + procdate +
                ", oprtyp='" + oprtyp + '\'' +
                ", prcacm=" + prcacm +
                ", realtyp='" + realtyp + '\'' +
                '}';
    }
}
