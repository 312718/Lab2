import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
public class Main {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon oleg = new Pachirisu("Олег",142);
        Pokemon valera = new Gligar("Валера", 86);
        Pokemon maga = new Gliscor("Магамед", 179);
        Pokemon bagira = new Bounsweet("Багира", 42);
        Pokemon nastya = new Steenee("Настюшка",102);
        Pokemon rem = new Tsareena("Рембо",230);


        b.addAlly(oleg);
        b.addAlly(maga);
        b.addAlly(bagira);

        b.addFoe(valera);
        b.addFoe(nastya);
        b.addFoe(rem);

        b.go();
    }}