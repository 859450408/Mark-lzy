package com.lzy.mark.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzy.common.utils.PageUtils;
import com.lzy.mark.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 09:22:58
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

