package com.store.exception;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Custom error Handler to catch Server Unknown errors.
 * 
 * @author prasanth
 *
 */

public class CustomErrorController implements ErrorController {
    private static final String PATH = "/error";
     
    @RequestMapping(value=PATH)
    public String error() {
        return "Error heaven";
    }
    
    @RequestMapping("/errorHeaven")
    String errorHeaven() {
        return "You have reached the heaven of errors!!!";
    }
 
    @Override
    public String getErrorPath() {
        return PATH;
    }
}