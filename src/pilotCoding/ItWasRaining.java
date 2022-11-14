package pilotCoding;

public class ItWasRaining {
    public static void main(String[] args) {
        String str="The whole time it was raining.";
        do{
            System.out.println(str.charAt(0));
            str=str.substring(3);

        }while(!str.isEmpty());
        // output = T o miw in
    }
}
