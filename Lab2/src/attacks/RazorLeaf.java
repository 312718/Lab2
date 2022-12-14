package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RazorLeaf extends PhysicalMove {

    public RazorLeaf(){
        super(Type.GRASS, 55,95);
    }

    @Override
    protected String describe() {
        return "use razor leaf";
    }
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.HP , -22);
    }

}
