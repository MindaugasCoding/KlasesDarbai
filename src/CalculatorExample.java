import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import utils.MyNumberUtils;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Įveskite 2 skaičius ir veiksmą tarp jų pvz.: '10 + 10'");
        String line = scanner.nextLine();
        //10_+_10
        String[] items = line.split(" ");
        if (items.length == 3) {
            meniu(items, scanner);
        } else {
            System.out.println("Blogai įvestas formatas");
        }
    }
    private static void meniu(String[] items, Scanner sc) {
        double numb = MyNumberUtils.getCorrectDouble(sc, items[0]);
        double numb1 = MyNumberUtils.getCorrectDouble(sc, items[2]);
        switch (items[1]) {
            case "+":
                sum(numb, numb1);
                break;
            case "-":
                minus(numb, numb1);
                break;
            case "*":
                daugyba(numb, numb1);
                break;
            case "^":
                kvadr(numb, numb1);
                break;
            default:
                System.out.println("Netra tokio skaiciaus");
        }
    }
    private static void sum(double numb, double numb1) {
        double mySum = numb + numb1;
        System.out.println("Suma yra " + mySum);
    }

    private static void minus(double numb, double numb1) {
        double myMinus = numb - numb1;
        System.out.println("Suma yra " + myMinus);
    }

    private static void daugyba(double numb, double numb1) {
        double myDaugyba = numb * numb1;
        System.out.println("Suma yra " + myDaugyba);
    }

    private static void kvadr(double numb, double numb1) {
        double myKvadr = Math.pow(numb, numb1);
        System.out.println("Suma yra " + myKvadr);
    }
}
