package com.turnguard.ldp.utils.servlet.impl;

import com.turnguard.ldp.utils.servlet.LDPServletResponse;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class LDPServletResponseWrapper extends HttpServletResponseWrapper implements LDPServletResponse {

    public LDPServletResponseWrapper(ServletResponse response) {
        super((HttpServletResponse)response);
    }

}
