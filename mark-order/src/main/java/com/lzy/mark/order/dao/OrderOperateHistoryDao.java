package com.lzy.mark.order.dao;

import com.lzy.mark.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author Liangzhanyi
 * @email 859450408@qq.ccom
 * @date 2021-11-27 09:11:06
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
