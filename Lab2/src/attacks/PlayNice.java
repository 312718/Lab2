package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PlayNice extends StatusMove {

    public PlayNice() {
        super();
        this.type = Type.NORMAL;
    }

    @Override
    protected String describe() {
        return "done playing nice";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK, -1);
    }


}
