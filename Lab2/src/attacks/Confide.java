package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {

    public Confide() {
        super();
        this.type = Type.NORMAL;
    }

    @Override
    protected String describe() {
        return "use confide";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE , -1);
    }

}

