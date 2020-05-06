import java.util.InputMismatchException;
import java.util.Scanner;
public class Task_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a ticket price: ");
        int ticket_price = 0;

        try {
            ticket_price = in.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Value exceeded");
        }

        if (ticket_price <= 0){
            System.out.println("Are you sure?");
        } else {
            int bonus_miles = ticket_price / 20;
            System.out.println("You get " + bonus_miles + " bonus miles!");
        }
    }
}