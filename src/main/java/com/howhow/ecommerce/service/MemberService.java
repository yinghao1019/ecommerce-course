package com.howhow.ecommerce.service;

import com.howhow.ecommerce.model.dto.MemberSignUpRequestDTO;

public interface MemberService {
    void signUp(MemberSignUpRequestDTO memberSignUpRequestDTO);
    void signOut();
}
