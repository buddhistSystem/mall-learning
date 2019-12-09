package com.liqian.mall.controller;

import com.liqian.mall.dao.PmsBrandMapper;
import com.liqian.mall.entity.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2019/11/27 0027 16:14
 * @Description:
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {

    @Resource
    private PmsBrandMapper pmsBrandMapper;

    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public List list() {
         return pmsBrandMapper.list();
    }


    @ApiOperation("添加品牌列表")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public String add(@ApiParam("名称") String name) {
        return "success";
    }


}
