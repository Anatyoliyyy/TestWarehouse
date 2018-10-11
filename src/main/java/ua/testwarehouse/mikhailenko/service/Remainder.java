package ua.testwarehouse.mikhailenko.service;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.List;


public interface Remainder {
    public List<RemainderDocument> getRemainderList(Date date);
}

