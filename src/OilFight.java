import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class OilFight {

    // main method
    public static void main(String[]args){

          // Scanner for a string
//        System.out.println("Enter a word:");
//        Scanner sc1 = new Scanner(System.in);
//        String userInputWord = sc1.next();

          // Use the same scanner for an integer
//        System.out.println("Enter an integer:");
//        int userInputInteger = sc1.nextInt();

          // Create two instances of players, initializing them with basic details
//        Player player1 = new Player(3,"Lloyd",1,"Russian");
//        Player player2 = new Player(4,"Greg",2,"American");
//
          // Change the first player's name
//        System.out.println("Player 1's current name: " + player1.name);
//        player1.changeName("Lloyd 2.0");
//        System.out.println("Player 1's name after change: " + player1.name);

        // Create an array of integers
        int[] numbers2 = {11, 21, 31, 41, 51};
        System.out.println(Arrays.toString(numbers2));

        // Create an array of strings
        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};

        // Play around with printing out specific elements and the entire array
        System.out.println("Length: " + myFavoriteCandyBars.length);
        System.out.println("Index 1: " + myFavoriteCandyBars[0]);
        myFavoriteCandyBars[0]="Snickers";
        System.out.println("Index 1: " + myFavoriteCandyBars[0]);

        System.out.println(Array.get(myFavoriteCandyBars,2));
        System.out.println(Arrays.toString(myFavoriteCandyBars));

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}

// attack another user
// need to show the current list of players, per page? For now, just show all users.
// if successful, steal oil, blow up a small portion of oil, and kill a small portion of population
// how do determine success? compare offensive to defensive power
// offensive power is determined by value of all offensive items owned by the attacker
// defensive power is determined by value of all defensive items owned by the defender, as well as a bonus from their infrastructure
// how much information can users normally tell about other users? Just their rank?
// am I going to have spy actions and attack actions separately, or should they come from the same pool?
// what kind of algorithm should I use to determine success, and the results of that success?
