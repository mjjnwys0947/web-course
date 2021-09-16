package com.mjj.adminserver.admin.vo;

import java.io.Serializable;

public class LoginResult  implements Serializable {

    private String msg;
    private boolean success;
    private String url;

    @Override
    public String toString() {
        return "LoginResult{" +
                "msg='" + msg + '\'' +
                ", success=" + success +
                ", url='" + url + '\'' +
                '}';
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
