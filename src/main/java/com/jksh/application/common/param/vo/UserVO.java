package com.jksh.application.common.param.vo;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO implements Serializable {
    
    private String token;


    /**
     * for user list fields
     */
    private Integer id;
    
    private String account;
    
    private String phone_number;
    
    private String user_type;
    
    private String status;
}
