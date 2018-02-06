import java.util.InputMismatchException;
import java.util.Scanner;

public class JonoKMI {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        double num = getCorrectNuber(sc);
        System.out.println("Įveskite savo svorį");
        a = sc.nextDouble();
        System.out.println("Įveskite savo ūgį");
        b = sc.nextDouble();

        System.out.println("Jūsų KMI yra " +KMI(a, b));
    }
    private static double KMI(double a, double b){
        return Math.pow(b, 2) * a;
    }

    private static double getCorrectNuber(Scanner sc) {
        double numb = 0.0;
        while (true) {
            System.out.println("Įveskite skaičių");
            try {
                numb = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai įvestas skaičius");
                sc.nextLine();
            }
        }
        return numb;
    }
}
