/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.softdirex.sdxkeygen.entities;

import cl.softdirex.sdxkeygen.utils.Encrypt;
import cl.softdirex.sdxkeygen.utils.PropertiesUtils;

/**
 *
 * @author zenta
 */
public class Key {
    public static String keyGenerate(String licencia, String pass){
        return Encrypt.enCrypt(PropertiesUtils.getProperty("url.validate")+"="+licencia+"="+pass);
    }
    
    public static String tokenGenerate(String bd,String bdUser, String bdPass){
        return Encrypt.enCrypt(bd+"="+bdUser+"="+bdPass+"<"+PropertiesUtils.getProperty("remote.host"));
    }
}
