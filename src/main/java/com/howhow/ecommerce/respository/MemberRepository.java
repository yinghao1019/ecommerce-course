package com.howhow.ecommerce.respository;

import com.howhow.ecommerce.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Integer> {

    MemberEntity findByEmail(String email);
}
