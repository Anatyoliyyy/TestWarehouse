package ua.testwarehouse.mikhailenko.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import ua.testwarehouse.mikhailenko.model.dao.ExpenseDocumentDAO;
import ua.testwarehouse.mikhailenko.model.dao.IncomingDocumentDAO;
import ua.testwarehouse.mikhailenko.model.dao.ProductDAO;
import ua.testwarehouse.mikhailenko.model.dao.WarehouseDAO;
import ua.testwarehouse.mikhailenko.model.entity.Product;
import ua.testwarehouse.mikhailenko.model.entity.Warehouse;
import ua.testwarehouse.mikhailenko.service.Remainder;
import ua.testwarehouse.mikhailenko.service.RemainderDocument;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class ViewRemainderPageController extends AbstractController {

    private final static String REMAINDER_PAGE_VIEW_NAME = "remainder";
    private final static String HELLO_REMAINDER_PAGE_VIEW_NAME = "helloRemainder";
    private static final String WAREHOUSE_MODEL_NAME = "warehouse";
    private static final String PRODUCT_MODEL_NAME = "product";
    private static final String PARAMETER_DATE = "date";
    private static final String REMAINDER_MODEL_NAME = "remainder";

    private WarehouseDAO warehouse;
    private ProductDAO product;
    private IncomingDocumentDAO incomingDocument;
    private ExpenseDocumentDAO expenseDocument;
    private Remainder remainder;

    RemainderDocument remainderDoc;

    public ViewRemainderPageController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result = null;
        try {
            ModelAndView mv = new ModelAndView();
            List<Warehouse> allWarehouse = warehouse.getAllWarehouse();
            List<Product> allProduct = product.getAllProduct();
            mv.addObject(PRODUCT_MODEL_NAME, allProduct);
            mv.addObject(WAREHOUSE_MODEL_NAME, allWarehouse);
            mv.setViewName(HELLO_REMAINDER_PAGE_VIEW_NAME);

            String selectedDate = request.getParameter(PARAMETER_DATE);
            Date date = null;
            if (selectedDate != null) {
                try {
                    mv.setViewName(REMAINDER_PAGE_VIEW_NAME);
                    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    date = formatter.parse(selectedDate);
                } catch (Exception e) {
                }
            }
            List<RemainderDocument> remainderList = remainder.getRemainderList(date);
            mv.addObject(REMAINDER_MODEL_NAME,remainderList);


            result = mv;
        } catch (Exception e) {
        }

        return result;
    }

    public void setWarehouse(WarehouseDAO warehouse) {
        this.warehouse = warehouse;
    }

    public void setIncomingDocument(IncomingDocumentDAO incomingDocument) {
        this.incomingDocument = incomingDocument;
    }

    public void setExpenseDocument(ExpenseDocumentDAO expenseDocument) {
        this.expenseDocument = expenseDocument;
    }

    public void setProduct(ProductDAO product) {
        this.product = product;
    }

    public void setRemainder(Remainder remainder) {
        this.remainder = remainder;
    }
}