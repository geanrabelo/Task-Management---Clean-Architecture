package com.br.task.core.enums;

public enum EnumCode {
    TAS0001("Task alreay exists", 0001),
    TAS0002("Task not exists", 0002);


    private String message;
    private int code;
    EnumCode(String message, int code){
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
