package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyNumberUtils {
    public static int getCorrectNumber(Scanner scanner) { //Paduodam objektą, kuris jau sukurtas aukščiau ir pavadinam tuo pačiu vardu
        int numb = 0;
        while (true) {
            System.out.println("Įveskite skaičių");
            try {
                numb = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Sakiau įvesk skaičių");
                scanner.nextLine(); //sustabdo amzina cikla. pereina i kita eilute
            }
        }
        return numb;
    }

    public static double getCorrectDouble(Scanner scanner) {
        double numb = 0.0;
        while (true) {
            System.out.println("Įveskite skaičių");
            try {
                numb = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogas skaicius");
                scanner.nextLine();
            }
        }
        return numb;
    }

    public static double getCorrectDouble(Scanner sc, String numb) {
        double n = 0;
        try {
            n = Double.valueOf(numb);
        } catch (NumberFormatException e) {
            System.out.println("Blogai įvestas skaičius, pakartokite");
            n = getCorrectDouble(sc);
        }
        return n;
    }
}