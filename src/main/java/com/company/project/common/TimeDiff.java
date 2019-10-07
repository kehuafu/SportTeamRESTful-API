package com.company.project.common;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDiff {
    /*
     * 计算两个时间差
     */
    public static double timeDiff(String current, String last) {
        Date d1 = null;
        Date d2 = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            d1 = sdf.parse(last);
            d2 = sdf.parse(current);
        } catch (ParseException pe) {
            System.out.println(pe.getMessage());
        }
        long dd1 = d1.getTime();
        long dd2 = d2.getTime();
        double hours = (double)(dd2 - dd1) / 3600 / 1000;
        return hours;
    }
}