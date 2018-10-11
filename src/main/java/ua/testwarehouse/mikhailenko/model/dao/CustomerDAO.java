package ua.testwarehouse.mikhailenko.model.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ua.testwarehouse.mikhailenko.model.entity.Customer;

import java.util.List;


public interface CustomerDAO {
    public List<Customer> getAllCustomer();
}
