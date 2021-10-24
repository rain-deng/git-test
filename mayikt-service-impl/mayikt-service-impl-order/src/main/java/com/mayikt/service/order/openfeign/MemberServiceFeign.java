package com.mayikt.service.order.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("mayikt-member")
public interface MemberServiceFeign {
    @GetMapping("/getUser")
    public String getUser(@RequestParam("userId") Integer userId);
}
