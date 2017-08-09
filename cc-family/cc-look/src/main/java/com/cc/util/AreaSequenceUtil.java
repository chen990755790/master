package com.cc.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by Administrator on 2017/6/1.
 */
public class AreaSequenceUtil implements Closeable{

    public static final int[] elements = new int[1000];
    public static int index = 1;


    public static int getMinSequence(){
        for (int i = index;i< elements.length;i++){
            if (elements[i]==0){
                index = i;
                elements[i] = i;
                return i;
            }
        }
        return index;
    }

    public static void recycleIndex(int i){
        elements[i] = 0;
        if (i<index) {
            index = i;
        }
    }

    public void close() throws IOException {

    }
}
