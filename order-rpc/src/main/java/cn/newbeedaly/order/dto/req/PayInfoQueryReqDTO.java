package cn.newbeedaly.order.dto.req;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
public class PayInfoQueryReqDTO extends BaseDTO {

    /**
     * 订单ID
     */
    @NotBlank(message = "订单ID不能不能为空")
    private String orderId;

}
