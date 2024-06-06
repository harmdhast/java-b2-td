package td01;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {
            System.out.println("Bienvenue dans le programme Java!");

            System.out.print("Veuillez saisir une valeur entière : ");
            int valeur = scanner.nextInt();

            System.out.println("Vous avez saisi : " + valeur);

            if (valeur >= 0) {
                System.out.println("Cette valeur est positive.");
                System.out.println("Le double de cette valeur est : " + (valeur * 2));
            } else {
                System.out.println("Cette valeur est négative.");
                int oppose = -valeur;
                System.out.println("L'opposé de cette valeur est : " + oppose);
                valeur = oppose;
                System.out.println("La valeur est maintenant positive : " + valeur);
            }

            if (valeur >= 5 && valeur <= 20) {
                System.out.println("Cette valeur est comprise entre 5 et 20.");
            } else if (valeur < 5) {
                System.out.println("Cette valeur est inférieure à 5.");
            } else {
                System.out.println("Cette valeur est supérieure à 20.");
            }

            int choix = 0;
            while (choix < 1 || choix > 6) {
                System.out.println("Choisissez une option : ");
                System.out.println("1. Calculer le double");
                System.out.println("2. Calculer le triple");
                System.out.println("3. Calculer l'opposé");
                System.out.println("4. Afficher tous les nombres entiers entre 1 et " + valeur);
                System.out.println("5. Afficher tous les multiples de 3 entre 1 et " + valeur);
                System.out.println("6. Afficher la somme et la moyenne des entiers entre 1 et " + valeur);

                choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("Le double de cette valeur est : " + (valeur * 2));
                        break;
                    case 2:
                        System.out.println("Le triple de cette valeur est : " + (valeur * 3));
                        break;
                    case 3:
                        System.out.println("L'opposé de cette valeur est : " + (-valeur));
                        break;
                    case 4:
                        System.out.println("Les nombres entiers compris entre 1 et " + valeur + " sont :");
                        for (int i = 1; i <= valeur; i++) {
                            System.out.println(i);
                        }
                        break;
                    case 5:
                        System.out.println("Les multiples de 3 compris entre 1 et " + valeur + " sont :");
                        int count = 0;
                        for (int i = 1; i <= valeur; i++) {
                            if (i % 3 == 0) {
                                System.out.println(i);
                                count++;
                            }
                        }
                        System.out.println("Il y a " + count + " multiples de 3 entre 1 et " + valeur);
                        break;
                    case 6:
                        int somme = 0;
                        for (int i = 1; i <= valeur; i++) {
                            somme += i;
                        }
                        double moyenne = (double) somme / valeur;
                        System.out.println("La somme des entiers entre 1 et " + valeur + " est : " + somme);
                        System.out.println("La moyenne des entiers entre 1 et " + valeur + " est : " + moyenne);
                        break;
                    default:
                        System.out.println("Erreur : choix incorrect.");
                        break;
                }
            }

            System.out.print("Voulez-vous recommencer ? (oui/non) : ");
            String reponse = scanner.next();
            continuer = reponse.equalsIgnoreCase("oui");
        }

        System.out.println("Merci d'avoir utilisé le programme. Au revoir !");
        scanner.close();
    }
}
