package cn.newbeedaly.order.controller;

import cn.newbeedaly.order.dto.req.OrderQueryReqDTO;
import cn.newbeedaly.order.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/order")
@RestController
public class OrderController {

    @Reference
    private OrderService orderService;

    @GetMapping(value = "/{orderId}")
    public String getPayInfoByOrderId(@PathVariable("orderId") String orderId){
        OrderQueryReqDTO orderQueryReqDTO = OrderQueryReqDTO.builder().orderId(orderId).build();
        return orderService.getOrderPayByOrderId(orderQueryReqDTO);
    }

}
