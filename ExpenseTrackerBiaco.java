import java.util.Scanner;

public class ExpenseTrackerBiaco 
{
    public static void displayTitle()
    {
        System.out.println("PERSONAL EXPENSE TRACKER");
        System.out.println("========================");
    }
    
    public static double expenseCalculation(double food, double transportation, double others, double amenities)
    {
        double totalExpense = food + transportation + others + amenities;
        return totalExpense;
    }

    public static void expenseChecker(double totalExpense, double budget)
    {
        if (totalExpense > budget)
        {
            System.out.println("You have exceeded your budget by " + (totalExpense - budget) + ", please increase your budget or decrease expenses.");
        }
    }

    public static void displayExpenseDetails(double totalExpense, double budget)
    {
        System.out.println("Total Expense: " + totalExpense);
        System.out.println("Remaining Budget: " + (budget - totalExpense));
    }

    public static void main (String [] args)
    {
        displayTitle();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your allocated budget: ");
        double budget = input.nextDouble();
        System.out.print("Enter food expenses: ");
        double food = input.nextDouble();
        System.out.print("Enter transportation expenses: ");
        double transportation = input.nextDouble();
        System.out.print("Enter amenities expenses: ");
        double amenities = input.nextDouble();
        System.out.print("Enter miscalleneous expenses:" );
        double others = input.nextDouble();
        input.close();

        double Expenses = expenseCalculation(food, transportation, others, amenities);
        expenseChecker (Expenses, budget);
        displayExpenseDetails(Expenses, budget);

    }
}
