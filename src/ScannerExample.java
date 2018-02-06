import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //objekta nuskaito is konsoles
        String name = "";
        do {
            System.out.println("Įveskite savo vardą");
            name = sc.nextLine(); //nuskaito visa ivesta eilute
            System.out.println("Jusu vardas yra " + name);
            ScannerExample scannerExample = new ScannerExample(); //musu klases objektas
            int countChar = scannerExample.countChars(name);
            if (name.length() % 2 == 0) {
                System.out.println("Įvestas žodis " + name + " yra lyginis, ilgis "
                        + name.length() + " rasta raidziu " + countChar);
            } else {
                System.out.println("Įvestas žodis " + name + " yra nelyginis, ilgis "
                        + name.length() + " rasta raidziu " + countChar);
            }
        } while (!name.equals("pabaiga"));


        //String name = sc.next(); //naudojamas nuskaitymui iki tarpo


        String a = "Petras";
        String b = "Petras";

        if (args.equals(b)) {//tikrinam stringus tik su equal metodu
            System.out.println("Lygus");
        } else {
            System.out.println("Nelygus");
        }
        int length = name.length();


    }

    private int countChars(String name) {
        int numb = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A') {
                numb++;
            }
        }
        return numb;

    }
}
