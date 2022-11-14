package pilotCoding;

import java.util.Scanner;

public class scanner_num1_2_iterate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(); // input =
        int num2 = input.nextInt(); // input =
        int iterate = input.nextInt(); // input =

        int total = 0;

        for(int j=0; j<iterate; j++){
            if(j%3==0) continue;
            total += num1 + num2;
        }
        System.out.println(total);
        // output =
    }
}
