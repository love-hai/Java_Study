package com.xhf.study.service.tool;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Slf4j
@Service
public class CalendarData {

    public String getStringOfTime(Date ...date) {
        Date time;
        if(date.length == 0) {
            time = new Date();
        }
        else {
            time = date[0];
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return sdf.format(time);
    }


    private static Integer getSecondsToNextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0); //凌晨0点
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return (int) ((calendar.getTimeInMillis() - System.currentTimeMillis()) / 1000);
    }

    private static void dataToLong() {
        Date date = new Date();
        System.out.println(date.getTime());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            log.error("error", e);
        }
        log.info(String.valueOf(System.currentTimeMillis()));
    }

    private static Long DataStringToLong(Date d) {
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Long epho = df.parse(df.format(d)).getTime() / 1000;
            return epho;
        } catch (ParseException e) {
            log.error("error", e);
            return null;
        }
    }

    private static String getNowDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }


        public static int compare(String version1, String version2) {
            String[] v1 = version1.split("\\.");
            String[] v2 = version2.split("\\.");

            int length = Math.max(v1.length, v2.length);
            for (int i = 0; i < length; i++) {
                int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
                int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
                if (num1 != num2) {
                    return num1 - num2;
                }
            }
            return 0;
        }

        public static void main(String[] args) {
            System.out.println("Result: " + compare("1.10.3", "1.9.0")); // Output: 1 (means version 1.10.3 is greater than version 1.9.0)
            System.out.println("Result: " + compare("1.9.0", "1.9.0")); // Output: 0 (means version 1.9.0 is equal to version 1.9.0)
            System.out.println("Result: " + compare("1.8.0", "1.9.0")); // Output: -1 (means version 1.8.0 is less than version 1.9.0)
        }

}
