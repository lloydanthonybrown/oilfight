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

//        Mitch suggested putting in this hashmap. I still need to research what this is and how it works.
        Map<String, Player> playerDatabase = new HashMap<String, Player>();
        playerDatabase.put(player1.ID, player1);
        playerDatabase.put(player2.ID, player2);
        playerDatabase.put(player3.ID, player3);
        playerDatabase.put(player4.ID, player4);

        Scanner sc = new Scanner(System.in);

//        Get attacking user
        System.out.println("Enter the ID of the user who is attacking.");
        String attackingUser = sc.next();
        System.out.println("The attacker is " + attackingUser + ".");

//        Get defending user
        System.out.println("Enter the ID of the user who is defending.");
        String defendingUser = sc.next();
        System.out.println("The defender is " + defendingUser + ".");

//        Compare and determine success
        if(playerDatabase.containsKey(attackingUser)){
            System.out.println("Valid attacking user.");
            if(playerDatabase.containsKey(defendingUser)){
                System.out.println("Valid defending user.");
//                Here I need to actually compare the attack and defense values of the two players in question
//                How do I reference those players?
                if(playerDatabase.get(attackingUser).attack>playerDatabase.get(defendingUser).defense){
                    System.out.println("Attack successful!");
                }
                else{
                    System.out.println("Attack failed!");
                }
            }
            System.out.println("That is not a valid ID for an attacking user.");
        }
//        Edit hashmap values accordingly
//        Can a hashmap key contain multiple values?


//        Current iteration goal: compare current user's offensive power to defending user's defensive power to determine success.
//        If atk > def, success, then determine oil stolen, population decrease and decrement number of turns available

//        Based on my research on primitive types, maybe a char or byte would be better than a string for player ID? But maybe not.
//          Test is failing. Keep receiving "a failed attempt" response from line 36.
//        if (userInput == "002") {
//            player1.attackPlayer(player2);
//        } else if (userInput == "003") {
//            player1.attackPlayer(player3);
//        } else if (userInput == "004") {
//            player1.attackPlayer(player4);
//        } else {
//            System.out.println("A failed attempt!");
//        }

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
