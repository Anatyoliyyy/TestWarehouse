package ua.testwarehouse.mikhailenko.model.entity;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Shipper implements Serializable {

    private String id;
    private String shipper;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShipper() {
        return shipper;
    }

    public void setShipper(String shipper) {
        this.shipper = shipper;
    }
}
