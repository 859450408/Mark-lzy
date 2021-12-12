package com.lzy.mark.markproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzy.common.utils.PageUtils;
import com.lzy.mark.markproduct.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 07:12:10
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
    void saveSpuInfoDesc(SpuInfoDescEntity spuInfoDescEntity);
}

