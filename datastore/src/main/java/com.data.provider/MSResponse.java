package com.data.provider;

public class MSResponse {
    private int status;
    private String message;
    private Object result;

    public MSResponse() {

    }

    public MSResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public MSResponse(int status, String message, String result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
