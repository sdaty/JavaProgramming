package pilotCoding;

import java.util.Arrays;

public class array_nums01234 {
    public static void main(String[] args) {
        int [] nums = new int [5];
        int a = 5;

        nums[2]=a--; // 5 (a=4)
        nums[0]= a*2; // 8 (a=4)
        nums[4]= --a + (a-9); // -3 (a=3)
        nums[1]= nums[2]; // 5
        nums[3]= nums[a-3]; // 8 (nums[0]=8)

        System.out.println(a);
        System.out.println(Arrays.toString(nums));
        // output = 8, 5, 5, 8, -3
    }
}
