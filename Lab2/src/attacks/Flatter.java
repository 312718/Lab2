package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Flatter extends StatusMove {

    public Flatter() {
        super();
        this.type = Type.DARK;
        this.accuracy = 100;
    }

    @Override
    protected String describe() {
        return "done playing nice";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }

}
