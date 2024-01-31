package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;
        int income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;
        
        System.out.println("Earned amount:\nBubblegum: $" + bubblegum +
                          "\nToffee: $" + toffee +
                          "\nIce Cream: $" + iceCream +
                          "\nMilk Chocolate: $" + milkChocolate +
                          "\nDoughnut: $" + doughnut +
                          "\nPancake: $" + pancake +
                          "\n" +
                          "\nIncome: $" + income);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        int netIncome = income - staffExpenses - otherExpenses;
        System.out.println("Net income: $" + netIncome);
    }
}