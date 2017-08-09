package com.cc;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Administrator on 2017/7/18.
 */
public class MD5Utils {

    public static String toMd5(String str) {
        StringBuffer md5Code = new StringBuffer() ;
        try {
            //获取加密方式为md5的算法对象
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] digest = instance.digest(str.getBytes());
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 0xff);
                if (hexString.length() < 2) {
                    hexString = "0"+hexString;
                }
                md5Code = md5Code.append(b);
            }
        } catch (NoSuchAlgorithmException e) {

        }
        return md5Code.toString();

    }

    public static void main(String[] args) {
        String s = getMD5("0");
        System.out.println(s);
    }

    public  static String getMD5(String message) {
        String md5str = "";
        try  {
            MessageDigest  md = MessageDigest.getInstance("MD5");
            byte[]  input = message.getBytes();
            byte[]  buff = md.digest(input);
            md5str   = bytesToHex(buff);
        }
        catch(Exception e) {
        }
        return  md5str;
    }
    public static String getMD5(File file) {
        FileInputStream fis = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            fis = new FileInputStream(file);
            byte[] buffer = new byte[2048];
            int length = -1;
            while ((length = fis.read(buffer)) != -1) {
                md.update(buffer, 0, length);
            }
            byte[] b = md.digest();
            return bytesToHex(b);
        } catch (Exception e) {
            return null;
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
            }
        }
    }
    private static String bytesToHex(byte[] bytes) {
        StringBuffer   md5str = new  StringBuffer();
        //把数组每一字节换成16进制连成md5字符串
        int  digital;
        for  (int i = 0; i < bytes.length; i++) {
            digital = bytes[i];
            if(digital< 0) {
                digital+= 256;
            }
            if(digital< 16){
                md5str.append("0");
            }
            md5str.append(Integer.toHexString(digital));
        }
        return   md5str.toString().toUpperCase();
    }


}