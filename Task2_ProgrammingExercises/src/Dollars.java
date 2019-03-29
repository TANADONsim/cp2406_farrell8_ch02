import java.util.Scanner;

public class Dollars
{
    public static void main (String[] args)
    {
        int currency, tempcurrency, denom20, denom10, denom5, denom1;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter amount >> ");
        currency = inputDevice.nextInt();
        denom20 = currency/20;
        tempcurrency = currency - (denom20*20);
        denom10 = tempcurrency/10;
        tempcurrency = tempcurrency - (denom10*10);
        denom5 = tempcurrency/5;
        tempcurrency = tempcurrency - (denom5*5);
        denom1 = tempcurrency;
        System.out.println("The currency denominations are (" + denom20 +
                ")20s, (" + denom10 + ")10s, (" + denom5 + ")5s, (" + denom1 + ")1s.");



    }
}
