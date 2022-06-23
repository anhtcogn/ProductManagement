package com.ghtk.productmanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "warehouse")
public class WarehouseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "province_id", referencedColumnName = "id")
    @JsonIgnore
    private ProvinceEntity province;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "id")
    @JsonIgnore
    private DistrictEntity district;

    @OneToMany(mappedBy = "warehouse", cascade = CascadeType.ALL)
    private List<WarehouseProductEntity> warehouseProductEntities;

}