package com.howhow.ecommerce.model.dto;

import lombok.Data;

@Data
public class MemberSignUpRequestDTO {
    private String email;
    private String password;
    private String name;
    private Integer age;
}
