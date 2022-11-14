package pilotCoding;

public class strs {
    public static void main(String[] args) {
        String [] strs = {"display","population","meeting","copy","franchise"};

        int a = strs.length; // a=5
        int b = strs[5].length(); // b= /error

        System.out.println(a+" "+b);
        // output = error message (there is no 5th index, out of bounds)
    }
}
