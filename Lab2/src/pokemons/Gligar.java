package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Gligar extends Pokemon {
    public Gligar(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND,Type.FLYING);
        this.setStats(65, 75, 105, 35, 65, 85);
        this.addMove(new Facade());
        this.addMove(new AerialAce());
        this.addMove(new PoisonJab());
    }
}
