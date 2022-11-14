package pilotCoding;

public class FoxRanUnderGround {
    public static void main(String[] args) {
        String str = "the fox ran under the bridge";
        str=str.substring(4,17); // str = "fox ran under" (index 17 not included)
        str.toUpperCase(); // there is no assignment this line

        System.out.println(str+"ground");
        // output = "fox ran underground"

    }
}
