package com.ghtk.productmanager.repository;

import com.ghtk.productmanager.model.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    @Query("select s from ProductEntity s where s.price > 50000 and s.name like '%áo%' order by s.price desc")
    Page<ProductEntity> search(Pageable pageable);

}
