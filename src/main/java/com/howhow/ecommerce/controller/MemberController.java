package com.howhow.ecommerce.controller;

import com.howhow.ecommerce.model.dto.MemberSignUpRequestDTO;
import com.howhow.ecommerce.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    public ResponseEntity<Void> signUp(@RequestBody MemberSignUpRequestDTO memberSignUpRequestDTO) {
        memberService.signUp(memberSignUpRequestDTO);
        return ResponseEntity.ok().build();
    }

}
