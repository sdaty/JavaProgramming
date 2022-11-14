package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;
        //   short b = (short)a;  <= this happens in background
        int c = b;
        //  int c = (int)b;
        long d = c;
        float e = d;
        double f = e; // all above are implicit casting

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        System.out.println("----------------------------------");

        int x = 55;
        // short y = x; line gives an error > twice Alt+Enter fix it
        short y = (short)x; // Explicit casting
        System.out.println(x+" = "+y);

        long j = 1000000;
        short k = (short)j;
        System.out.println(j+" = "+k);

        double l = 2.5;
        float m = (float)l;
        System.out.println(l+" = "+m);

        double n = 10.8;
        int s = (int) n;
        System.out.println(n+" = "+s);



    }



}
