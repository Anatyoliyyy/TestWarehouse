package ua.testwarehouse.mikhailenko.model.entity;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Product implements Serializable {

    private Integer id;
    private String product;

    public Product() {
    }

    public Product(String product) {
        this.product = product;
    }

    @Id
    @TableGenerator(name = "productid", table = "productpktb", pkColumnName = "productkey",
            pkColumnValue = "productvalue", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "productid")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }


}
