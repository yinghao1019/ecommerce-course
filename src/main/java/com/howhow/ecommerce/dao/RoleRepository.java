package com.howhow.ecommerce.dao;

import com.howhow.ecommerce.model.entity.RoleEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    @Query(
            "SELECT new RoleEntity (r.roleId,r.roleName) FROM RoleEntity r RIGHT JOIN MemberRoleEntity mr ON r.roleId = mr.roleId WHERE mr.memberId = :memberId")
    List<RoleEntity> findRolesByMemberId(Integer memberId);
}
