package com.zy.platform.core.result;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/***
 * @Description：返回结果的数据模型
 * @Date 2018/11/19
 */
@ApiModel("返回结果的数据模型")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -5603540578712258654L;

    /**
     * @Description：状态码,200标识成功
     * @Date 2020/5/25 10:54
     * @Author zuojie
     */
    @ApiModelProperty("状态码,200标识成功")
    private int code;

    /**
     * @Description：消息
     * @Date 2020/5/25 10:54
     * @Author zuojie
     */
    @ApiModelProperty("消息")
    private String msg;

    /**
     * @Description：数据
     * @Date 2020/5/25 10:55
     * @Author zuojie
     */
    @ApiModelProperty("数据")
    private T data ;

    private Result() {
    }

    private Result(int code, String message) {
        super();
        this.code = code;
        this.msg = message;
    }


    private Result(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    /**
     * @Description：响应成功时的调用方法,返回数据data
     * @Date 2018/11/13 11:13
     */
    public static <T> Result<T> success(T data){
        return new Result<T>(HttpStatus.OK.value(),"操作成功",data);
    }

    /**
     * @Description：响应成功时的调用方法,返回数据data和自定义响应信息
     */
    public static <T> Result<T> success(String message, T data) {
        return new Result<T>(HttpStatus.OK.value(), message, data);
    }

    /**
     * @Description：响应成功时的调用方法
     * @Date 2018/11/13 11:13
     */
    public static <T> Result<T> success(int code, String msg){
        return new Result<T>(code,msg);
    }

    /**
     * @Description：响应成功是的调用方法,data为空的情况
     * @Date 2018/11/13 11:14
     */
    public static <T> Result<T> success(){
        return (Result<T>)success("操作成功");
    }

    /**
     * @Description：响应失败时的调用方法
     * @Date 2018/11/13 11:13
     */
    public static <T> Result<T> error(int code, String msg){
        return new Result<T>(code,msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
