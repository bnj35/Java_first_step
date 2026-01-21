import verifyMail.verifyMail;
import basicCalculus.summ;
import personnages.hero;
import personnages.perso;
import java.util.ArrayList;


public class test {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        perso baseCharacter = new perso("Arthur", "arthur@example.com");
        hero character = new hero(baseCharacter, 25, new ArrayList<String>(java.util.Arrays.asList("Brave", "Strong")));
        System.out.println("Character created: " + character.name + " with mana: " + character.mana + " and competences: " + character.competences);
    }

}
