
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matematika {

    public static void main(String[] args) {

        System.out.println("Įveskite pasirinktos figūros skaičių: \n 1. trikampis \n 2. stačiakampis \n 3. kvadratas  \n 4. apskritimas");
        Scanner sc = new Scanner(System.in);
        int action = getCorrectNumber(sc); //nuskaito iš konsolės ir konvertuoja į int
        double a;
        double b;

        switch (action) {
            case 1:
                System.out.println("Jūs pasirinkote skaičiuoti trikampio plotą");
                System.out.println("Įveskite kraštinę a");
                a = sc.nextDouble();
                System.out.println("Įveskite kraštinę b");
                b = sc.nextDouble();
                System.out.println("Trikampio plotas yra  " + TrikampioPlotas(a, b));
                break;
            case 2:
                System.out.println("Jūs pasirinkote skaičiuoti stačiakapio plotą");
                System.out.println("Įveskite kraštinę a");
                a = sc.nextDouble();
                System.out.println("Įveskite kraštinę b");
                b = sc.nextDouble();
                System.out.println("Stačiakampio plotas yra  " + StaciakampioPlotas(a, b));
                break;
            case 3:
                System.out.println("Jūs pasirinkote skaičiuoti kvadrato plotą");
                System.out.println("Įveskite kraštinės ilgį");
                a = sc.nextDouble();
                System.out.println("Stačiakampio plotas yra  " + KvadratoPlotas(a));
                break;
            case 4:
                System.out.println("Jūs pasirinkote skaičiuoti apskritimo plotą");
                System.out.println("Įveskite spindulio ilgį");
                a = sc.nextDouble();
                System.out.println("Apskritimo plotas yra  " + ApskritimoPlotas(a));
                break;
            default:
                System.out.println("Nėra tokoi veiksmo");
        }

    }

    private static double TrikampioPlotas(double a, double b) {
        return (a * b) / 2;
    }

    private static double StaciakampioPlotas(double a, double b) {
        return a * b;
    }

    private static double KvadratoPlotas(double a) {
        return a * a;
    }

    private static double ApskritimoPlotas(double a) {
        return Math.PI * (a * a);
    }

    private static int getCorrectNumber(Scanner scanner) { //Paduodam objektą, kuris jau sukurtas aukščiau ir pavadinam tuo pačiu vardu
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

    private static double getCorrectDouble(Scanner scanner) {
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
}
