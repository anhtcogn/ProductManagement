package com.ghtk.productmanager.repository;

import com.ghtk.productmanager.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
