package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Bounsweet extends Pokemon {
     public Bounsweet(String name, int level){
        super(name,level);
        this.addType(Type.GRASS);
        this.setStats(42,30,38,30,38,32);
        this.addMove(new RazorLeaf());
        this.addMove(new Confide());
    }
}
