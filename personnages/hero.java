package personnages;
import java.util.ArrayList;

public class hero extends perso {

    public int mana;
    public ArrayList<String> competences;

    public hero(perso base, int mana, ArrayList<String> competences) {
        super(base.name, base.mail);
        this.mana = mana;
        this.competences = competences;
    }
}