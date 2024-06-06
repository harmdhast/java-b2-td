package td02;

import java.util.ArrayList;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 1; i < 16; i++) {
            myList.add(i);
        }

        System.out.println("Ma liste : " + myList);
    }
}
