public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim(); // remove extra spaces

        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            length++;
        }

        return length;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // 5
    }
}