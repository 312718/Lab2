package attacks;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {

    public AerialAce() {
        super(Type.FLYING, 60,100);
    }

    @Override
    protected String describe() {
        return "done aerial ace";
    }
    protected void applyOppDamage(Pokemon def, double damage){
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

}
