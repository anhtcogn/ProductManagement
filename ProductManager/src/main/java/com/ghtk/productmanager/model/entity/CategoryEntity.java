package com.ghtk.productmanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@RequiredArgsConstructor
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
    @Column
    private String code;
    @Column
    private Integer status;
    @Column
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ProductEntity> productEntities;
}
