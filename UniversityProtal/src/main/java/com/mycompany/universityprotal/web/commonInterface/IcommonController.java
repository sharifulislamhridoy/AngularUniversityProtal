/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.universityprotal.web.commonInterface;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author shari
 */
public interface IcommonController <T> {

    public T create();

    public T save(HttpServletRequest request);

    public ResponseEntity<T> edit(int id);

    public ResponseEntity<T> update(HttpServletRequest request);

    public ResponseEntity<T> getAll();

    public ResponseEntity<T> delete(int id);

    public ResponseEntity<T> getById(int id);

}
