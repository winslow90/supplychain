/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.test.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author superman90
 */
public class SpringUtils {
    public static ApplicationContext context;
    
    static {
        context = new ClassPathXmlApplicationContext("com/su90d/supplychain/spring/applicationContext.xml");
    }    
}
