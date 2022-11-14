package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        int minutes = 3456789;
        int year, day, day2;
        day = minutes / 1440;
        year = day/365;
        day2 = day%365;
        String result = minutes + " minutes is approximately " + year + " years and " + day2 + " days";
        System.out.println("result = " + result);

    }


}
