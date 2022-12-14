package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Gliscor extends Gligar {
     public Gliscor(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.FLYING);
        this.setStats(75, 95, 125, 45, 75, 95);
        this.addMove(new Facade());
        this.addMove(new AerialAce());
        this.addMove(new PoisonJab());
        this.addMove(new FireFang());
    }
}
