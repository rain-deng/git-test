package com.mayikt.service.member.impl;

import com.mayikt.service.member.api.MemberService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {
    @Override
    public String getUser(@RequestParam("userId") Integer userId) {
        return "我是会员服务";
    }
}
