package com.example.codingstudy_230424.w4;

public class Address {
    private String fullAddr;
    private String sido;
    private String sigungu;

    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }
}
