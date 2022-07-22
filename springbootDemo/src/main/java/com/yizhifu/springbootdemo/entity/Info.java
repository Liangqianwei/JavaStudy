package com.yizhifu.springbootdemo.entity;

public class Info {
    private  Integer id;
    private  String CREATED_BY;
    private  String UPDATED_BY;
    private  String OUT_TRADE_NO;
    private  String PLATFORM_TYPE;
    private  String GOODS_INFO;
    private  String TRADE_AMT;
    private  String RESULT_MSG;

    public Info(Integer id, String CREATED_BY, String UPDATED_BY, String OUT_TRADE_NO, String PLATFORM_TYPE, String GOODS_INFO, String TRADE_AMT, String RESULT_MSG) {
        this.id = id;
        this.CREATED_BY = CREATED_BY;
        this.UPDATED_BY = UPDATED_BY;
        this.OUT_TRADE_NO = OUT_TRADE_NO;
        this.PLATFORM_TYPE = PLATFORM_TYPE;
        this.GOODS_INFO = GOODS_INFO;
        this.TRADE_AMT = TRADE_AMT;
        this.RESULT_MSG = RESULT_MSG;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public String getUPDATED_BY() {
        return UPDATED_BY;
    }

    public void setUPDATED_BY(String UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY;
    }

    public String getOUT_TRADE_NO() {
        return OUT_TRADE_NO;
    }

    public void setOUT_TRADE_NO(String OUT_TRADE_NO) {
        this.OUT_TRADE_NO = OUT_TRADE_NO;
    }

    public String getPLATFORM_TYPE() {
        return PLATFORM_TYPE;
    }

    public void setPLATFORM_TYPE(String PLATFORM_TYPE) {
        this.PLATFORM_TYPE = PLATFORM_TYPE;
    }

    public String getGOODS_INFO() {
        return GOODS_INFO;
    }

    public void setGOODS_INFO(String GOODS_INFO) {
        this.GOODS_INFO = GOODS_INFO;
    }

    public String getTRADE_AMT() {
        return TRADE_AMT;
    }

    public void setTRADE_AMT(String TRADE_AMT) {
        this.TRADE_AMT = TRADE_AMT;
    }

    public String getRESULT_MSG() {
        return RESULT_MSG;
    }

    public void setRESULT_MSG(String RESULT_MSG) {
        this.RESULT_MSG = RESULT_MSG;
    }

    public Info() {
    }

    @Override
    public String toString() {
        return "Info{" +
                "id=" + id +
                ", CREATED_BY='" + CREATED_BY + '\'' +
                ", UPDATED_BY='" + UPDATED_BY + '\'' +
                ", OUT_TRADE_NO='" + OUT_TRADE_NO + '\'' +
                ", PLATFORM_TYPE='" + PLATFORM_TYPE + '\'' +
                ", GOODS_INFO='" + GOODS_INFO + '\'' +
                ", TRADE_AMT='" + TRADE_AMT + '\'' +
                ", RESULT_MSG='" + RESULT_MSG + '\'' +
                '}';
    }
}
