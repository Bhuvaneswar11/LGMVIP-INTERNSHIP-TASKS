import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in USD: ");
        double usdAmount = sc.nextDouble();
        double conversionRate = 74.5;
        double inrAmount = usdAmount * conversionRate;
        System.out.println("Equivalent amount in Inr:" + inrAmount);
        sc.close();
    }

}