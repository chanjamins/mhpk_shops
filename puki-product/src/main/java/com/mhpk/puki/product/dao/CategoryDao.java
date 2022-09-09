package com.mhpk.puki.product.dao;

import com.mhpk.puki.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-09 12:07:35
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
