package com.ghtk.productmanager.model.DTO;

public class ProdctDTO {
    private  Double price;
    private String name;

    public ProdctDTO() {

    }
    public ProdctDTO(Double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
