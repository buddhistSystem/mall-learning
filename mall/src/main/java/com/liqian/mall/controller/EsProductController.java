package com.liqian.mall.controller;

import com.liqian.mall.es.document.EsProduct;
import com.liqian.mall.service.EsProductService;
import com.liqian.mall.util.Result;
import com.liqian.mall.util.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2019/12/4 0004 09:10
 * @Description:
 */
@RestController
@RequestMapping("/esProduct")
@Api(tags = "esProductController",description = "搜索商品管理")
public class EsProductController {

    @Resource
    private EsProductService esProductService;

    @ApiOperation(value = "导入所有数据库中商品到ES")
    @RequestMapping(value = "/importAll", method = RequestMethod.POST)
    public Result<Integer> importAllList() {
        int count = esProductService.importAll();
        return ResultUtil.success(count);
    }

    @ApiOperation(value = "根据id删除商品")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public Result<Object> delete(@PathVariable Long id) {
        esProductService.delete(id);
        return ResultUtil.success(null);
    }

    @ApiOperation(value = "根据id批量删除商品")
    @RequestMapping(value = "/delete/batch", method = RequestMethod.POST)
    public Result<Object> delete(@RequestParam("ids") List<Long> ids) {
        esProductService.delete(ids);
        return ResultUtil.success(null);
    }

    @ApiOperation(value = "根据id创建商品")
    @RequestMapping(value = "/create/{id}", method = RequestMethod.POST)
    public Result<EsProduct> create(@PathVariable Long id) {
        EsProduct esProduct = esProductService.create(id);
        if (esProduct != null) {
            return ResultUtil.success(esProduct);
        } else {
            return ResultUtil.error();
        }
    }

    @ApiOperation(value = "简单搜索")
    @RequestMapping(value = "/search/simple", method = RequestMethod.GET)
    @ResponseBody
    public Result<Page<EsProduct>> search(@RequestParam(required = false) String keyword,
                                                      @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                      @RequestParam(required = false, defaultValue = "5") Integer pageSize) {
        Page<EsProduct> esProductPage = esProductService.search(keyword, pageNum, pageSize);
        return ResultUtil.success(esProductPage);
    }
}
