package com.turnguard.ldp.utils.http.header;

/**
 *
 * @author turnguard
 */
public interface Header<T extends HeaderValue<?>> {
    public String getName();
    public T getValue();
}
