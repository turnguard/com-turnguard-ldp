package com.turnguard.ldp.utils.http.header.impl;

import com.turnguard.ldp.utils.http.HttpConstants;
import com.turnguard.ldp.utils.http.header.Header;
import com.turnguard.ldp.utils.http.header.QualityHeaderValue;
/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class AcceptHeader implements Header<QualityHeaderValue<String>> {
    
    private QualityHeaderValue value;
    
    public AcceptHeader(QualityHeaderValue value){
        this.value = value;
    }
    
    public String getName() {
        return HttpConstants.HEADER_NAME_ACCEPT;
    }

    public QualityHeaderValue<String> getValue() {
        return this.value;
    }

}
