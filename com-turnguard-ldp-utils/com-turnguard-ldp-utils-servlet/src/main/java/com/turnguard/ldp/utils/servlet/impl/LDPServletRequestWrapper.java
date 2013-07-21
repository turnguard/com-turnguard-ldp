package com.turnguard.ldp.utils.servlet.impl;

import com.turnguard.ldp.utils.http.header.impl.AcceptHeader;
import com.turnguard.ldp.utils.http.header.impl.AcceptLanguageHeader;
import com.turnguard.ldp.utils.http.header.impl.HostHeader;
import com.turnguard.ldp.utils.http.header.impl.UserAgentHeader;
import com.turnguard.ldp.utils.http.header.impl.value.QualityHeaderValueBase;
import com.turnguard.ldp.utils.http.header.impl.value.SingleStringHeaderValueBase;
import com.turnguard.ldp.utils.servlet.LDPServletRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class LDPServletRequestWrapper extends HttpServletRequestWrapper implements LDPServletRequest {
    
    private AcceptHeader acceptHeader;
    private AcceptLanguageHeader acceptLanguageHeader;
    private UserAgentHeader userAgentHeader;
    
    public LDPServletRequestWrapper(ServletRequest request) {
        super((HttpServletRequest)request);        
    }

    @Override
    public URL getLDPRURI() {
        try {
            return new URL(this.getRequestURL().toString());
        } catch (MalformedURLException ex) {
            return null;
        }
    }
    
    @Override
    public String getMethod() {        
        return ((HttpServletRequest) super.getRequest()).getMethod();        
    }

    @Override
    public AcceptHeader getAcceptHeader() {        
        if(this.acceptHeader==null){
            this.acceptHeader = new AcceptHeader(new QualityHeaderValueBase(this.getHeader("accept")));
        }
        return this.acceptHeader;
    }
    
    @Override
    public AcceptLanguageHeader getAcceptLanguageHeader() {
        if(this.acceptLanguageHeader==null){
            this.acceptLanguageHeader = new AcceptLanguageHeader(new QualityHeaderValueBase(this.getHeader("accept-language")));
        }         
        return this.acceptLanguageHeader;
    }

    @Override
    public UserAgentHeader getUserAgentHeader() {
        if(this.userAgentHeader==null){
            this.userAgentHeader = new UserAgentHeader(new SingleStringHeaderValueBase(this.getHeader("user-agent")));
        }
        return this.userAgentHeader;
    }

    public boolean isSPARQLRequest() {
        return this.getParameter("query")==null?false:true;
    }

    public String getSPARQLQuery() {
        return this.getParameter("query");
    }

    public String getETag() {
        return this.getHeader("etag");
    }
    
}
