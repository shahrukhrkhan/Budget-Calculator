import java.util.Scanner;
import java.util.ArrayList;

//Program to track your income and expenses and create a budget

public class budgetCalculator
{
   public static void main(String[] args)
   {
         int answer1;
         int answer2;
         
         //Creating 4 arraylist
         
         ArrayList<String> list1 = new ArrayList<String>();
         ArrayList<Double> incomeAmount = new ArrayList<Double>();
         ArrayList<String> expenseItem = new ArrayList<String>();
         ArrayList<Double> expenseAmount = new ArrayList<Double>();
         
         //Ask user how many items they want to track for income and expenses
         Scanner keyboard = new Scanner(System.in);
         System.out.println("How many income items? ");
         answer1 = keyboard.nextInt();
         
         System.out.println("How many expense items? ");
         answer2 = keyboard.nextInt();
         
        //Loop to gather income items and amounts
         
        for (int i=1; i<=answer1; i++)
        {
            System.out.println("Enter the income item: ");
            list1.add(keyboard.next());
        }
        
        for (int i=0; i<answer1; i++)
        {
            System.out.println("Enter the amount for the " + list1.get(i));
            incomeAmount.add(keyboard.nextDouble());
        }
        //Displaying income items and amounts
        for (int index = 0; index < list1.size(); index++)
            {
               
               System.out.println("Here are your income items: " + list1.get(index));
            }
            
         double total = 0;
         
         for (int index = 0; index < incomeAmount.size(); index++)
            {
               System.out.println("Here are your income item amounts: " +
               list1.get(index) + "-" + incomeAmount.get(index));
            }
          //Calculating subtotal for income 
          for (int index = 0; index < incomeAmount.size(); index++)
            {
               total += incomeAmount.get(index);
            }
            System.out.println("The subtotal for income is: " +total);
            
            
            //To create a space 
            System.out.println(" ");
            
            //Loop for Expense items entry
            for (int i=1; i<=answer2; i++)
            {
               System.out.println("Enter the expense item: ");
               expenseItem.add(keyboard.next());
            }
        
            for (int i=0; i<answer2; i++)
            {
               System.out.println("Enter the amount for the "+ expenseItem.get(i));
               expenseAmount.add(keyboard.nextDouble());
            }
            //Displaying expense items and amounts 
            for (int index = 0; index < expenseItem.size(); index++)
            {
               System.out.println("Here are your expense items: " + expenseItem.get(index));
            }
            
            double total2 = 0;
         
            for (int index = 0; index < expenseAmount.size(); index++)
            {
               System.out.println("Here are your expense item amounts: " + 
               expenseItem.get(index) + "-" + expenseAmount.get(index));
            }
            //Calculating subtotal for expenses
            for (int index = 0; index < expenseAmount.size(); index++)
            {
               total2 += expenseAmount.get(index);
            }
            System.out.println("The subtotal for expenses is: " +total2);
            
            //To create a space 
            System.out.println(" ");
            
            //Calculating grand total
            
            System.out.println("The grand total of income minus expenses is: " +(total-total2));
         
    }
  }