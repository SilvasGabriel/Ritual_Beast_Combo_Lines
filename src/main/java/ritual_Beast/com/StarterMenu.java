package ritual_Beast.com;

import java.util.Scanner;

public class StarterMenu {

    private final  Scanner scanner;

    public StarterMenu(Scanner scanner) {
        this.scanner = scanner;
        displayMenuStarter();
    }

    public void  displayMenuStarter(){
        while (true){
            System.out.println("What combo line of the ritual beast do you wanna follow:");
            System.out.println("If wanna choose a line type a number on the list.");
            System.out.println("""
                    1 - Cannahawk - Ending Ulti-Gaiapelio
                    2 - Cannahawk - Ending Colossus\s
                    3 - Cannahawk - Ending Protos Fire/Dark
                    4 - Cannahawk - Shifter
                    5 - Cannahawk - Nibiru, The Primal Being
                    6 - Rampengu - Ending Protos Fire
                    7 - Rampengu - Shifter
                    8 - RBT Elder + Cannahawk - Ending Protos Fire or S.P/I.P
                    9 - RBT Elder + Cannahawk - Ending Thunder Dragon Colossus
                    10 - RBT Elder + Cannahawk - Shifter
                    11 - RBT Elder + Cannahawk - Nibiru Line with Apollousa
                    12 - RBT Elder + Cannahawk - Nibiru Line with Ritual Beast Ulti-Gaiapelio Protos DARK
                    13 - RBT Elder + Rampengu
                    14 - RBT Elder + Rampengu - Shifter
                    15 - E-Teleport + Apelio
                    16 - E-Teleport + E-Teleport\s
                   \s"""
            );
            System.out.println("If you wanna terminate the program type exit...");

            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Thank you for using the combo lines memoir");
                break;
            }


            try {

                int choice = Integer.parseInt(input);
                CombosMenu combo = new CombosMenu(scanner);

                switch (choice){

                    case 1 -> combo.cannahawkBLines1();
                    case 2 -> combo.cannahawkBLines2();
                    case 3 -> combo.cannahawkBLines3();
                    case 4 -> combo.cannahawkBLines4();
                    case 5 -> combo.cannahawkBLines5();
                    case 6 -> combo.rampenguBLines1();
                    case 7 -> combo.rampenguBLines2();
                    case 8 -> combo.elderCannahawkBLines1();
                    case 9 -> combo.elderCannahawkBLines2();
                    case 10 -> combo.elderCannahawkBLines3();
                    case 11 -> combo.elderCannahawkBLines4();
                    case 12 -> combo.elderCannahawkBLines5();
                    case 13 -> combo.elderRampenguBLines1();
                    case 14 -> combo.elderRampenguBLines2();
                    default -> System.out.println("Invalid choice. Please select a number between 1 and 15.");

                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'return' to go back.");
            }

        }
    }


}
