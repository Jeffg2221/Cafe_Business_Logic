import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for( int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;

        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String userName = "";
        if (scanner.hasNextLine()) {
            userName = scanner.nextLine();
        }
        System.out.println("Hello, " + userName + "!");

        int numOfPeople = customers.size();
        System.out.println("There are " + numOfPeople + " people in front of you");

        customers.add(userName);
        System.out.println("Customers list: " + customers);

        scanner.close();
    }


}
