package ua.testwarehouse.mikhailenko.controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloPageController extends AbstractController {

    private static final String HELLO_PAGE_VIEW_NAME = "hello";
    private static final String ERROR_PAGE_VIEW_NAME = "error";

    public HelloPageController() {
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView result;

        try {

            ModelAndView mv = new ModelAndView();
            mv.setViewName(HELLO_PAGE_VIEW_NAME);
            result = mv;

        } catch (Exception e) {
            result = new ModelAndView(ERROR_PAGE_VIEW_NAME);
        }
        return result;

    }
}