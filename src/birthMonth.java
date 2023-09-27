import java.util.Scanner;

public class birthMonth {

    public static void main(String[] args) {

        double birthMonth = 0;
        Scanner in = new Scanner(System.in);

            System.out.print("Enter your birth month [1 - 12]: ");
            if (in.hasNextInt())
            {
                birthMonth = in.nextInt();
                in.nextLine();

                if (birthMonth <= 12 && birthMonth >= 1)
                {
                    System.out.println("Your birth month is: " + birthMonth);
                } else {
                    System.out.println("You entered an incorrect month value: " + birthMonth);
                }
            }
    }
}