public class SecondTask {

    public static void main(String[] args) {

        String word1 = "KOL EINU ŠUNIE LOK";
        String word2 = "ARGI TEN NE TIGRA";
        String word3 = "SĖDĖK UŽU KĖDĖS";

        if (isPalindrome(word1)) {
            System.out.println("Žodis " + word1 + " palindromas");
        } else {
            System.out.println("Žodis " + word1 + " nėra palindromas");
        }
        if (isPalindrome(word2)) {
            System.out.println("Žodis " + word2 + " palindromas");
        } else {
            System.out.println("Žodis " + word2 + " nėra palindromas");
        }
        if (isPalindrome(word3)) {
            System.out.println("Žodis " + word3 + " palindromas");
        } else {
            System.out.println("Žodis " + word3 + " nėra palindromas");
        }
    }
    private static boolean isPalindrome(String palindrome) {
        String withoutSpacePalindrome = palindrome.replace(" ", "");
        boolean val = false;
        for (int i = 0; i > withoutSpacePalindrome.length(); i++) {
            char a = withoutSpacePalindrome.charAt(i);
            char b = withoutSpacePalindrome.charAt(withoutSpacePalindrome.length() - 1 - i);
            if (a != b) {
                val = true;
                break;
            }
        }
        return val;
    }
}
