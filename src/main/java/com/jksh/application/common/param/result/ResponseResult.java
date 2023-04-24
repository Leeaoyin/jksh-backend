package com.jksh.application.common.param.result;

import com.jksh.application.common.enums.HttpCodeEnum;
import com.jksh.domain.event.Const;
import lombok.*;


import java.io.Serializable;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {

    /**
     * data
     */
    private T data;

    /**
     * message
     */
    private String message;

    /**
     * code
     */
    private Integer code;

    public static <T> ResponseResult<T> success(T t) {
         return new ResponseResult<>(t, "success", Const.SUCCESS_CODE);
    }

    public static <T> ResponseResult<T> error(Integer errorCode, String errorMessage) {
        return new ResponseResult<>(null, errorMessage, errorCode);
    }

    public static <T> ResponseResult<T> error(HttpCodeEnum exceptionEnum) {
        return new ResponseResult<>(null, exceptionEnum.getMessage(), exceptionEnum.getCode());
    }

    public static <T> ResponseResult<T> status(HttpCodeEnum exceptionEnum) {
        return new ResponseResult<>(null, exceptionEnum.getMessage(), exceptionEnum.getCode());
    }
}
