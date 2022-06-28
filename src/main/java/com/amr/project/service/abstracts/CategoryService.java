package com.amr.project.service.abstracts;

import com.amr.project.model.dto.CategoryDto;
import com.amr.project.model.entity.Category;

import java.util.Set;

public interface CategoryService extends ReadWriteService<Category,Long> {
    Set<CategoryDto> findAllCategoriesByShopId(Long shopId);
}