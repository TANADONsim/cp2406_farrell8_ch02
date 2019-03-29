import java.util.Scanner;

public class Eggs
{
    public static void main (String[] args)
    {
        int order, tempOrder, dozen, loose;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter amount of eggs to order >> ");
        order = inputDevice.nextInt();
        dozen = order/12;
        tempOrder = order - (dozen*12);
        loose = tempOrder;
        System.out.println("That's " + dozen +
                " dozen at $3.25 per dozen and " + loose + " loose egg(s) at 45 cents each for a total of $" + ((dozen*3.25)+(loose*0.45)) + ".");



    }

}
