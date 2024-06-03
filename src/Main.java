public class Main {
    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching","coding"));

    }

    public static int appendCharacters(String s, String t) {
        int sPos = 0;
        int tPos = 0;

        while(sPos<s.length()&&tPos<t.length()) {
            if (s.charAt(sPos)==t.charAt(tPos)) {
                sPos++;
                tPos++;
            } else {
                sPos++;
            }
        }
        return t.length()-tPos;

    }
}