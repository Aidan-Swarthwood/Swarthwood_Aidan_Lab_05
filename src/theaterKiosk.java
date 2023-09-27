import java.util.Scanner;

public class theaterKiosk
{
    public static void main(String[] args)
    {

        int age = 0;
        Scanner in = new Scanner(System.in);

        {
            System.out.print("Enter your age please: ");
            age = in.nextInt();

            if(age >= 21)
            {
                System.out.println("you get a wristband" );
            } else
            {
            }
        }
    }
}