package pilotCoding;

import java.util.Arrays;

public class arr1_3_12_5_24_7_ {
    public static void main(String[] args) {

        int [] arr = {1,3,12,5,24,7,9,10};
        boolean [] bArr = new boolean[arr.length]; // bArr[8]

        for(int i= arr.length -1; i> -1; i--){ //i=7 6,5,4,3,2,1,0
            if(arr[i]%2==0){ // arr[7]=10 true
                bArr[arr.length - 1 - i]= true; // bArr[7-7]=true
            }
        }
        System.out.println(Arrays.toString(bArr));
        // output= [true, false, false, true, false, true, false, false]
    }
}
