import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Author: Aubrie McIntyre
 * Date: 10/14/2024
 * Description: program accepts user input to generate a report for their budget
 */

public class MyFrame extends JFrame {

    MyFrame() {

        JFrame frame = new JFrame(); // creates frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // defines that the frame should close on exit, rather than continue running

        String name = JOptionPane.showInputDialog("What is your name?"); // collects "name"
        JOptionPane.showMessageDialog(null, "Welcome to Budget Portal, " + name + "!", "Greetings!", JOptionPane.INFORMATION_MESSAGE); // greeting message using "name"
        JOptionPane.showMessageDialog(null, "We need to collect some information to generate your budget report!", "Information Collecting", JOptionPane.INFORMATION_MESSAGE); // informational card
        String incomeSizeInput = JOptionPane.showInputDialog("This report will cover one month. Please enter how many times you got paid in one month in numerical format:"); // collects "incomeSizeInput"
        int incomeSize = Integer.parseInt(incomeSizeInput); // changes incomeSizeInput into int from String
        double incomeTotal = 0; // defines incomeTotal
        double[] incomeArray = new double[incomeSize]; // establishes incomeArray[]
        JOptionPane.showMessageDialog(null, "You were paid " + incomeSize + " time(s) during one month.", "Paid Per Month", JOptionPane.INFORMATION_MESSAGE); // confirmation message
        JOptionPane.showMessageDialog(null, "It is now time to list your income entries.", "Income Entries", JOptionPane.INFORMATION_MESSAGE); // prepares user for income entry
        // for loop that populates incomeArray based off of user input for incomeSize
        for (int i = 0; i < incomeSize; i++) {
            String incomeArrayInput = JOptionPane.showInputDialog("Enter an income entry:"); // collects user input and defines incomeArrayInput
            double incomeArrayConverted = Double.parseDouble(incomeArrayInput); // converts incomeArrayInput from String to double, storing in incomeArrayConverted
            incomeArray[i] = incomeArrayConverted; // stores incomeArrayConverted into incomeArray[] position, where the position is based off of iteration of the loop
            incomeTotal += incomeArrayConverted; // adds incomeArrayConverted to the total of incomeTotal
        }
        JOptionPane.showMessageDialog(null, "You have entered " + incomeSize + " entries.", "Income Confirmation", JOptionPane.INFORMATION_MESSAGE); // income entry confirmation

        JOptionPane.showMessageDialog(null, "Now it is time to discuss expenses.", "Onto Expenses", JOptionPane.INFORMATION_MESSAGE); // transition message into expense category
        JOptionPane.showMessageDialog(null, "Expenses are any bills or necessary spending done.", "Expenses Explanation", JOptionPane.INFORMATION_MESSAGE); // informational message about expense category
        String expenseSizeInput = JOptionPane.showInputDialog("Please enter how many entries you'd like to include for the Expense category in numerical form:"); // collects "expenseSizeInput"
        int expenseSize = Integer.parseInt(expenseSizeInput); // changes expenseSizeInput into int from String
        double expenseTotal = 0; // defines expenseTotal
        double[] expenseArray = new double[expenseSize]; // establishes expenseArray[]
        JOptionPane.showMessageDialog(null, "You listed " + expenseSize + " entries for the Expense category.", "Expenses Confirmation", JOptionPane.INFORMATION_MESSAGE); // confirmation message
        JOptionPane.showMessageDialog(null, "It is now time to list your expense entries.", "Time to Collect!", JOptionPane.INFORMATION_MESSAGE); // prepares user for expense entry
        // for loop that populates expenseArray based off of user input for expenseSize
        for (int i = 0; i < expenseSize; i++) {
            String expenseArrayInput = JOptionPane.showInputDialog("Enter an expense entry:"); // collects user input and defines expenseArrayInput
            double expenseArrayConverted = Double.parseDouble(expenseArrayInput); // converts expenseArrayInput from String to double, storing in expenseArrayConverted
            expenseArray[i] = expenseArrayConverted; // stores expenseArrayConverted into expenseArray[] position, where the position is based off of iteration of the loop
            expenseTotal += expenseArrayConverted; // adds expenseArrayConverted to the total of expenseTotal
        }
        JOptionPane.showMessageDialog(null, "You have entered " + expenseSize + " entries.", "Expense Confirmation", JOptionPane.INFORMATION_MESSAGE); // expense entry confirmation

        JOptionPane.showMessageDialog(null, "Now, it is time to define your budget.", "Onto Budget", JOptionPane.INFORMATION_MESSAGE); // transition message into budget
        JOptionPane.showMessageDialog(null, "The budget will be applied to the spending category.", "Where Budget Goes", JOptionPane.INFORMATION_MESSAGE); // budget informational message
        JOptionPane.showMessageDialog(null, "The spending category involves any spending that is done outside of bills or necessary spending for the month.", "Defining Spending", JOptionPane.INFORMATION_MESSAGE); // spending information messae
        String budgetInput = JOptionPane.showInputDialog(null, "Please enter your budget (spending limit) for one month in numerical form."); // collects "budgetInput"
        double budget = Double.parseDouble(budgetInput); // changes budgetInput into int from String
        JOptionPane.showMessageDialog(null, "You have entered " + budget + " as your budget for one month.", "Budget Confirmation", JOptionPane.INFORMATION_MESSAGE); // budget entry confirmation

        JOptionPane.showMessageDialog(null, "It is now time to define your spending category.", "Onto Spending", JOptionPane.INFORMATION_MESSAGE); // transition into spending category
        String spendingSizeInput = JOptionPane.showInputDialog("Please enter how many entries you'd like to include for the spending category:"); // collects "spendingSizeInput"
        int spendingSize = Integer.parseInt(spendingSizeInput); // changes spendingSizeInput from String to int
        double spendingTotal = 0; // defines spendingTotal
        double[] spendingArray = new double[spendingSize]; // establishes spendingArray[]
        JOptionPane.showMessageDialog(null, "You listed " + spendingSize + " entries for the spending category.", "Spending Confirmation", JOptionPane.INFORMATION_MESSAGE); // spending entry confirmation
        JOptionPane.showMessageDialog(null, "It is now time to list your spending entries.", "Time to Collect!", JOptionPane.INFORMATION_MESSAGE); 
        // for loop that populates spendingArray based off of user input for spendingSize
        for (int i = 0; i < spendingSize; i++) {
            String spendingArrayInput = JOptionPane.showInputDialog("Enter a spending entry:"); // collects spendingArrayInput from user input
            double spendingArrayConverted = Double.parseDouble(spendingArrayInput); // changes spendingArrayInput from String into double and stores it in spendingArrayConverted
            spendingArray[i] = spendingArrayConverted; // stores spendingArrayConverted into spendingArray[] position, where the position is based off of iteration of the loop
            spendingTotal += spendingArrayConverted; // adds spendingArrayConverted to the total of spendingTotal
        }
        JOptionPane.showMessageDialog(null, "You have entered " + spendingSize + " entries.", "Spending Confirmation", JOptionPane.INFORMATION_MESSAGE); // spending entry confirmation
        JOptionPane.showMessageDialog(null, "You have now provided all necessary information.", "Almost there...", JOptionPane.INFORMATION_MESSAGE); // confirmation of reaching the end
        JOptionPane.showMessageDialog(null, "Generating report...", "Hit OK", JOptionPane.INFORMATION_MESSAGE); // prepares user for report generation
        // report generator!
        System.out.printf("+--------------------------+%n");
        System.out.printf("| Budget Calculator Report |%n");
        System.out.printf("| %-24s |%n", "For "+name);
        System.out.printf("+--------------------------+%n");

        // Income Generator
        System.out.printf("| %-24s |%n", "Income:");
        for (int i = 0; i < incomeSize; i++) {
            System.out.printf("| %24s |%n", "$"+incomeArray[i]);
        }
        System.out.printf("| %24s |%n", "_______");
        System.out.printf("| %-12s %11s |%n", "Total:", incomeTotal);
        System.out.printf("+--------------------------+%n");

        // Expenses Generator
        System.out.printf("| %-24s |%n", "Expenses:");
        for (int i = 0; i < expenseSize; i++) {
            System.out.printf("| %24s |%n", "$"+expenseArray[i]);
        }
        System.out.printf("| %24s |%n", "_______");
        System.out.printf("| %-12s %11s |%n", "Total:", expenseTotal);
        System.out.printf("+--------------------------+%n");
        
        System.out.printf("| %-24s |%n", "Budget: "+budget);
        System.out.printf("+--------------------------+%n");
        System.out.printf("| %-24s |%n", "Spending:");
        for (int i = 0; i < spendingSize; i++) {
            System.out.printf("| %24s |%n", "$"+spendingArray[i]);
        }
        System.out.printf("| %24s |%n", "_______");
        System.out.printf("| %-12s %11s |%n", "Total:", spendingTotal);
        System.out.printf("+--------------------------+%n");
    }

}
