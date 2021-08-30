package com.example.esdemo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "big",type = "item", shards = 1, replicas = 0)
public class Item {

    //@Id
    @Field(type = FieldType.Long)
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String title; //标题

    @Field(type = FieldType.Keyword)
    private String category;// 分类

    @Field(type = FieldType.Keyword)
    private String brand; // 品牌

    @Field(type = FieldType.Double)
    private Double price; // 价格

    @Field(type = FieldType.Keyword,index = false)
    private String images; // 图片地址
}