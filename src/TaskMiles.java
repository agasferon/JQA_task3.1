import java.util.InputMismatchException;
import java.util.Scanner;
public class TaskMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a ticket price: ");
        int ticketPrice = 0;

        try {
            ticketPrice = in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Value exceeded");
        }

        if (ticketPrice <= 0){
            System.out.println("Are you sure?");
        } else {
            int bonusMiles = ticketPrice / 20;
            System.out.println("You get " + bonusMiles + " bonus miles!");
        }
    }
}