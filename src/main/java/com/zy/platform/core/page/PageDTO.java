package com.zy.platform.core.page;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 分页DTO (Data Tranfer Object)
 */
public class PageDTO<T> implements Serializable {
    private static final long serialVersionUID = -5729060077904710437L;

    /**
     * @Description：总数
     * @Date 2020/5/25 10:52
     */
    private long total;

    /**
     * @Description：列表数据
     * @Date 2020/5/25 10:53
     */
    private List<T> rows;

    private int pageSize;

    private int pageIndex;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public PageDTO() {
    }

    public PageDTO(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageDTO(PageInfo pageInfo) {
        this.total = pageInfo.getTotal();
        this.rows = pageInfo.getList();
    }

    public PageDTO(PageInfo pageInfo, int pageIndex, int pageSize) {
        this.total = pageInfo.getTotal();
        this.rows = pageInfo.getList();
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
    }
    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageDTO{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
