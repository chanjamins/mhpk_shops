package com.mhpk.puki.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.common.utils.PageUtils;
import com.mhpk.puki.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 14:51:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

