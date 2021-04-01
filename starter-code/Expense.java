import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Stack;
public class Expense {
    public static ArrayList<Integer> prepareData(ArrayList<Integer> expenses, int size){
        /*
        Data is prepared by inserting random values 
        between 150 and 300. Data items may be assumed to 
        be repeated. 
        */
        // what is our range?
        int min = 150;
        // create instance of Random class
        Random randomNum = new Random();
        for (int i=0; i<size; i++) {
            int exp = min + randomNum.nextInt(min);
            expenses.add(exp);
        }
        Collections.shuffle(expenses);
    
        

        return expenses;
    }  
    public static ArrayList<Integer> compute(ArrayList<Integer> expenses){
        ArrayList<Integer> output = new ArrayList<Integer>();
        /*
        Add your logic below to compute the new array list.*/

        return output;
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of expenses:");
        Scanner scan = new Scanner(System.in);
        int total_expenses = scan.nextInt();
        ArrayList<Integer> empty_expenses = new ArrayList<Integer>();

        ArrayList<Integer> filled_expenses = prepareData(empty_expenses, total_expenses);
        System.out.print("My Expenses:\t");
        System.out.println(filled_expenses);   
        
        /* Implement the compute method, so as to 
        get the correct results.*/
        ArrayList<Integer> output_array = compute(filled_expenses);
        
        /* The two lines below will print the output. 
        Do not uncomment these lines.  */
        System.out.print("Output:\t\t");
        System.out.println(output_array);   
        
        
    }   
}
