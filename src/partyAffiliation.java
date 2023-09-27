import java.util.Scanner;

public class partyAffiliation
{
    public static void main(String[] args)
    {

        String partyChoice = "";
        Scanner in = new Scanner(System.in);

        {
            System.out.print("Enter your party affiliation [D R I O]: ");
            partyChoice = in.nextLine();
            {
            if(partyChoice.equals("D"))
            {
                System.out.println("You get a Democratic Donkey");
            }else if(partyChoice.equals("R"))
            {
                System.out.println("You get a Republican Rooster");
            }else if(partyChoice.equals("I")){
                System.out.println("You get an Independent Individual");
            }else {
                System.out.println("You get an Other ostritch");
            }
            }
        }
    }
}