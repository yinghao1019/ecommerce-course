package com.howhow.ecommerce.service.impl;

import com.howhow.ecommerce.dao.MemberRepository;
import com.howhow.ecommerce.model.dto.MemberSignUpRequestDTO;
import com.howhow.ecommerce.model.entity.MemberEntity;
import com.howhow.ecommerce.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void signUp(MemberSignUpRequestDTO memberSignUpRequestDTO) {
        if (memberRepository.existsByEmail(memberSignUpRequestDTO.getEmail())) {
            throw new IllegalArgumentException("User Already Exists");
        }

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setName(memberSignUpRequestDTO.getName());
        memberEntity.setEmail(memberSignUpRequestDTO.getEmail());
        memberEntity.setPassword(passwordEncoder.encode(memberSignUpRequestDTO.getPassword()));
        memberEntity.setAge(memberSignUpRequestDTO.getAge());
        memberRepository.save(memberEntity);
    }
}
