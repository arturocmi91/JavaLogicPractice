import java.util.Scanner;

public class R3Anagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();
        String newPhrase = makeAnagram(phrase);
        System.out.println(newPhrase);

    }

    public static String makeAnagram(String phrase) {
//Incializo revPrhase
        StringBuilder revPhrase = new StringBuilder();
        int n = phrase.length();
        for (int i = 0; i < n; i++) {
            //0 1 2  lengh 3
            //a b c

            //Con metodo  StringBuilder
           revPhrase.append(phrase.substring(n - i - 1, n - i));
           //Con String en revPhrase
            // revPhrase = revPhrase + phrase.substring(n - i - 1, n - i);
        }
        return revPhrase.toString();

    }
}
