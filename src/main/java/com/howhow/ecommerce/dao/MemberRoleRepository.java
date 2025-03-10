package com.howhow.ecommerce.dao;

import com.howhow.ecommerce.model.entity.MemberRoleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRoleRepository extends JpaRepository<MemberRoleEntity, Integer> {}
