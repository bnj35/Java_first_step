package personnages;
import verifyMail.verifyMail;

public class perso {
    public String name;
    public String mail;
    public int niveau;
    public int vie;
    public int degats;


    public perso(String name, String mail) {
        this.name = name;
        if (verifyMail.containsAt(mail)){
        this.mail = mail;
        }
        else{
            System.out.println("Invalid email provided. Exiting constructor.");
            return;
        }
        this.niveau = 1;
        this.vie = 100;
        this.degats = 10;
    } 
}


