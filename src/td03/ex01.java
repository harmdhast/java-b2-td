package td03;

import java.util.*;

public class ex01 {
    static ArrayList<Integer> myList = new ArrayList<>();

    public static void println(String str) {
        System.out.println(str);
    }

    // Retourne une liste des nombres plus grand que a
    static List<Integer> numbersBiggerThan(int a) {
        return myList.stream().filter(n -> n > a).toList();
    }

    // Retourne une liste des entiers positifs
    static List<Integer> onlyPositive() {
        return myList.stream().filter(n -> n >= 0).toList();
    }

    // Retourne une liste des entiers négatifs
    static List<Integer> onlyNegative() {
        return myList.stream().filter(n -> n < 0).toList();
    }

    // Somme des entiers de la liste
    static int arraySum() {
        int sum = 0;
        for (Integer integer : myList) {
            sum += integer;
        }
        return sum;
    }

    // Moyenne de la liste
    static float listAverage() {
        return (float) arraySum() / myList.size();
    }

    // Retourne une liste des entiers triés dans l'ordre ascendant
    static Integer[] sortAsc() {
        Integer[] sortedList = myList.toArray(new Integer[0]);
        Arrays.sort(sortedList);
        return sortedList;
    }

    // Retourne une liste des entiers triés dans l'ordre descendant
    static Integer[] sortDesc() {
        Integer[] sortedList = myList.toArray(new Integer[0]);
        Arrays.sort(sortedList, Collections.reverseOrder());
        return sortedList;
    }

    // Rechercher un élément dans la liste
    static void searchElement(int searchVal) {
        if (myList.contains(searchVal)) {
            println("Votre élément se trouve à l'indexe " + myList.indexOf(searchVal));
        } else {
            println("Cet élément n'existe pas dans la liste");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Remplir le tableau initial
        for (int i = 1; i < 16; i++) {
            println("Entrer un nombre pour la position " + i + " : ");
            int val = scanner.nextInt();
            if (val < -15 || val > 50) {
                i--;
                println("La valeur doit être comprise entre -15 et 50.");
            } else {
                myList.add(val);
            }
        }

        println("Ma liste : " + myList);

        // Main loop
        while (running) {
            println("MENU");
            println("");
            println("1. Chercher un élément");
            println("2. Afficher les éléments supérieur à un nombre");
            println("3. Afficher les nombres positifs");
            println("4. Afficher les nombres négatifs");
            println("5. Moyenne du tableau");
            println("6. Afficher les éléments par ordre croissant");
            println("7. Afficher les éléments par ordre décroissant");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    println("Quel élément voulez-vous rechercher ? ");
                    searchElement(scanner.nextInt());
                    break;

                case 2:
                    println("Afficher les éléments supérieurs à quel nombre ? ");
                    println(numbersBiggerThan(scanner.nextInt()).toString());
                    break;

                case 3:
                    println("Nombres positifs du tableau : ");
                    println(onlyPositive().toString());
                    break;

                case 4:
                    println("Nombres négatifs du tableau : ");
                    println(onlyNegative().toString());
                    break;

                case 5:
                    println("Moyenne du tableau : " + listAverage());
                    break;

                case 6:
                    println("Tableau par ordre croissant : " + Arrays.toString(sortAsc()));
                    break;

                case 7:
                    println("Tableau par ordre décroissant : " + Arrays.toString(sortDesc()));
                    break;
            }

            // Demander a l'utilisateur de rester dans le programme
            println("Voulez vous continuer ? (oui/non)");
            running = scanner.next().equalsIgnoreCase("oui");
        }
    }
}
