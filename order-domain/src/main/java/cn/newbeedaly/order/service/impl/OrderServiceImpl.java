package cn.newbeedaly.order.service.impl;

import cn.newbeedaly.order.dto.req.OrderQueryReqDTO;
import cn.newbeedaly.order.service.OrderService;
import cn.newbeedaly.pay.dto.req.PayQueryReqDTO;
import cn.newbeedaly.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.pay.service.PayService;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private PayService payService;

    @Override
    public String getOrderPayByOrderId(OrderQueryReqDTO dto) {
        // 用于模拟
        // 根据订单ID查询出支付ID
        String payId = getPayIdByOrderId(dto.getOrderId());
        // 查询支付信息（真实业务会冗余字段）
        PayQueryReqDTO payQueryReqDTO = PayQueryReqDTO.builder().payId(payId).build();
        PayQueryResDTO pay = payService.getPayById(payQueryReqDTO);
        return JSON.toJSONString(pay);
    }

    private String getPayIdByOrderId(String orderId) {
        return "PAY-" + orderId;
    }

}
