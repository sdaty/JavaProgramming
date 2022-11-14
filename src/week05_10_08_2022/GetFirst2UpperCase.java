package week05_10_08_2022;

public class GetFirst2UpperCase {
    public static void main(String[] args) {

        String str= "Hello";
        String a = str.toUpperCase();
        String result =""+a.charAt(0) + a.charAt(1);
        System.out.println(result);



    }
}
