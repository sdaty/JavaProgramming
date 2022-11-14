package pilotCoding;

public class popcorn {
    public static void main(String[] args) {
        String z="popcorn";
        z=z.substring(1,8); // z= opcorn

        if(z.equals("opcor")){
            System.out.println(z.length());
        }else {
            System.out.println(z.replace("o,","a")); // there is no "o,"
        }
        // output = errors about length, popcorn has 7 length, thereis no substring 8.length
    }
}
