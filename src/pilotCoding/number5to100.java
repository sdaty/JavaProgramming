package pilotCoding;

public class number5to100 {
    public static void main(String[] args) {
        int number = 5;
        while(number<100){
            number += number;
        }
        System.out.println(number);
        // output= 160 (5+5+10+20+40+80)
    }
}
