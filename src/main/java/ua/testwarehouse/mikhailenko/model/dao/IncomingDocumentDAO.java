package ua.testwarehouse.mikhailenko.model.dao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import ua.testwarehouse.mikhailenko.model.entity.IncomingDocument;

import java.util.Date;
import java.util.List;


public interface IncomingDocumentDAO {
    public List<IncomingDocument> getInfoToIncomingDocument(Date fromDeliveryDate,
                                                            Date byDeliveryDate, String shipper, String warehouse);
    public List<IncomingDocument> getInfoToRemainderDocument(Date deliveryDate, String warehouse, String product);

    public void saveIncoming(IncomingDocument incdoc);
    public boolean checkAvailabilityProductInIncomingForSelectedShipperAndUpdate(Date date, String shipper, String warehouse,
                                                                                 String product, Double price, Double amountToBePaid, Integer amount);
    public void updateIncoming(Double amountToBePaid, Integer amount, Integer id);

    public boolean checkAvailabilityProductInIncomingFromAllShipper(Date date, String warehouse,
                                                                    String product, Double price);
}
