package com.ghtk.productmanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private Double price;
    @Column
    private String sku;
    @Column
    private Integer status;
    @Column
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @JsonIgnore
    private CategoryEntity category;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<WarehouseProductEntity> warehouseProductEntities;

}
