package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends StatusMove {

    public ThunderWave(){
        super();
        this.type = Type.ELECTRIC;
        this.accuracy = 90;
    }

    @Override
    protected String describe() {
        return "use thunder wave";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP , -12);
    }
}
