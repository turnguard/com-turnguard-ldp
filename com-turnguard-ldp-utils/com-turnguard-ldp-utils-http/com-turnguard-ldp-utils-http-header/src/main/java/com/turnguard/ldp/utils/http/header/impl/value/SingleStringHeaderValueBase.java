/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.QualityHeaderValue;
import com.turnguard.ldp.utils.http.header.SingleHeaderValue;
import com.turnguard.ldp.utils.http.header.exception.HeaderValueException;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class SingleStringHeaderValueBase  extends HeaderValueBase<String> implements SingleHeaderValue<String> {

    public SingleStringHeaderValueBase(String stringValue) {
        super(stringValue);
    }

    public String getValue() throws HeaderValueException {
        return super.getStringValue();
    }

}
