package com.lzy.mark.markproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzy.common.utils.PageUtils;
import com.lzy.mark.markproduct.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 07:12:09
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProductAttrValueEntity> baseAttrListforspu(Long spuId);

    void saveProductAttr(List<ProductAttrValueEntity> collect);
}

