package com.liqian.malladmin.controller;

import com.liqian.mallcommon.api.CommonResult;
import com.liqian.mallmbg.entity.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 品牌功能Controller
 * Created by macro on 2018/4/26.
 */
@Controller
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@RequestMapping("/brand")
public class PmsBrandController {


    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<List<PmsBrand>> getList() {
        return CommonResult.success(null);
    }




    @ApiOperation(value = "根据编号查询品牌信息")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    @PreAuthorize("hasAuthority('pms:brand:read')")
    public CommonResult<PmsBrand> getItem(@PathVariable("id") Long id) {
        return CommonResult.success(null);
    }

}
