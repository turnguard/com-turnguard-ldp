package com.turnguard.ldp.utils.servlet;

/**
 *
 * @author turnguard
 */
public interface LDPServlet {
    public void dereference(LDPServletRequest req, LDPServletResponse resp);
    public void sparql(LDPServletRequest req, LDPServletResponse resp);    
}
