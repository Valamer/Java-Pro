import java.util.Random;
import java.util.Scanner;

public class Main {

    /*Task says that we must hide word length from user, so this constant created to change displayed word length
    * (number of '#' symbols in console) */
    final static int wordLengthDisplay = 15;

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        Random randomizer = new Random();
        Scanner scanner = new Scanner(System.in);
        String word = words[randomizer.nextInt(words.length)];
        /* Line of found at right position letters*/
        StringBuilder guessed = new StringBuilder();
        /* Because, at start, we know no right letters, we just fill guessed with '#' */
        for (int i = 0; i < wordLengthDisplay; i++) {
            guessed.append('#');
        }
        while (true) {
            System.out.println("Enter word: ");
            String guess = scanner.nextLine().toLowerCase();
            if (guess.equals(word)) {
                System.out.println("Answer correct! You Win!");
                break;
            }
            for (int i = 0; i < Math.min(word.length(),guess.length()); i++) {
                if (word.charAt(i) == guess.charAt(i)) guessed.setCharAt(i,word.charAt(i));
            }
            System.out.println(guessed);
        }
    }

    /* I find no usage of next methods in game, but leave them, because they are part of task */

    public static int findSymbolOccurance (String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) { count++; }
        }
        return count;
    }

    public static int findWordPosition (String source, String target) {
        if (!source.contains(target)) { return -1; }
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == target.charAt(0)) {
                int result = i;
                for (int j = 0; j < target.length(); j++,i++) {
                    if (source.charAt(i) != target.charAt(j)) break;
                    if (j == target.length() - 1) return result;
                }
            }
        }
        return -1;
    }

    public static String stringReverse (String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static boolean isPalindrome (String s) {
        String reversed = stringReverse(s);
        return reversed.equals(s);
    }
}
