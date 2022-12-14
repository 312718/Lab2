package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class PoisonJab extends PhysicalMove {

    public PoisonJab() {
        super(Type.POISON, 80,100);
    }

    @Override
    protected String describe() {
        return "use poison jab";
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3) {
            Effect.poison(p);
        }
    }

}
