package com.turnguard.ldp.utils.servlet.base;

import com.turnguard.ldp.utils.servlet.LDPServlet;
import com.turnguard.ldp.utils.servlet.LDPServletRequest;
import com.turnguard.ldp.utils.servlet.LDPServletResponse;
import com.turnguard.ldp.utils.servlet.impl.LDPServletRequestWrapper;
import com.turnguard.ldp.utils.servlet.impl.LDPServletResponseWrapper;
import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author turnguard
 */

public abstract class GenericLDPServlet extends GenericServlet implements LDPServlet {
    private enum HTTP_METHOD {
        GET,
        POST,
        PUT,
        DELETE,
        HEAD,
        OPTIONS
    }

    public GenericLDPServlet() {
        super();
    }
    
    private void GET(LDPServletRequest req, LDPServletResponse resp) throws IOException{
        /**
         *  All GET logic like (303) redirects, eTags, not-modified, ... comes in here
         *  so that extensions of this class more or less only need to implement a 
         *  dereference and a sparql method for a given datasource.
         */
        if(req.isSPARQLRequest()){
            this.sparql(req, resp);
        } else {            
            /**             
             * only do a dereference if necessary (=modified), put in some redirect handler 
             * like if(!this.getRedirectToURL(req.getLDPRURI())!=null){ then redirect, else send 303}
             */            
            this.dereference(req, resp);            
        }
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException { 
        LDPServletRequest ldpReq = new LDPServletRequestWrapper(req);
        LDPServletResponse ldpResp = new LDPServletResponseWrapper(res);        
        switch(HTTP_METHOD.valueOf(ldpReq.getMethod())){
            case GET:                
                this.GET(ldpReq, ldpResp);
            break;
            /* same for PUT, POST,...*/
        }
    }
    
    public abstract void dereference(LDPServletRequest req, LDPServletResponse resp);
    public abstract void sparql(LDPServletRequest req, LDPServletResponse resp);    
    public abstract boolean isSPARQLRequest(LDPServletRequest req, LDPServletResponse resp);    
}
