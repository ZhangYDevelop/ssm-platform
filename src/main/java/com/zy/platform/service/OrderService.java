package com.zy.platform.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
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

    /**
     * 分页查询
     * @param request
     * @return
     */
    PageDTO<Order> getOrderByPage(PageRequest request);

    /**
     * 添加订单
     * @param order
     * @return
     */
    Boolean addOrder(Order order);
}
