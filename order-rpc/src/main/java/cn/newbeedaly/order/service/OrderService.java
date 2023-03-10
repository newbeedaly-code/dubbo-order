package cn.newbeedaly.order.service;

import cn.newbeedaly.order.dto.req.OrderQueryReqDTO;

import javax.validation.constraints.NotNull;

/**
 * @author newbeedaly
 */
public interface OrderService {

    public String getOrderPayByOrderId(@NotNull OrderQueryReqDTO dto);
}
