package com.sky.service;

import com.sky.dto.OrdersPaymentDTO;
import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

public interface OrderService {


    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
     OrderSubmitVO submit(OrdersSubmitDTO ordersSubmitDTO);

    /**
     * 订单支付
     * @param ordersPaymentDTO
     * @return
     */
    void payment(OrdersPaymentDTO ordersPaymentDTO);
}
