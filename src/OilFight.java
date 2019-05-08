import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OilFight {

//    main method
    public static void main(String[]args) {

//           Create four instances of players, initializing them with the basics from their constructor.
        Player player1 = new Player("001",3, "Lloyd", 1, "Russian", 10, 10,100,100);
        Player player2 = new Player("002",4, "Greg", 2, "American", 20, 20,100,100);
        Player player3 = new Player("003",4, "Julie", 3, "Welsh", 30, 30,100,100);
        Player player4 = new Player("004",4, "Diana", 4, "Irish", 40, 40,100,100);

//          Create a simple database through a HashMap.
        Map<String, Player> playerDatabase = new HashMap<String, Player>();
        playerDatabase.put(player1.ID, player1);
        playerDatabase.put(player2.ID, player2);
        playerDatabase.put(player3.ID, player3);
        playerDatabase.put(player4.ID, player4);

//          Create a Scanner to hold user input.
        Scanner sc = new Scanner(System.in);

//          Get attacking user.
        System.out.println("Enter the ID of the user who is attacking.");
        String attackingPlayer = sc.next();
        System.out.println("The attacker is " + attackingPlayer + ".");

//          Get defending user.
        System.out.println("Enter the ID of the user who is defending.");
        String defendingPlayer = sc.next();
        System.out.println("The defender is " + defendingPlayer + ".");

//          Determine success from user input gathered.
        if(playerDatabase.containsKey(attackingPlayer)){
            System.out.println("Valid attacking user.");
            if(playerDatabase.containsKey(defendingPlayer)){
                System.out.println("Valid defending user.");
                //        If atk > def, success, then determine oil stolen, population decrease and decrement number of turns available
                if(playerDatabase.get(attackingPlayer).attack>playerDatabase.get(defendingPlayer).defense){

//                    There's gotta be a better way than doing all of this in my main
//                    Increase attacking player's oil
                    int attackingPlayerNewOil = (int) Math.round(.1 * playerDatabase.get(attackingPlayer).getOil()) + playerDatabase.get(attackingPlayer).getOil();
                    playerDatabase.get(attackingPlayer).setOil(attackingPlayerNewOil);

//                    Decrease defending player's oil
                    int defendingPlayerNewOil = playerDatabase.get(defendingPlayer).getOil() - (int) Math.round(.1 * playerDatabase.get(defendingPlayer).getOil());
                    playerDatabase.get(defendingPlayer).setOil((defendingPlayerNewOil));

//                    Decrease attacking player's number of turns available
                    int attackingPlayerNewNumberOfTurns = playerDatabase.get(attackingPlayer).getNumberOfTurnsAvailable() - 1;
                    playerDatabase.get(attackingPlayer).setNumberOfTurnsAvailable(attackingPlayerNewNumberOfTurns);

//                    Decrease defending player's population
                    int defendingPlayerNewPopulation = playerDatabase.get(defendingPlayer).getPopulation() - (int) Math.round(.1 * playerDatabase.get(defendingPlayer).getPopulation());
                    playerDatabase.get(defendingPlayer).setPopulation(defendingPlayerNewPopulation);

                    System.out.println("Attack successful!");
                    //        Break this out into its own method at some point, or using existing attackPlayer method
                }
                else{
                    System.out.println("Attack failed!");
                }
            }
            else{
                System.out.println("That is not a valid ID for a defending user.");
            }
        }
        else{
            System.out.println("That is not a valid ID for an attacking user.");
        }

        System.out.println("The attacking player now has " + playerDatabase.get(attackingPlayer).getOil() + " barrels of oil.");
        System.out.println("The defending player now has " + playerDatabase.get(defendingPlayer).getOil() + " barrels of oil.");

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
