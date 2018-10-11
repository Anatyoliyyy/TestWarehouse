package ua.testwarehouse.mikhailenko.model.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ua.testwarehouse.mikhailenko.model.entity.Product;

import java.util.List;


public interface ProductDAO {
    public List<Product> getAllProduct();
    public boolean checkProductAvailability(String product);
    public void saveProduct(Product product);
}