package cn.newbeedaly.order.service.impl;

import cn.newbeedaly.order.dto.req.PayInfoQueryReqDTO;
import cn.newbeedaly.order.service.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public String getPayInfoByOrderId(PayInfoQueryReqDTO dto) {
        return null;
    }

}
