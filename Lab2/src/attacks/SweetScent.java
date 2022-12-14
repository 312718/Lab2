package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SweetScent extends StatusMove {

    public SweetScent(){
        super();
        this.type = Type.NORMAL;
        this.accuracy = 100;
    }

    @Override
    protected String describe() {
        return "use sweet scent";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP , -22);
    }

}
