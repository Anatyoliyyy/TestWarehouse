package ua.testwarehouse.mikhailenko.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import ua.testwarehouse.mikhailenko.model.dao.IncomingDocumentDAO;
import ua.testwarehouse.mikhailenko.model.dao.ShipperDAO;
import ua.testwarehouse.mikhailenko.model.dao.WarehouseDAO;
import ua.testwarehouse.mikhailenko.model.entity.IncomingDocument;
import ua.testwarehouse.mikhailenko.model.entity.Shipper;
import ua.testwarehouse.mikhailenko.model.entity.Warehouse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ViewIncomingDocumentController extends AbstractController {

    private static final String INCOMING_ERROR_VIEW_NAME = "incomingError";
    private static final String LIST_WAREHOUSE_MODEL_NAME = "warehouse";
    private static final String LIST_SHIPPER_MODEL_NAME = "shipper";
    private static final String INCOMING_MODEL_NAME = "incoming";
    private static final String INCOMING_DOCUMENT_VIEW_NAME = "incoming";
    private static final String PARAMETER_DATE = "date";
    private static final String PARAMETER_SHIPPER = "shipper";
    private static final String PARAMETER_WAREHOUSE = "warehouse";
    private static final String SELECTED_WAREHOUSE_MODEL_NAME = "selectedWarehouse";
    private static final String SELECTED_SHIPPER_MODEL_NAME = "selectedShipper";
    private static final String SELECTED_DATE_MODEL_NAME = "selectedDate";

    private ShipperDAO shipper;
    private WarehouseDAO warehouse;
    private IncomingDocumentDAO incomingDocument;

    public ViewIncomingDocumentController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result = null;
        try {
            ModelAndView mv = new ModelAndView(INCOMING_DOCUMENT_VIEW_NAME);
            List<Shipper> allShipper = shipper.getAllShipper();
            List<Warehouse> allWarehouse = warehouse.getAllWarehouse();
            mv.addObject(LIST_WAREHOUSE_MODEL_NAME, allWarehouse);
            mv.addObject(LIST_SHIPPER_MODEL_NAME, allShipper);

            String selectedDate = request.getParameter(PARAMETER_DATE);
            String selectedShipper = request.getParameter(PARAMETER_SHIPPER);
            String selectedWarehouse = request.getParameter(PARAMETER_WAREHOUSE);

            Date date1 = null;
            Date date2 = null;
            if (selectedDate != null) {
                try {
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    date1 = formatter.parse(selectedDate);
                    date2 = formatter.parse(selectedDate);
                } catch (Exception e) {
                }
            }
            List<IncomingDocument> infoToIncomingDocument = incomingDocument.getInfoToIncomingDocument(
                    date1, date2, selectedShipper, selectedWarehouse);

            mv.addObject(INCOMING_MODEL_NAME, infoToIncomingDocument);
            result = mv;

            if (infoToIncomingDocument.size() > 0) {
            } else {
                mv.setViewName(INCOMING_ERROR_VIEW_NAME);
                mv.addObject(SELECTED_DATE_MODEL_NAME, selectedDate);
                mv.addObject(SELECTED_SHIPPER_MODEL_NAME, selectedShipper);
                mv.addObject(SELECTED_WAREHOUSE_MODEL_NAME, selectedWarehouse);
            }

        } catch (Exception ex) {
        }
        return result;
    }

    public void setShipper(ShipperDAO shipper) {
        this.shipper = shipper;
    }

    public void setWarehouse(WarehouseDAO warehouse) {
        this.warehouse = warehouse;
    }

    public void setIncomingDocument(IncomingDocumentDAO incomingDocument) {
        this.incomingDocument = incomingDocument;
    }
}