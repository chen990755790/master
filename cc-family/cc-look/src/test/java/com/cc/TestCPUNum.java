package com.cc;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * Created by Administrator on 2017/6/2.
 */
public class TestCPUNum {

    public static void main(String[] args) throws ParseException {

        DecimalFormat decimalFormat = new DecimalFormat("#.000000000#");
        System.out.println(decimalFormat.parse("0.000001"));
    }
}
