package com.zy.platform.core.page;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.function.Supplier;

/**
 * 分页辅助类
 */
public class MPageHelper {

    public static PageDTO  startPageByRequest(PageRequest pageRequest, Supplier<?> s) {
        PageHelper.startPage(pageRequest.getPageIndex(), pageRequest.getPageSize());
        PageInfo<?> pageInfo = new PageInfo<>((List<?>)s.get());
        PageHelper.clearPage();
        PageDTO page = new PageDTO(pageInfo, pageRequest.getPageIndex(), pageRequest.getPageSize());
        return page;
    }
}
