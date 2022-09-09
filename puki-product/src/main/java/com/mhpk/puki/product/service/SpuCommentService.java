package com.mhpk.puki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.puki.common.utils.PageUtils;
import com.mhpk.puki.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 12:09:08
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

