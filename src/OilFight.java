import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OilFight {

    //    main method
    public static void main(String[] args) {

        setup();

        // Create four instances of players, initializing them with the details of their constructor.
        Player player1 = new Player("001", 3, "Lloyd", 1, "Russian", 10, 10, 100, 100);
        Player player2 = new Player("002", 4, "Greg", 2, "American", 20, 20, 100, 100);
        Player player3 = new Player("003", 4, "Julie", 3, "Welsh", 30, 30, 100, 100);
        Player player4 = new Player("004", 4, "Diana", 4, "Irish", 40, 40, 100, 100);

        // Create a simple database through a HashMap.
        Map<String, Player> playerDatabase = new HashMap<String, Player>();
        playerDatabase.put(player1.ID, player1);
        playerDatabase.put(player2.ID, player2);
        playerDatabase.put(player3.ID, player3);
        playerDatabase.put(player4.ID, player4);

        // Create a Scanner to hold user input.
        Scanner sc = new Scanner(System.in);

//        How can I get this to be repeatable? I need to put it in a method, somehow.
        // Get attacking user.
        System.out.println("Enter the ID of the user who is attacking.");
        String attackingPlayerID = sc.next();
        Player attackingPlayer = playerDatabase.get(attackingPlayerID);
        System.out.println("The attacker is " + attackingPlayer.getName() + ".");

//        I also need to put this in a method so I can repeat it. It should stick with the section above.
        // Get defending user.
        System.out.println("Enter the ID of the user who is defending.");
        String defendingPlayerID = sc.next();
        Player defendingPlayer = playerDatabase.get(defendingPlayerID);
        System.out.println("The defender is " + defendingPlayer.getName() + ".");

        // Determine whether user inputs are valid. If valid, attack defending player.
        if(playerDatabase.containsKey(attackingPlayerID)){
            System.out.println("Valid attacking player.");
            if(playerDatabase.containsKey(defendingPlayerID)){
                System.out.println("Valid defending player.");
                attackingPlayer.attackPlayer(defendingPlayer);
            }
            else{
                System.out.println("Not a valid defending player!");
            }
        }
        else{
            System.out.println("Not a valid attacking player!");
        }

        System.out.println(attackingPlayer.getName() + " as the attacking player now has " + attackingPlayer.getOil() + " barrels of oil.");
        System.out.println(defendingPlayer.getName() + " as the defending player now has " + defendingPlayer.getOil() + " barrels of oil.");
    }

    private static void setup(){
// I tried to move my player instancing and player hashmap down here, but my user input variables couldn't reference the hashmap
//        Should I create a new....heck, I don't know.
    }
}
// next steps
// show all users. Later iteration: show users per rank per page (10 per page? 100?)
// if successful, steal oil, blow up a small portion of oil, and kill a small percentage of population
// show changes in oil, population and number of turns after an attack
// offensive power is determined by value of all offensive items owned by the attacker, as well as a bonus from spy training
// defensive power is determined by value of all defensive items owned by the defender, as well as a bonus from their infrastructure
// how much information can users normally tell about other users? Just their rank?
// am I going to have spy actions and attack actions separately, or should they come from the same pool?
// what kind of algorithm should I use to determine success, and the results of that success?
