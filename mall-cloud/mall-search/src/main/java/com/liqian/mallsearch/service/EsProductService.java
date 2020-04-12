package com.liqian.mallsearch.service;

import com.liqian.mallsearch.domain.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EsProductService {

    /**
     * 根据关键字搜索名称或者副标题
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 根据关键字搜索名称或者副标题复合查询
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize,Integer sort);

    /**
     * 批量删除商品
     */
    void delete(List<Long> ids);

    /**
     * 从数据库中导入所有商品到ES
     */
    int importAll();
}
