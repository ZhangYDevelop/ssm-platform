package com.zy.platform.controller;

import com.zy.platform.conf.datasource.DataSourceSwitcher;
import com.zy.platform.core.page.PageDTO;
import com.zy.platform.core.page.PageRequest;
import com.zy.platform.core.result.Result;
import com.zy.platform.enums.DataSourceEnum;
import com.zy.platform.model.Order;
import com.zy.platform.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @DataSourceSwitcher(DataSourceEnum.SLAVE)
    @GetMapping("/getOrder")
    public Result<Order> getOrderById(Long id) {
        return Result.success(orderService.getOrderById(id));
    }

    @DataSourceSwitcher(DataSourceEnum.SLAVE)
    @GetMapping("/getOrderByPage")
    public Result<PageDTO<Order>> getOrderByPage(PageRequest request) {
        return Result.success(orderService.getOrderByPage(request));
    }

    @DataSourceSwitcher(DataSourceEnum.MASTER)
    @PostMapping("/addOrder")
    public Result<Boolean> addOrder(@RequestBody Order order) {
        return Result.success(orderService.addOrder(order));
    }
}
