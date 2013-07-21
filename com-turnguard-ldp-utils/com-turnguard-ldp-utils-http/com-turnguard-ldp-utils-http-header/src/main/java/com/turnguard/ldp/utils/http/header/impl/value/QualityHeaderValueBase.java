package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.QualityHeaderValue;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class QualityHeaderValueBase extends HeaderValueBase<String> implements QualityHeaderValue<String> {
    private Map<String, Double> values;

    public QualityHeaderValueBase(String stringValue) {
        super(stringValue);
        this.values = Parser.parseQualityHeaderValue(stringValue);
    }
    
    public Map<String, Double> getSortedValues() {
        return this.values;
    }

    public Collection<String> getValues() {       
        return ((HashMap)this.getValues()).keySet();
    }

    public String getValue() {
        return super.getStringValue();
    }

    @Override
    public String getStringValue() {
        return this.getValue();
    }
}
