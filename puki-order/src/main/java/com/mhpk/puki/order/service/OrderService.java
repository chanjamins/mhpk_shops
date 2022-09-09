package com.mhpk.puki.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.common.utils.PageUtils;
import com.mhpk.puki.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 14:51:25
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

