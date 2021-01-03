package com.zy.platform.core.page;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Description: 分页DTO (Data Tranfer Object)
 */
@ApiModel("分页DTO (Data Tranfer Object)")
public class PageDTO<T> implements Serializable {
    private static final long serialVersionUID = -5729060077904710437L;

    /**
     * @Description：总数
     * @Date 2020/5/25 10:52
     */
    @ApiModelProperty("总数")
    private long total;

    @ApiModelProperty("总页数")
    private int pages;

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
        this.pages = pageInfo.getPages();

    }

    public PageDTO(PageInfo pageInfo, int pageIndex, int pageSize) {
        this.total = pageInfo.getTotal();
        this.rows = pageInfo.getList();
        this.pageSize = pageSize;
        this.pageIndex = pageIndex;
        this.pages = pageInfo.getPages();
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "PageDTO{" +
                "total=" + total +
                ", pages=" + pages +
                ", rows=" + rows +
                ", pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                '}';
    }
}
