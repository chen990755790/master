package com.cc;

import java.io.File;
import java.security.MessageDigest;

/**
 * Created by Administrator on 2017/7/10.
 */
public class TestFileCanWrite {

    public static void main(String[] args) throws Exception {

        File file = new File("E:\\hello.txt");

        MessageDigest instance = MessageDigest.getInstance("md5");

        byte[] digest = instance.digest(String.valueOf(file.length()).getBytes());

        String s = bytesToHex(digest);

        System.out.println(s+" ");

        System.out.println(file.length());

    }

    public static String bytesToHex(byte[] bytes) {

        StringBuffer md5str = new StringBuffer();

        //把数组每一字节换成16进制连成md5字符串

        int digital;

        for (int i = 0; i < bytes.length; i++) {

            digital = bytes[i];

            if (digital < 0) {

                digital += 256;

            }

            if (digital  < 16) {

                md5str.append("0");

            }

            md5str.append(Integer.toHexString(digital));

        }

        return    md5str.toString().toUpperCase();

    }

}


