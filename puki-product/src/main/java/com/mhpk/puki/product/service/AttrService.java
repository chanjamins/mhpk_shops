package com.mhpk.puki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.puki.common.utils.PageUtils;
import com.mhpk.puki.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 12:07:35
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

