package week02_09_17_2022;

import java.time.LocalDateTime;

public class BonusOfWeek {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today = "+ today);

        int hour = today.getHour();
        System.out.println("hour = " + hour);

        int minute,second;
        minute = today.getMinute();
        second = today.getSecond();
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);
        System.out.println(hour + ":"+minute+":"+second);


    }


}
