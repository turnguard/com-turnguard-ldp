/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.Header;
import com.turnguard.ldp.utils.http.header.impl.AcceptHeader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class Parser {
    private static final QualityHeaderValueComparator QUALITY_HEADER_COMPARATOR = new QualityHeaderValueComparator();
    
    public static Header parseHeader(String headerName, String headerValue){
       // TreeMap<String, Double> map = new ValueComparableMap<String, Double>(Ordering.natural());
                
        List<Entry<String,Double>> set = new ArrayList<Entry<String,Double>>();        
        for(String part : headerValue.split(",")){
            String value;
            double q;
            if(part.contains(";")){
                String[] valueSplit = part.split(";");
                value = valueSplit[0];
                q = Double.parseDouble(valueSplit[1].replaceFirst("q=", ""));
            } else {
                q = 1.0d;
                value = part;
            }
            set.add(new AbstractMap.SimpleEntry(value,q));
        }    
        Collections.sort(set, new Comparator<Entry<String,Double>>(){
            public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
               return o2.getValue().compareTo(o1.getValue());
            }            
        });
        Map<String,Double> map = new LinkedHashMap<String,Double>(set.size());
        while(set.size()>0){
            Entry<String,Double> e = set.remove(0);
            map.put(e.getKey(), e.getValue());
        }        
        return new AcceptHeader(new AcceptValue(map));
    }
    
    public static Map<String, Double> parseQualityHeaderValue(String stringValue){
        if(stringValue==null || stringValue.equals("")){
            return new LinkedHashMap<String,Double>();
        }
        List<Entry<String,Double>> set = new ArrayList<Entry<String,Double>>();        
        for(String part : stringValue.split(",")){
            String value;
            double q;
            if(part.contains(";")){
                String[] valueSplit = part.split(";");
                value = valueSplit[0];
                q = Double.parseDouble(valueSplit[1].replaceFirst("q=", ""));
            } else {
                q = 1.0d;
                value = part;
            }
            set.add(new AbstractMap.SimpleEntry(value,q));
        }    
        Collections.sort(set, QUALITY_HEADER_COMPARATOR);
        Map<String,Double> map = new LinkedHashMap<String,Double>(set.size());
        while(set.size()>0){
            Entry<String,Double> e = set.remove(0);
            map.put(e.getKey(), e.getValue());
        } 
        return map;
    }
    
    private static class QualityHeaderValueComparator implements Comparator<Entry<String,Double>> {
        public int compare(Entry<String, Double> o1, Entry<String, Double> o2) {
            return o2.getValue().compareTo(o1.getValue());
        }        
    }
    
}
