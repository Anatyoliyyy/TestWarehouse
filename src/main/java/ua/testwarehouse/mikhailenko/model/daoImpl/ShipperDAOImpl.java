package ua.testwarehouse.mikhailenko.model.daoImpl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.Criteria;
import org.hibernate.Session;
import ua.testwarehouse.mikhailenko.model.dao.ShipperDAO;
import ua.testwarehouse.mikhailenko.model.entity.Shipper;
import ua.testwarehouse.mikhailenko.model.entity.WarehouseHibernateUtil;

import java.util.List;


public class ShipperDAOImpl implements ShipperDAO {

    @Override
    public List<Shipper> getAllShipper() {
        List<Shipper> result = null;
        Session session = WarehouseHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(Shipper.class);

            result = (List<Shipper>) criteria.list();
            session.getTransaction().commit();
        } catch (Exception e) {
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return result;
    }
}