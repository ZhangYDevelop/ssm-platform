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
    private String status;

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
     * 套餐价格
     */
    private BigDecimal price;

    /**
     * 套餐折扣
     */
    private BigDecimal sale;

    /**
     * 订单数量
     */
    private Integer amount;

    /**
     * 订单总价
     */
    private BigDecimal total;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户昵称
     */
    @Column(name = "user_nickname")
    private String userNickname;

    /**
     * 联系人
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 支付方式  0：支付宝  1： 微信
     */
    @Column(name = "pay_method")
    private String payMethod;

    /**
     * 实际支付金额
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 是否取消： 0：否  1： 是
     */
    @Column(name = "is_cancel")
    private String isCancel;

    /**
     * 取消时间
     */
    @Column(name = "cancel_time")
    private Date cancelTime;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 订单更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

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

    /**
     * 获取状态： 0：待支付  1：已支付  2：使用中  3：已关闭
     *
     * @return status - 状态： 0：待支付  1：已支付  2：使用中  3：已关闭
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态： 0：待支付  1：已支付  2：使用中  3：已关闭
     *
     * @param status 状态： 0：待支付  1：已支付  2：使用中  3：已关闭
     */
    public void setStatus(String status) {
        this.status = status;
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

    /**
     * 获取套餐价格
     *
     * @return price - 套餐价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置套餐价格
     *
     * @param price 套餐价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取套餐折扣
     *
     * @return sale - 套餐折扣
     */
    public BigDecimal getSale() {
        return sale;
    }

    /**
     * 设置套餐折扣
     *
     * @param sale 套餐折扣
     */
    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }

    /**
     * 获取订单数量
     *
     * @return amount - 订单数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置订单数量
     *
     * @param amount 订单数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取订单总价
     *
     * @return total - 订单总价
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * 设置订单总价
     *
     * @param total 订单总价
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户昵称
     *
     * @return user_nickname - 用户昵称
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * 设置用户昵称
     *
     * @param userNickname 用户昵称
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    /**
     * 获取联系人
     *
     * @return user_phone - 联系人
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置联系人
     *
     * @param userPhone 联系人
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * 获取支付方式  0：支付宝  1： 微信
     *
     * @return pay_method - 支付方式  0：支付宝  1： 微信
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * 设置支付方式  0：支付宝  1： 微信
     *
     * @param payMethod 支付方式  0：支付宝  1： 微信
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * 获取实际支付金额
     *
     * @return pay_amount - 实际支付金额
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * 设置实际支付金额
     *
     * @param payAmount 实际支付金额
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * 获取是否取消： 0：否  1： 是
     *
     * @return is_concel - 是否取消： 0：否  1： 是
     */
    public String getIsCancel() {
        return isCancel;
    }

    /**
     * 设置是否取消： 0：否  1： 是
     *
     * @param  isCancel 是否取消： 0：否  1： 是
     */
    public void setIsCancel(String isConcel) {
        this.isCancel = isConcel;
    }

    /**
     * 获取取消时间
     *
     * @return concel_time - 取消时间
     */
    public Date getCancelTime() {
        return cancelTime;
    }

    /**
     * 设置取消时间
     *
     * @param concelTime 取消时间
     */
    public void setCancelTime(Date concelTime) {
        this.cancelTime = concelTime;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取订单更新时间
     *
     * @return update_time - 订单更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置订单更新时间
     *
     * @param updateTime 订单更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}