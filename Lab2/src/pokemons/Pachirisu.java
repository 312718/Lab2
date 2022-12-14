package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.*;

public class Pachirisu extends Pokemon {
    public Pachirisu(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.FLYING);
        this.setStats(75, 95, 125, 45, 75, 95);
        this.addMove(new ThunderWave());
        this.addMove(new TailWhip());
        this.addMove(new Facade());
    }
}
