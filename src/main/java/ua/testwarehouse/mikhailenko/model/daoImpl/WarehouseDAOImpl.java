package ua.testwarehouse.mikhailenko.model.daoImpl;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.Criteria;
import org.hibernate.Session;
import ua.testwarehouse.mikhailenko.model.dao.WarehouseDAO;
import ua.testwarehouse.mikhailenko.model.entity.Warehouse;
import ua.testwarehouse.mikhailenko.model.entity.WarehouseHibernateUtil;

import java.util.List;

public class WarehouseDAOImpl implements WarehouseDAO {

    @Override
    public List<Warehouse> getAllWarehouse() {
        List<Warehouse> result = null;
        Session session = WarehouseHibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(Warehouse.class);

            result = (List<Warehouse>) criteria.list();
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