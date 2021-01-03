package com.zy.platform.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "ph_order")
public class Order {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 订单流水号
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 状态： 0：待支付  1：已支付  2：使用中  3：已关闭
     */
    private String state;

    /**
     * 套餐ID
     */
    @Column(name = "package_id")
    private Long packageId;

    /**
     * 套餐名称
     */
    @Column(name = "package_name")
    private String packageName;







    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取订单流水号
     *
     * @return order_num - 订单流水号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单流水号
     *
     * @param orderNum 订单流水号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取套餐ID
     *
     * @return package_id - 套餐ID
     */
    public Long getPackageId() {
        return packageId;
    }

    /**
     * 设置套餐ID
     *
     * @param packageId 套餐ID
     */
    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    /**
     * 获取套餐名称
     *
     * @return package_name - 套餐名称
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * 设置套餐名称
     *
     * @param packageName 套餐名称
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }





}
