import java.util.Scanner;

public class NoticeCleaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String keyword = sc.nextLine();

        String[] words = line.trim().split(" +");

        StringBuilder sb = new StringBuilder();

        int keywordCount = 0;
        int vowels = 0;
        String shortest = words[0].toLowerCase();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (i > 0) {
                sb.append(" ");
            }
            sb.append(word);

            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }
        }

        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for (int i = 0; i < line.length(); i++) {
            char ch = Character.toLowerCase(line.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        System.out.println("Sentence: " + sb);
        System.out.println("Words: " + words.length);
        System.out.println("Shortest word: " + shortest);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowels);

        sc.close();
    }
}