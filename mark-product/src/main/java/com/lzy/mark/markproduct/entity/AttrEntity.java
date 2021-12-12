package com.lzy.mark.markproduct.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.lzy.common.valid.AddGroup;
import com.lzy.common.valid.ListValue;
import com.lzy.common.valid.UpdateGroup;
import com.lzy.common.valid.UpdateStatusGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

/**
 * 商品属性
 *
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 07:12:10
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    @NotNull(message = "修改必须指定id",groups = {UpdateGroup.class})
    @Null(message = "新增不能指定id",groups = {AddGroup.class})
    @TableId
    private Long attrId;
    /**
     * 属性名
     */
    @NotBlank(message = "属性名必须提交",groups = {AddGroup.class,UpdateGroup.class})
    private String attrName;
    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    @NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
    @ListValue(vals={0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
    private Integer searchType;
    /**
     * 属性图标
     */
    private String icon;
    /**
     * 可选值列表[用逗号分隔]
     */
    private String valueSelect;
    /**
     * 值类型[0-单个值， 1-多个值]
     */
    private Integer valueType;
    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    @NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
    @ListValue(vals={0,1,2},groups = {AddGroup.class, UpdateStatusGroup.class})
    private Integer attrType;
    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    @NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
    @ListValue(vals={0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
    private Long enable;
    /**
     * 所属分类
     */
    private Long catelogId;
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    @NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
    @ListValue(vals={0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
    private Integer showDesc;

}
