package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.SingleHeaderValue;
import com.turnguard.ldp.utils.http.header.exception.HeaderValueException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class UserAgentValue extends HeaderValueBase<String> implements SingleHeaderValue<String>{

    public UserAgentValue(String stringValue) {
        super(stringValue);
    }

    public String getValue() throws HeaderValueException {
        return this.getStringValue();
    }
}
