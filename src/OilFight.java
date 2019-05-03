import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OilFight {

//    main method
    public static void main(String[]args) {

//           Create four instances of players, initializing them with basic details
        Player player1 = new Player("001",3, "Lloyd", 1, "Russian", 10, 10,100,100);
        Player player2 = new Player("002",4, "Greg", 2, "American", 20, 20,100,100);
        Player player3 = new Player("003",4, "Julie", 3, "Welsh", 30, 30,100,100);
        Player player4 = new Player("004",4, "Diana", 4, "Irish", 40, 40,100,100);

        System.out.println("You are " + player1.name + " with " + player1.numberOfTurnsAvailable + " turns remaining, on the " + player1.team + " team, at rank " + player1.rank + ".");
        System.out.println("Enter the number of the player you would like to attack, by their ID.");
//        System.out.println(player2.name + ", rank " + player2.rank);
//        System.out.println(player3.name + ", rank " + player3.rank);
//        System.out.println(player4.name + ", rank " + player4.rank);

/*
        Look up primitive types
        Look up int compared to Integer
        Look up hashmaps
 */

//        Mitch suggested putting in this hashmap. I still need to research what this is and how it works.
        Map<String, Player> playerDatabase = new HashMap<String, Player>();
        playerDatabase.put(player1.ID, player1);
        playerDatabase.put(player2.ID, player2);
        playerDatabase.put(player3.ID, player3);
        playerDatabase.put(player4.ID, player4);

//        I took this out of the equation, but I'll need to evaluate success somewhere. Where?
//        String success = "true";
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();

//        Current iteration goal: compare current user's offensive power to defending user's defensive power to determine success.
//        If atk > def, success, then determine oil stolen, population decrease and decrement number of turns available

//          Test is failing. Keep receiving "a failed attempt" response from line 36.
        if (userInput == "002") {
            player1.attackPlayer(player2);
        } else if (userInput == "003") {
            player1.attackPlayer(player3);
        } else if (userInput == "004") {
            player1.attackPlayer(player4);
        } else {
            System.out.println("A failed attempt!");
        }

    }
}

// next steps
// attack another user
// show all users. Later iteration: show users per rank per page (10 per page? 100?)
// if successful, steal oil, blow up a small portion of oil, and kill a small percentage of population
// compare offensive to defensive power to determine success
// offensive power is determined by value of all offensive items owned by the attacker, as well as a bonus from spy training
// defensive power is determined by value of all defensive items owned by the defender, as well as a bonus from their infrastructure
// how much information can users normally tell about other users? Just their rank?
// am I going to have spy actions and attack actions separately, or should they come from the same pool?
// what kind of algorithm should I use to determine success, and the results of that success?
