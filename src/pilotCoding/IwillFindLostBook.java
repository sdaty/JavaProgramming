package pilotCoding;

public class IwillFindLostBook {
    public static void main(String[] args) {
        String s = "I will find the lost book";
        String word = "";
        //System.out.println(s.length()-1);


        for(int index = s.length()-1; index <= 0; index--){ //????????????
            word += s.charAt(index);
        }
        System.out.println(word);
        // ?????????????????????

    }
}
