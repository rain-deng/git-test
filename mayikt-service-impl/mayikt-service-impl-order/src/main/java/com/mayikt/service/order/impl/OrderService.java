package com.mayikt.service.order.impl;

import com.mayikt.service.order.openfeign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderService {
    @Autowired
    private MemberServiceFeign memberServiceFeign;
    @RequestMapping("/orderFeignToMember")
    public String orderFeignToMember()
    {
        String result=memberServiceFeign.getUser(1);
        return "我是订单服务调用会员服务，返回结果："+result;
    }


}
