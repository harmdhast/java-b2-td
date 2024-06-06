package td03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex02 {
    static String input = "";

    public static void println(String str) {
        System.out.println(str);
    }

    // Retourne une liste des mots de la phrase
    static String[] words() {
        return input.replace(".", "").split(" ");
    }

    // Retourne le nombre de caractères
    static int charCount() {
        return input.length();
    }

    // Retourne le nombre de mots
    static int wordCount() {
        return words().length;
    }

    // Retourne le nombre d'occurence d'une lettre
    static int letterCount(char letter) {
        int count = 0;
        for (char chr : input.toCharArray()) {
            if (chr == letter) count++;
        }
        return count;
    }

    // Retourne vrai si la phrase contient le mot
    static boolean hasWord(String word) {
        return input.contains(word);
    }

    // Remplacer les voyelles par la position dans l'alphabet
    static String replaceVowels() {
        return input.replace("a", "1")
                .replace("e", "5")
                .replace("i", "9")
                .replace("o", "15")
                .replace("u", "21")
                .replace("y", "25");
    }

    // Appliquer le code César à la phrase
    static String cesarCode(int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : input.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Fonction utilitaire pour inverser le sens d'un mot
    static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    // Inverser la place des mots dans la phrase
    static String reverseWords() {
        List<String> reversedList = Arrays.asList(words());
        Collections.reverse(reversedList);
        return String.join(" ", reversedList);
    }

    // Inverser les lettres de chaque mot dans la phrase
    static String reverseWordsLetters() {
        String[] reversedLetters = words();
        for (int i = 0; i < reversedLetters.length; i++) {
            reversedLetters[i] = reverse(reversedLetters[i]);
        }
        return String.join(" ", reversedLetters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Initialiser la phrase
        while (input.length() > 150 || input.isEmpty()) {
            println("Entrer la phrase pour commencer : ");
            input = scanner.nextLine();
        }
        println("Ma phrase : " + input);


        // Main loop
        while (running) {
            println("MENU");
            println("");
            println("1. Afficher les mots");
            println("2. Afficher le nombre de caractères");
            println("3. Afficher le nombre de mots");
            println("4. Compter les occurences d'une lettre");
            println("5. Chercher un mot");
            println("6. Remplacer les voyelles");
            println("7. Code césar");
            println("8. Inverser la phrase");
            println("9. Inverser les mots");
            println("10. Inverser les lettres des mots");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    println("Mots dans la phrase :");
                    for (String word : words()) {
                        println(word);
                    }
                    break;

                case 2:
                    println("La phrase comporte " + charCount() + " caractère(s)");
                    break;

                case 3:
                    println("La phrase comporte " + wordCount() + " mot(s)");
                    break;

                case 4:
                    println("Quelle lettre voulez vous compter : ");
                    char c = scanner.next().toCharArray()[0];
                    println("La lettre '" + c + "' est présente " + letterCount(c) + " fois");
                    break;

                case 5:
                    println("Quel mot voulez vous chercher : ");
                    String word = scanner.next();
                    if (hasWord(word)) {
                        println("Le mot " + word + " est présent");
                    } else {
                        println("Le mot " + word + " n'est pas présent");
                    }
                    break;

                case 6:
                    println("Phrase avec les voyelles remplacées : " + replaceVowels());
                    break;

                case 7:
                    println("Décalage du code César : ");
                    println("Phrase décalée : " + cesarCode(scanner.nextInt()));
                    break;

                case 8:
                    println("Phrase inversée : " + reverse(input));
                    break;

                case 9:
                    println("Phrase mots inversés : " + reverseWords());
                    break;

                case 10:
                    println("Phrase lettre des mots inversés : " + reverseWordsLetters());
                    break;
            }

            // Demander a l'utilisateur de rester dans le programme
            println("Voulez vous continuer ? (oui/non)");
            running = scanner.next().equalsIgnoreCase("oui");
        }
    }
}
