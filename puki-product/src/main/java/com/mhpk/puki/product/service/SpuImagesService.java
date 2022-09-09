package com.mhpk.puki.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mhpk.puki.common.utils.PageUtils;
import com.mhpk.puki.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 12:09:08
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

