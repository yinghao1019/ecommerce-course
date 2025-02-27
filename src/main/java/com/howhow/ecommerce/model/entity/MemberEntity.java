package com.howhow.ecommerce.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "member")
@Data
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id", nullable = false)
    private Integer memberId;
    @Column
    private String name;
    @Column(nullable = false)

    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Integer age;
}
