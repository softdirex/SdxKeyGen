/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.softdirex.sdxkeygen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author sdx
 */
public class PropertiesUtils {
    private static final String BARS = File.separator;
    private static final String PROPERTIES_PATH = System.getProperty("user.dir")+BARS+"vars.properties";
    
    public static String getProperty(String propertyName){
        Properties prop = new Properties();
	InputStream is = null;
		
        try {
                is = new FileInputStream(PROPERTIES_PATH);
                prop.load(is);
        } catch(IOException e) {
                System.out.println(e.toString());
                return "";
        }
	return prop.getProperty(propertyName);
    }
}
