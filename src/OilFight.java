import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OilFight {

    // main method
    public static void main(String[]args) {

        // Scanner for a string
//        System.out.println("Enter a word:");
//        Scanner sc1 = new Scanner(System.in);
//        String userInputWord = sc1.next();

        // Use the same scanner for an integer
//        System.out.println("Enter an integer:");
//        int userInputInteger = sc1.nextInt();

//           Create four instances of players, initializing them with basic details
        Player player1 = new Player(3, "Lloyd", 1, "Russian", 10, 10);
        Player player2 = new Player(4, "Greg", 2, "American", 20, 20);
        Player player3 = new Player(4, "Julie", 3, "Welsh", 30, 30);
        Player player4 = new Player(4, "Diana", 4, "Irish", 40, 40);

        System.out.println("You are " + player1.name + " with " + player1.numberOfTurnsAvailable + " turns remaining, on the " + player1.team + " team, at rank " + player1.rank + ".");
        System.out.println("Enter the number of the player you would like to attack, by their rank.");
        System.out.println(player2.name + ", rank " + player2.rank);
        System.out.println(player3.name + ", rank " + player3.rank);
        System.out.println(player4.name + ", rank " + player4.rank);

        String success = "true";
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

//        Current iteration goal: compare current user's offensive power to defending user's defensive power to determine success.
//        If atk > def, success, then determine oil stolen, population decrease and decrement number of turns available

//        take user's input to identify target account
//        a "for" statement that only repeats once?
//        determine level of success with somewhat random range, return results

        // this section isn't super helpful anymore, because I want to compare a real player to a defending player
        if (userInput == 2 && success == "true") {
            System.out.println("Success! You stole 20 barrels of oil. Player 2 also lost 2 population in the attack");
            System.out.println("You now have 2 turns remaining.");
        } else if (userInput == 3 && success == "true") {
            System.out.println("Success! You stole 20 barrels of oil. Player 3 also lost 2 population in the attack");
            System.out.println("You now have 2 turns remaining.");
        } else if (userInput == 4 && success == "true") {
            System.out.println("Success! You stole 20 barrels of oil. Player 4 also lost 2 population in the attack");
            System.out.println("You now have 2 turns remaining.");
        } else {
            System.out.println("A failed attempt!");
        }

        // This is one of the later "tough" problems I was trying to solve.
        // Goal: have the current player enter the ID/name of a player they want to attack, and determine outcome.
//        System.out.println("Enter the name of the player you would like to attack.");
//        Player attackThisPlayer = sc.next();
//        player1.attackPlayer(attackThisPlayer);


//        Random rand = new Random();
//        int randomNumber = rand.nextInt();
//        int randomNumberWithBound = rand.nextInt(10);
//        // The println's threw error "unknown class" in regards to the arguments I passed.
//        // The suggested resolution was to create an int class for both variables. Something specific to Java 11?
//        System.out.println(randomNumber);
//        System.out.println(randomNumberWithBound);


        // Change the first player's name
//        System.out.println("Player 1's current name: " + player1.name);
//        player1.changeName("Lloyd 2.0");
//        System.out.println("Player 1's name after change: " + player1.name);

        // Create an array of integers
//        int[] numbers2 = {11, 21, 31, 41, 51};
//        System.out.println(Arrays.toString(numbers2));
//
//        // Create an array of strings
//        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
//
//        // Play around with printing out specific elements and the entire array
//        System.out.println("Length: " + myFavoriteCandyBars.length);
//        System.out.println("Index 1: " + myFavoriteCandyBars[0]);
//        myFavoriteCandyBars[0]="Snickers";
//        System.out.println("Index 1: " + myFavoriteCandyBars[0]);
//
//        System.out.println(Array.get(myFavoriteCandyBars,2));
//        System.out.println(Arrays.toString(myFavoriteCandyBars));
//
//        Arrays.sort(numbers2);
//        System.out.println(Arrays.toString(numbers2));
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
