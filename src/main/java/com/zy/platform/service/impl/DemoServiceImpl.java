package com.zy.platform.service.impl;

import com.zy.platform.core.base.AbstractBaseServiceImpl;
import com.zy.platform.core.page.MPageHelper;
import com.zy.platform.core.page.PageDTO;
import com.zy.platform.core.page.PageRequest;
import com.zy.platform.model.Order;
import com.zy.platform.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@SuppressWarnings("all")
public class DemoServiceImpl extends AbstractBaseServiceImpl<Order> implements OrderService {



    /**
     * 根据ID获取订单
     * @param id
     * @return
     */
    @Override
    public Order getOrderById(Long id) {
        return this.selectByKey(id);
    }

    /**
     * 分页查询
     * @param request
     * @return
     */
    @Override
    public PageDTO<Order> getOrderByPage(PageRequest request) {
        return MPageHelper.startPageByRequest(request, ()-> findOrderList());
    }

    /**
     * 添加订单
     * @param order
     * @return
     */
    @Transactional
    @Override
    public Boolean addOrder(Order order) {
        this.save(order);
        return true;
    }

    public List<Order> findOrderList() {
       return this.selectAll();
    }
}
