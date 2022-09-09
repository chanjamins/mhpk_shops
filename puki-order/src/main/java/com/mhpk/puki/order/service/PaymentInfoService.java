package com.mhpk.puki.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.common.utils.PageUtils;
import com.mhpk.puki.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 14:51:25
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

