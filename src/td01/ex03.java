package td01;

import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un nombre : ");
        int value = scanner.nextInt();
        System.out.println("Vous avez entré le nombre " + value);

        ArrayList<Integer> valueList = new ArrayList<>();
        valueList.add(value);

        while (true) {
            System.out.print("Entrer un nombre : ");
            value = scanner.nextInt();
            if (value < valueList.getLast()) {
                System.out.println("Le nombre entré est inférieur au précédent !");
                break;
            }
            System.out.println("Vous avez entré le nombre " + value);
            valueList.add(value);
        }

        System.out.println("Vous avez entré " + valueList.size() + " valeur(s).");

        int sum = 0;
        for (int i : valueList) {
            sum += i;
        }

        System.out.println("La somme des valeurs de la liste est : " + sum);
    }
}
