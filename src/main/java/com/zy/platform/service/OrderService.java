package com.zy.platform.service;

import com.zy.platform.core.page.PageDTO;
import com.zy.platform.core.page.PageRequest;
import com.zy.platform.model.Order;

public interface OrderService {
    /**
     * 根据ID获取订单
     * @param id
     * @return
     */
    Order getOrderById(Long id);

    PageDTO<Order> getOrderByPage(PageRequest request);
}
