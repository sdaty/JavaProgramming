package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        double PI = 3.14;
        double radius = 3.5; //yarıçap
        double diameter = radius * 2; //çap
        double area = PI * radius * radius;
        double perimeter = 2 * radius * PI; //çevre
        System.out.println("PI = " + PI);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }


}
