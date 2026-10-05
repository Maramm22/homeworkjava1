import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String zooName;
        do {
            System.out.print("Enter the zoo name: ");
            zooName = input.nextLine().trim();
            if (zooName.isEmpty()) {
                System.out.println("Error: the name cannot be empty. Try again.");
            }
        } while (zooName.isEmpty());

        int nbrCages = 0;
        while (nbrCages <= 0) {
            System.out.print("Enter the number of cages: ");
            if (input.hasNextInt()) {
                nbrCages = input.nextInt();
                if (nbrCages <= 0) {
                    System.out.println("Error: the number must be greater than 0. Try again.");
                }
            } else {
                System.out.println("Error: please enter a whole number. Try again.");
                input.next(); // throw away the wrong input
            }
        }

        System.out.println(zooName + " has " + nbrCages + " cages.");



    }
}