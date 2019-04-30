public class Player {
//    Do I need to make any of these private?
    int numberOfTurnsAvailable;
    String name;
    int rank; // But rank is a calculation, not just an integer attribute for the player objects
    String team; // what if this needs to be its own object? How would I reference it here?
    int attack; // calculate this later once I've built out the item class
    int defense; // calculate this later once I've built out the item class
    int ID; // later iteration: make this scalable, maybe into a string for a GUID, probably private?

//    Do I need additional attributes?
//    A player may have oil
//    A player may have offensive power items
//    A player may have defensive power items
//    A player may have infrastructure upgrades (the level of oil they can contain
//    A player may have spies
//    A player may have spy upgrades/training (for offense and defense) to increase their overall efficiency

//    Contructor for Player class. Do I need additional attributes?
    public Player(int inputNumberOfTurnsAvailable, String inputName, int inputRank, String inputTeam, int attack, int defense){
        this.numberOfTurnsAvailable = inputNumberOfTurnsAvailable;
        this.name = inputName;
        this.rank = inputRank;
        this.team = inputTeam;
        this.attack = attack;
        this.defense = defense;
    }

//    Attack another player
//    Should this be a String or void type?
    public void attackPlayer(Player defendingPlayer){
//        Decrease the number of turns available by 1 from this action
        this.numberOfTurnsAvailable-=1;

        if(this.attack>defendingPlayer.defense){
            System.out.println( "Success!");
        } else{
            System.out.println( "Success!");
        }
//        If success=true, return message indicating this, the number of barrels stolen, and the number of the other
//        player's population decreased
//        If success=false, return message indicating this, the number of the player's population decreased in the
//        attack
//        I need to make the calculations that show whether the user was successful or not. How do I do that?
//        I need to compare the attacking user's offensive power, the attacking user's success in decreasing defenses
//        through spying, the defensive user's defensive power, and the defensive user's resilience

    }

//    Infiltrate another player's facilities in an attempt to gather information
//    Should this be a String or void type?
    public String spyOnPlayer(Player name){
        return("Yet another successful infiltration.");
    }

    //    Infiltrate another player's facilities in an attempt to destroy oil barrels
    public void infiltratePlayerFacilities(Player name){

    }

//    I need a method to allow the player to purchase offensive items
//    I need a method to allow the player to purchase defensive items
//    I need a method to allow the player to purchase infrastructure upgrades
//    I need a method to allow the player to purchase spy training

    //    Getter and setter for name attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    Getter and setter for rank attribute
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
        this.numberOfTurnsAvailable = numberOfTurnsAvailable;
    }

//    Getter and setter for team attribute
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
