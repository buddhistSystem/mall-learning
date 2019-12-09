package com.liqian.mall.es.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2019/12/4 0004 08:13
 * @Description:
 */
@Getter
@Setter
@Document(indexName = "pms",type = "product",shards = 1,replicas = 0)
public class EsProduct implements Serializable {

    private static final long serialVersionUID = -1L;
    @Id
    private Long id;
    /**
     * 货号
     */
    @Field(type = FieldType.Keyword)
    private String productSn;

    private Long brandId;
    /**
     * 品牌名称
     */
    @Field(type = FieldType.Keyword)
    private String brandName;

    private Long productCategoryId;
    /**
     * 分类名称
     */
    @Field(type = FieldType.Keyword)
    private String productCategoryName;

    private String pic;
    /**
     * 名称
     */
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String name;
    /**
     * 副标题
     */
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String subTitle;
    /**
     * 关键字
     */
    @Field(analyzer = "ik_max_word",type = FieldType.Text)
    private String keywords;

    private BigDecimal price;

    private Integer sale;

    private Integer newStatus;

    private Integer recommandStatus;

    private Integer stock;

    private Integer promotionType;

    private Integer sort;
    @Field(type =FieldType.Nested)
    private List<EsProductAttributeValue> attrValueList;

}
