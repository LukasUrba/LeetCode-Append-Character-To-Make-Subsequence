public class Main {
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching","coding"));

    }

    public static int appendCharacters(String s, String t) {
//        Creating increments to manipulate position within the while loop
        int sPos = 0, tPos = 0 ;

//        Both strings need to be not traversed through, otherwise it will be out of bounds comparison
        while(sPos<s.length()&&tPos<t.length()) {
//            if any of the characters match, they do not need to be appended
            if (s.charAt(sPos)==t.charAt(tPos)) {
                sPos++;
                tPos++;
            } else {
                sPos++;
            }
        }
//        returns the amount left in second string that needs to be appended
        return t.length()-tPos;

    }
}