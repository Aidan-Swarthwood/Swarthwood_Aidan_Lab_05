import java.util.Scanner;

public class shipCostCalculator
{
    public static void main(String[] args)
    {

        double itemCost = 0;
        double shipCost = 0;
        double finalCost = 0;
        Scanner in = new Scanner(System.in);

        {
            System.out.print("Enter the price of the item you are shipping: ");
            itemCost = in.nextInt();

            if(itemCost < 100){
                shipCost = itemCost * .02;
                finalCost = shipCost + itemCost;
                System.out.println("The item with shipping is: " + finalCost + " and the shipping on the item was: " + shipCost);
            } else{
                System.out.println("You get free shpping for having an order over 100 dollars, here is the final cost: " + itemCost);
            }
        }
    }
}