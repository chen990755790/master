package com.cc;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Administrator on 2017/7/13.
 */
public class TestFileMatcher {

    public static void main(String[] args) {
        File file = new File("E:\\11");
        String[] list = file.list(new FilenameFilter() {

            public boolean accept(File dir, String name) {
                return name.matches("");
            }
        });
        System.out.println(list[0]);
    }


}
