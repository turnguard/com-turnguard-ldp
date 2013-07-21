package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.QualityHeaderValue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class AcceptValue implements QualityHeaderValue<String>{
    
    private Map<String, Double> values;
    
    protected AcceptValue(Map<String, Double> values){
        this.values = values;
    }
    
    public Map<String, Double> getSortedValues() {
        return this.values;
    }

    public Collection<String> getValues() {       
        return ((HashMap)this.getValues()).keySet();
    }

    public String getValue() {
        return this.values.toString();
    }

    public String getStringValue() {
        return this.getValue();
    }

}
