package com.howhow.ecommerce.model.entity;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "member_has_role")
public class MemberRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_has_role_id")
    private Integer memberRoleId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "member_id")
    private Integer memberId;
}
