package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Steenee extends Bounsweet {
    public Steenee(String name, int level) {
        super(name,level);
        this.addType(Type.GRASS);
        this.setStats(52,40,48,40,48,62);
        this.addMove(new RazorLeaf());
        this.addMove(new Confide());
        this.addMove(new PlayNice());
    }
}
