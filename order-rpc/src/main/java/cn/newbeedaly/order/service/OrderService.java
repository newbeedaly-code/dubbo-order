package cn.newbeedaly.order.service;

import cn.newbeedaly.order.dto.req.PayInfoQueryReqDTO;

import javax.validation.constraints.NotNull;

/**
 * @author newbeedaly
 */
public interface OrderService {

    public String getPayInfoByOrderId(@NotNull PayInfoQueryReqDTO dto);
}
