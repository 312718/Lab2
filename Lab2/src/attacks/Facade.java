package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {

    public Facade(){
        super(Type.NORMAL, 70,100);
    }

    @Override
    protected String describe() {
        return "use facade";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP , -2);
    }

}
