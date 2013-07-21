package com.turnguard.ldp.utils.http.header.impl;

import com.turnguard.ldp.utils.http.HttpConstants;
import com.turnguard.ldp.utils.http.header.Header;
import com.turnguard.ldp.utils.http.header.SingleHeaderValue;
import com.turnguard.ldp.utils.http.header.impl.value.SingleURLHeaderValueBase;
import java.net.URL;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class HostHeader implements Header<SingleHeaderValue<URL>> {

    
    private SingleURLHeaderValueBase value;
    
    public HostHeader(SingleURLHeaderValueBase value){
        this.value = value;
    }
    
    public String getName() {
        return HttpConstants.HEADER_NAME_USER_AGENT;
    }

    public SingleHeaderValue<URL> getValue() {
        return this.value;
    }

}
