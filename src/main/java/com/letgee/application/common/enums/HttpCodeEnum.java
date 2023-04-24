package com.letgee.application.common.enums;

public enum HttpCodeEnum {

    OK(200, "success"),
    FAIL(400, "Bad Request"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    SERVER_ERROR(500, "Internal Server Error"),
    USER_NOT_FOUND(405,"user not found");

    private int code;
    private String message;

    HttpCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpCodeEnum codeOf(int code) {
        for (HttpCodeEnum codeEnum : values()) {
            if (codeEnum.code == code) {
                return codeEnum;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
