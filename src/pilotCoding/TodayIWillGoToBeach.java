package pilotCoding;

public class TodayIWillGoToBeach {
    public static void main(String[] args) {
        String a="today I will go to the beach";
        boolean b=a.contains("i"); // true
        boolean c=a.substring(12).startsWith("go"); // false (starts with " go"

        String result=b&&c?"go":"don't go";
        System.out.println(result);
        // output = don't go

    }
}
