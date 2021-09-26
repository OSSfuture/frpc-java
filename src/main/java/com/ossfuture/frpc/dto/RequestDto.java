package com.ossfuture.frpc.dto;

import java.io.Serializable;

/**
 * @description: json dto
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2021-09-26
 */
public class RequestDto implements Serializable {
    private static final long serialVersionUID = 3088605076117342875L;
    private Integer i;
    private String p;
    private String b;

    public RequestDto(Integer i, String p, String b) {
        this.i = i;
        this.p = p;
        this.b = b;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}
