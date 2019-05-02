public class Item {
    int ID;
    String name;
    int attack;
    int defense;
    // crit success chance? crit failure chance?
    // or just a general range of effectiveness that steadily increases?

//    should I have a constructor for each offensive and defensive weapon type? That seems redundant
    public Item(int ID,String name,int attack,int defense){
        this.ID = ID;
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

//  ok, how do I set multiple item types? I need 4 or 5 offensive weapons, and their counterparts
//    Offensive: hockey stick, strategically-placed banana, bored magician, vengeful ex, frozen chicken dropped from 10000 meters
//    Defensive: kite shield, M4 Sherman tank, overprotective mother, Rolls-Royce Phantom, apocalyptic bunker
}
