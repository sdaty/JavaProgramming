package week02_09_17_2022;

public class BasicCalculator {

    public static void main(String[] args) {
        int num1, num2;
        num1 = 29;
        num2 = 5;

        int sum = num1+num2;
        int subtract = num1 - num2;
        int multiply = num1*num2;
        float divide = num1/num2;
        int reminder = num1%num2;

        System.out.println("reminder = " + reminder);
        System.out.println("divide = " + divide);
        System.out.println("multiply = " + multiply);
        System.out.println("subtract = " + subtract);
        System.out.println("sum = " + sum);


    }


}
