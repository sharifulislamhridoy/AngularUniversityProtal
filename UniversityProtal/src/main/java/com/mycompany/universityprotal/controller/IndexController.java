/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityprotal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Shariful
 */
@Controller
//@RequestMapping("/user")
public class IndexController {


     @RequestMapping(value = "/")
    public String create() {
        return "index";
    }
    
   @RequestMapping(value = "/save")
    public String save() {
        return "shariful";
    }
}
