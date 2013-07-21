/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.turnguard.ldp.utils.http.header.impl.pairs;

import com.turnguard.ldp.utils.http.HttpConstants;
import com.turnguard.ldp.utils.http.header.Pair;
/**
 *
 * @author http://www.turnguard.com/turnguard
 */
public class MaxAge implements Pair<Integer> {
    private Integer value;
    public MaxAge(Integer value){
        this.value = value;
    }
    
    public String getKey() {
        return HttpConstants.HEADER_PAIR_MAX_AGE;
    }

    public Integer getValue() {
        return this.value;
    }

}
