package com.ghtk.productmanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "district")
public class DistrictEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String code;
    @Column
    private String name;

    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<WarehouseEntity> warehouseEntities;

}