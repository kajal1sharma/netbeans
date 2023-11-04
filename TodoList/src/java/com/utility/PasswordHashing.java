/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utility;

import java.security.MessageDigest;

/**
 *
 * @author ashis
 */
public class PasswordHashing {
     static public String doHash(String password){
         try{
            MessageDigest md = MessageDigest.getInstance("MD5");    
            md.update(password.getBytes());
            byte[] hashedPassword =  md.digest();

            String s="";
            for(byte b :  hashedPassword){
                s+=String.format("%02x", b);
            }

            return s;
//            System.out.println(s);
        }
        catch(Exception e){
            return null;
        }
    }
}
