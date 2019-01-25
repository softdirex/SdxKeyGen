/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.softdirex.sdxkeygen.entities;

import cl.softdirex.sdxkeygen.utils.Encrypt;

/**
 *
 * @author zenta
 */
public class Key {
    public static String keyGenerate(String url,String licencia, String pass){
        return Encrypt.enCrypt(url+"="+licencia+"="+pass);
    }
    
    public static String tokenGenerate(String bd,String bdUser, String bdPass, String bdUrl){
        return Encrypt.enCrypt(bd+"="+bdUser+"="+bdPass+"<"+bdUrl);
    }
}
