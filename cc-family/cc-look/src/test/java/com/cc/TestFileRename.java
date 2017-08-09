package com.cc;

import java.io.File;

/**
 * Created by Administrator on 2017/7/18.
 */
public class TestFileRename {
    public static void main(String[] args) {
        File file = new File("E:\\ga");
        System.out.println(file.getAbsolutePath());
        file.renameTo(new File(file.getAbsolutePath()+"me"));
    }
}
