package com.turnguard.ldp.utils.http.header;

import java.util.Map;

/**
 *
 * @author turnguard
 */
public interface QualityHeaderValue<T> extends MultipleHeaderValue<T> {    
    public Map<T, Double> getSortedValues();
}
