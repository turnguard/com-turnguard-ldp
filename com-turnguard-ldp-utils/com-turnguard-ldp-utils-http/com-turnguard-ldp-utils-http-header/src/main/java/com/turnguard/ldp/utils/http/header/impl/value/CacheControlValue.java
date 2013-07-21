/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.turnguard.ldp.utils.http.header.impl.value;

import com.turnguard.ldp.utils.http.header.Pair;
import com.turnguard.ldp.utils.http.header.SingleHeaderValue;
import com.turnguard.ldp.utils.http.header.impl.pairs.MaxAge;

/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class CacheControlValue implements SingleHeaderValue<Pair<Integer>>{
    
    private MaxAge pair;
    
    public CacheControlValue(MaxAge pair){
        this.pair = pair;
    }
    
    public Pair<Integer> getValue() {
        return this.pair;
    }

    public String getStringValue() {
        return this.pair.toString();
    }

}
