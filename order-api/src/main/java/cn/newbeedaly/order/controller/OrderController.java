package cn.newbeedaly.order.controller;

import cn.newbeedaly.order.dto.req.PayInfoQueryReqDTO;
import cn.newbeedaly.order.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/order")
@RestController
public class OrderController {

    @Reference
    private OrderService orderService;

    @GetMapping(value = "/getPayInfoByOrderId")
    public String getPayInfoByOrderId(){
        PayInfoQueryReqDTO payInfoQueryReqDTO = PayInfoQueryReqDTO.builder().orderId("1").build();
        return orderService.getPayInfoByOrderId(payInfoQueryReqDTO);
    }

}
