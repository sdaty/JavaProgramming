package pilotCoding;

public class cybertek_cbre {
    public static void main(String[] args) {

        String str = "cybertek";
        for (int i = 0; i<=str.length(); i+=2){
            System.out.print(str.charAt(i));
            // output = cbreStringIndexOutOfBoundsException
        }
    }
}
