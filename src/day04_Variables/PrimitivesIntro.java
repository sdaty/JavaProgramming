package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age : 38 years old
        byte age = 38;
        // weight : 160 pounds
        short weight = 160;
        // salary : 10000$
        int salary = 100000; // 100000 is equal to 100_000
        long asset = 3_333_333_333L; // L is for defining value is not int, it is long
         // tax: 0.26
        float tax = 0.26f; // f is for defining value is not double, it is float
        double pi = 3.14;

        char ch1= 'e';
        char ch2= 1150;
        char ch3= 43100;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        boolean result = 100<56;
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        System.out.println("name = " + name);

    }
}
