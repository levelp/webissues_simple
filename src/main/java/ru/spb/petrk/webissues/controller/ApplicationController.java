/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.spb.petrk.webissues.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.spb.petrk.webissues.model.Car;

import javax.servlet.http.HttpServletRequest;


/**
 *
 * @author PetrK
 */

@Controller
public class ApplicationController {

    @RequestMapping(value = {"/app/", "/app/index"}, method = RequestMethod.GET)   
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/app/car"}, method = RequestMethod.GET)
    public String getCar(HttpServletRequest request) {
        request.getSession(true).setAttribute("car", new Car("BMW", 300));
        return "index";
    }

    private ApplicationController() {}
}