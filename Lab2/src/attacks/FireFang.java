package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class FireFang extends PhysicalMove {

    public FireFang(){
        super(Type.FIRE, 65,95);
    }

    @Override
    protected String describe() {
        return "use fire fang";
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) {
            Effect.flinch(p);
        }
    }

}
