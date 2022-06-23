package com.ghtk.productmanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "warehouse_product")
public class WarehouseProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long inventory;
    @Column
    private Long total_import;
    @Column
    private Long total_export;
    @Column
    private Date start_date;
    @Column
    private Date expired_date;

    @ManyToOne
    @JoinColumn(name = "warehouse_id", referencedColumnName = "id")
    @JsonIgnore
    private WarehouseEntity warehouse;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @JsonIgnore
    private ProvinceEntity provinceEntity;

    @ManyToOne
    @JoinColumn(name = "product_entity_id")
    private ProductEntity product;


}
