package com.howhow.ecommerce.service.impl;

import com.howhow.ecommerce.model.entity.MemberEntity;
import com.howhow.ecommerce.respository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MemberEntity memberEntity = memberRepository.findByEmail(username);
        if (memberEntity != null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new User(memberEntity.getEmail(), memberEntity.getPassword(), Collections.emptyList());
    }
}
