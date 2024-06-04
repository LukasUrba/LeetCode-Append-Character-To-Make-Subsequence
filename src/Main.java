public class Main {
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching","coding"));

    }

    public static int appendCharacters(String s, String t) {
//        Creating increments to manipulate position within the while loop
        int sPos = 0, tPos = 0, sLength = s.length(), tLength = t.length();

//        Both strings need to be not traversed through, otherwise it will be out of bounds comparison
        while(sPos<sLength&&tPos<tLength) {
//            if any of the characters match, they do not need to be appended
            if (s.charAt(sPos)==t.charAt(tPos)) {
                tPos++;
            }
            sPos++;
        }
//        returns the amount left in second string that needs to be appended
        return tLength-tPos;

    }
}