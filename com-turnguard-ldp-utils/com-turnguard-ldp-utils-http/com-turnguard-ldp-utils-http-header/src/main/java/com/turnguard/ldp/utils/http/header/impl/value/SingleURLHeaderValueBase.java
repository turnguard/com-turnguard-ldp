package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.SingleHeaderValue;
import com.turnguard.ldp.utils.http.header.exception.HeaderValueException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class SingleURLHeaderValueBase   extends HeaderValueBase<URL> implements SingleHeaderValue<URL>  {

    public SingleURLHeaderValueBase(String stringValue) {
        super(stringValue);
    }

    public URL getValue() throws HeaderValueException {
        try {            
            return new URL(super.getStringValue());
        } catch(MalformedURLException e){
            throw new HeaderValueException(e);
        }
    }

}
