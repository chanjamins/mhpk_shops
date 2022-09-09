package com.mhpk.puki.order.dao;

import com.mhpk.puki.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 14:51:25
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
