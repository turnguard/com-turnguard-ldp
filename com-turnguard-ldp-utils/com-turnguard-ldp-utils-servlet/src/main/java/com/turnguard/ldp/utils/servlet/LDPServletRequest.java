/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turnguard.ldp.utils.servlet;

import com.turnguard.ldp.utils.http.header.impl.AcceptHeader;
import com.turnguard.ldp.utils.http.header.impl.AcceptLanguageHeader;
import com.turnguard.ldp.utils.http.header.impl.UserAgentHeader;
import java.net.URL;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author turnguard
 */
public interface LDPServletRequest extends HttpServletRequest {
    public URL getLDPRURI();
    public boolean isSPARQLRequest();
    public String getSPARQLQuery();
    public String getETag();
    public AcceptHeader getAcceptHeader();
    public AcceptLanguageHeader getAcceptLanguageHeader();
    public UserAgentHeader getUserAgentHeader();        
}
