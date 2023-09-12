import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);

        int userChoice = 0;
        do {
            System.out.println("""            
                    Velkommen til SUPERHERO UNIVERSET!
                    1. Opret ny superhelt
                    9. Afslut
                    """);

            while (scanner.hasNextInt() == false) {
                scanner.next();
                System.out.println("Ugyldigt input. Du skal indtaste tal");
            }
            userChoice = scanner.nextInt();
            scanner.nextLine(); //Håndtering af Scanner Bug

            if (userChoice == 1) {
                System.out.println("Indtast heltenavn");
                String name = scanner.nextLine();
                System.out.println("Indtast rigtigt navn");
                String realName = scanner.nextLine();
                System.out.println("Indtast superkraft");
                String superPower = scanner.nextLine();
                System.out.println("Indtast oprindelsesår");
                while (!scanner.hasNextInt()) {
                    System.out.println("Du skal indtaste et tal");
                    scanner.next();
                }
                int yearcreated = scanner.nextInt();
                System.out.println("Indtast om helt er et menneske (j/n)");
                String isHumanString = scanner.next();
                boolean isHuman = isHumanString.equalsIgnoreCase("j");
                System.out.println("Indtast styrke (decimaltal med komma)");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Du skal indtaste et kommatal");
                    scanner.next();
                }
                double strength = scanner.nextDouble();

                database.addSuperhero(name, realName, superPower, yearcreated, isHuman, strength);

            }

        } while (userChoice != 9);

    }
}
