package Es3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals(":q")) {

            System.out.println("Inserisci una stringa (:q per uscire)");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                int i = 0;
                while (i < input.length()) {
                    System.out.print(input.charAt(i));
                    if (i < input.length() - 1) {
                        System.out.print(",");
                    }
                    i++;
                }
                System.out.println();
            }
        }
    }
}
