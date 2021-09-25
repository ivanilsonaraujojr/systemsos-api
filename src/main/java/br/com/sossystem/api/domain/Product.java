package br.com.sossystem.api.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Column(unique=true)
    private String code;

    @NotNull
    @Column(name = "quantity_stock")
    private Long quantityStock;

    @NotNull
    private Double price;

    private String description;

    @Column(name = "tecnical_description")
    private String tecnicalDescription;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Category category;

    public Product(){

    }

    public Product(Long id, String name, String code, Long quantityStock, Double price, String description, String tecnicalDescription, Category category) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.quantityStock = quantityStock;
        this.price = price;
        this.description = description;
        this.tecnicalDescription = tecnicalDescription;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(Long quantityStock) {
        this.quantityStock = quantityStock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTecnicalDescription() {
        return tecnicalDescription;
    }

    public void setTecnicalDescription(String tecnicalDescription) {
        this.tecnicalDescription = tecnicalDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
