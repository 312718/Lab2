package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class TailWhip extends StatusMove {
    public TailWhip(){
        super();
        this.type = Type.NORMAL;
        this.accuracy = 100;
    }

    @Override
    protected String describe() {
        return "use tail whip";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP , -12);
    }
}
