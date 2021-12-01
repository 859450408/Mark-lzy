package com.lzy.mark.coupon.dao;

import com.lzy.mark.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 09:15:43
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
