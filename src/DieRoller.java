import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        Scanner scanner = new Scanner(System.in);
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        String playAgain = "";
        boolean done = true;

        while (done) {
            boolean foundTriple = false;
            int rollNum = 1;

            System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("____________________________________________");

            while (!foundTriple) {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d%-10d%-10d%-10d%-10d\n", rollNum, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    foundTriple = true;
                }
                rollNum++;
            }

            System.out.println("Do you want to roll again? [Yes/No]: ");
            playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("Yes")) {
                done = false;
            }
        }
    }
}
