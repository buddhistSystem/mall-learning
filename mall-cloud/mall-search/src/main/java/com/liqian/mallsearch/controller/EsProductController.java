package com.liqian.mallsearch.controller;

import com.liqian.mallsearch.dao.EsProductDao;
import com.liqian.mallsearch.domain.EsProduct;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(tags = "EsProductController",description = "搜索商品管理")
@RequestMapping("/esProduct")
public class EsProductController {

    @Resource
    private EsProductDao esProductDao;

    @RequestMapping("test")
    @ResponseBody
    public List<EsProduct> list(){
        return esProductDao.getAllEsProductList(null);
    }
}
