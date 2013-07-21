/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnguard.ldp.utils.http.header;

import com.turnguard.ldp.utils.http.header.exception.HeaderValueException;

/**
 *
 * @author turnguard
 */
public interface HeaderValue<T> {
    public T getValue() throws HeaderValueException ;
    public String getStringValue();
}
