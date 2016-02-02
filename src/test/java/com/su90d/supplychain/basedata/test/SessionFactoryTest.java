/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.basedata.test;

import com.su90d.supplychain.test.utils.SpringUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author superman90
 */
public class SessionFactoryTest extends SpringUtils {
    
    public SessionFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSessionFactory(){
        
        context.getBean("sessionFactory");
        
    }    
}
