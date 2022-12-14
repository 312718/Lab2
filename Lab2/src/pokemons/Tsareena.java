package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Tsareena extends Steenee {
    public Tsareena(String name, int level) {
        super(name,level);
        this.addType(Type.GRASS);
        this.setStats(72,120,98,50,98,72);
        this.addMove(new RazorLeaf());
        this.addMove(new Confide());
        this.addMove(new PlayNice());
        this.addMove(new SweetScent());
    }
}

