package com.turnguard.ldp.utils.http.header;

import java.util.Collection;

/**
 *
 * @author turnguard
 */
public interface MultipleHeaderValue<T> extends HeaderValue<T> {
    public Collection<T> getValues();
}
