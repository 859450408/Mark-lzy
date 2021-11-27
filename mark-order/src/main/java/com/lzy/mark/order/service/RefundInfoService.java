package com.lzy.mark.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzy.common.utils.PageUtils;
import com.lzy.mark.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 09:11:06
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

