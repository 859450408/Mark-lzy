package com.lzy.mark.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzy.common.utils.PageUtils;
import com.lzy.mark.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 09:15:43
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

