package com.zy.platform.service.impl;

import com.zy.platform.core.base.AbstractBaseServiceImpl;
import com.zy.platform.core.page.MPageHelper;
import com.zy.platform.core.page.PageDTO;
import com.zy.platform.core.page.PageRequest;
import com.zy.platform.model.Order;
import com.zy.platform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

@Service
@SuppressWarnings("all")
public class DemoServiceImpl extends AbstractBaseServiceImpl<Order> implements OrderService {

    @Autowired
    Mapper mapper;

    @Override
    public Order getOrderById(Long id) {
        return this.selectByKey(id);
    }

    @Override
    public PageDTO<Order> getOrderByPage(PageRequest request) {
        return MPageHelper.startPageByRequest(request, ()-> findOrderList());
    }

    public List<Order> findOrderList() {
       return this.selectAll();
    }
}
