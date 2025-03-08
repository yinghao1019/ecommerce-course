package com.howhow.ecommerce.controller;

import com.howhow.ecommerce.model.dto.MemberSignUpRequestDTO;
import com.howhow.ecommerce.service.MemberService;

import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signUp(@RequestBody MemberSignUpRequestDTO memberSignUpRequestDTO) {
        memberService.signUp(memberSignUpRequestDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/role")
    public List<String> getRoles(Authentication authentication) {
        return authentication.getAuthorities().stream()
                .map(authority -> authority.getAuthority())
                .toList();
    }
}
