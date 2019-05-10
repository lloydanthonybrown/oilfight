public class Item {
    int ID;
    String name;
    int attack;
    int defense;
    // crit success chance? crit failure chance?
    // or just a general range of effectiveness that steadily increases?
//    durability, or nah?

//    should I have a constructor for each offensive and defensive weapon type? That seems redundant
    public Item(int ID,String name,int attack,int defense){
        this.ID = ID;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

//    I need to review collection types - hashmaps, lists, maps, etc to see how I could best represent these weapons
//    hashmap key,value - name,item?
//    allow player to purchase items, which increases count of that item for that player - atk and def are multiplicative
//    calculate player atk def from items AND number of population

//  ok, how do I set multiple item types? I need 4 or 5 offensive weapons, and their counterparts
//    Offensive: hockey stick, strategically-placed banana, bored magician, vengeful ex, frozen chicken dropped from 10000 meters
//    Defensive: kite shield, M4 Sherman tank, overprotective mother, Rolls-Royce Phantom, apocalyptic bunker
}