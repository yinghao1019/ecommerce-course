package com.howhow.ecommerce.service.impl;

import com.howhow.ecommerce.dao.MemberRepository;
import com.howhow.ecommerce.dao.RoleRepository;
import com.howhow.ecommerce.model.entity.MemberEntity;
import com.howhow.ecommerce.model.entity.RoleEntity;

import lombok.RequiredArgsConstructor;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {
    private final MemberRepository memberRepository;
    private final RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        MemberEntity memberEntity = memberRepository.findByEmail(username);
        if (memberEntity == null) {
            throw new UsernameNotFoundException("User not found");
        }
        List<RoleEntity> roleEntityList =
                roleRepository.findRolesByMemberId(memberEntity.getMemberId());
        return new User(
                memberEntity.getEmail(),
                memberEntity.getPassword(),
                convertToGrantedAuthorities(roleEntityList));
    }

    private List<GrantedAuthority> convertToGrantedAuthorities(List<RoleEntity> roleEntityList) {
        return roleEntityList.stream()
                .map(roleEntity -> new SimpleGrantedAuthority(roleEntity.getRoleName()))
                .collect(Collectors.toList());
    }
}
