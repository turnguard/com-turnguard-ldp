package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.HeaderValue;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public abstract class HeaderValueBase<T> implements HeaderValue<T> {
    
    private String stringValue;
    
    public HeaderValueBase(String stringValue){
        this.stringValue = stringValue;
    }
    
    public String getStringValue() {        
        return this.stringValue;
    }

}
