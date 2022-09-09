package com.mhpk.puki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.puki.common.utils.PageUtils;
import com.mhpk.puki.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 12:07:35
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

