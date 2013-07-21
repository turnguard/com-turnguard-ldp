package com.turnguard.ldp.utils.http.header.impl;

import com.turnguard.ldp.utils.http.HttpConstants;
import com.turnguard.ldp.utils.http.header.Header;
import com.turnguard.ldp.utils.http.header.QualityHeaderValue;
import com.turnguard.ldp.utils.http.header.SingleHeaderValue;
import java.net.URL;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class UserAgentHeader implements Header<SingleHeaderValue<String>>{
    
    private SingleHeaderValue value;
    
    public UserAgentHeader(SingleHeaderValue value){
        this.value = value;
    }
    
    public String getName() {
        return HttpConstants.HEADER_NAME_USER_AGENT;
    }

    public SingleHeaderValue<String> getValue() {
        return this.value;
    }

}
