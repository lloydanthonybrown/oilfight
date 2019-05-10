public class Player {
//    Do I need to make any of these private?
    String ID; // later iteration: make this scalable, maybe into a string for a GUID, probably private?
    int numberOfTurnsAvailable;
    String name;
    int rank; // But rank is a calculation, not just an integer attribute for the player objects
    String team; // what if this needs to be its own object? How would I reference it here?
    int attack; // calculate this later once I've built out the item class
    int defense; // calculate this later once I've built out the item class
    int oil;
    int population;
//      I need to review what data types my attributes should have. Should I rely on primitive data types for some of these?

//    Do I need additional attributes?
//    A player may have oil
//    A player may have offensive power items
//    A player may have defensive power items
//    A player may have infrastructure upgrades (the level of oil they can contain
//    A player may have spies
//    A player may have spy upgrades/training (for offense and defense) to increase their overall efficiency

//    Constructor for Player class
    public Player(String ID, int numberOfTurnsAvailable, String name, int rank, String team, int attack, int defense, int oil, int population){
        this.ID = ID;
        this.numberOfTurnsAvailable = numberOfTurnsAvailable;
        this.name = name;
        this.rank = rank;
        this.team = team;
        this.attack = attack;
        this.defense = defense;
        this.oil = oil;
        this.population = population;
    }

//    Attack another player
//    Should this be a String or void type? I want to return a message of success or failure, so a String?
    public String attackPlayer(Player defendingPlayer){
//      Decrease attacking player's number of turns available, no matter if the attack was successful or not
        this.numberOfTurnsAvailable -= 1;

        if(attack > defendingPlayer.defense){

//      Increase attacking player's oil
            int attackingPlayerNewOil = (int) Math.round(.1 * this.getOil()) + this.getOil();
            this.setOil(attackingPlayerNewOil);

//      Decrease defending player's oil
            int defendingPlayerNewOil = defendingPlayer.getOil() - (int) Math.round(.1 * defendingPlayer.getOil()) ;
            defendingPlayer.setOil(defendingPlayerNewOil);

//      Decrease defending player's population
            int defendingPlayerNewPopulation = defendingPlayer.getPopulation() - (int) Math.round(.1 * defendingPlayer.getPopulation());
            defendingPlayer.setPopulation(defendingPlayerNewPopulation);

            return "Success!";
        } else{
            return "Failure :(";
        }

//  compare the attacking user's offensive power, the attacking user's success in decreasing defenses through spying, the defensive user's defensive power, and the defensive user's resilience
//  comment about how much oil was stolen, and how much population was destroyed in the process to illustrate the success of the attack
//  put a history of actions that occurred while a player was logged out (mostly defensive, or all actions total and highlighting defensive actions?)
    }

//    Infiltrate another player's facilities in an attempt to gather information
//    Should this be a String or void type?
    public String spyOnPlayer(Player name){
        return "Yet another successful infiltration.";
    }

    //    Infiltrate another player's facilities in an attempt to destroy oil barrels
    public void infiltratePlayerFacilities(Player name){

    }

//    I need a method to allow the player to purchase offensive items
//    I'm going with something generic right now, because I don't know if I want a different method for offensive and defensive weapons
    public void purchaseItem(int itemID, int numberOfItems){
//        increase number of items owned by the purchasing user by the specified amount
//        put in exception handling that only allows user to purchase this number of items if they have enough oil
//        decrease amount of oil according to the number of items and the type of item purchased
//        in the main class, show how much oil the user now has, and how many items they have and of which types
    }

//    I need a method to allow the player to purchase defensive items
//    I need a method to allow the player to purchase infrastructure upgrades
//    I need a method to allow the player to purchase spy training

//    Do I actually need getters and setters for all of these attributes right now? Or ever?
    //    Getter and setter for name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    Getter and setter for rank attribute
//    future iteration: make a method for determining a user's rank. Might be fairly complex to determine.
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    //    Getter and setter for numberOfTurnsAvailable attribute
    public int getNumberOfTurnsAvailable() {
        return numberOfTurnsAvailable;
    }

    public void setNumberOfTurnsAvailable(int numberOfTurnsAvailable) {
        if(this.numberOfTurnsAvailable == 0){
            System.out.println("Cannot have fewer than 0 turns.");
        }
        else{
            this.numberOfTurnsAvailable = numberOfTurnsAvailable;
        }
    }

//    Getter and setter for team attribute
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

//    Getter and setter for oil attribute
    public int getOil(){
        return oil;
    }

    public void setOil(int oil){
        this.oil = oil;
    }

    public int getPopulation(){
        return population;
    }

    public void setPopulation(int population){
        this.population = population;
    }

}
