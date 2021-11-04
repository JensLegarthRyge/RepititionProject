package Inheritance;

//Creating an ogre class that extends Inheritance.NPC and thereby inherits from it
//Furthermore, Inheritance.Ogre implements Inheritance.NPCActions, and to showcase the ability to implement more interfaces
//it also implements Inheritance.NPC interface effectively inherting from two interfaces
public class Ogre extends NPC implements NPCActions, NPCInterface {
    //Adding an additional attribute
    private int tuskStyle;
    //Creating a constructor
    public Ogre(int heightInCentimeters, int age, int color, int tuskStyle) {
        //calling super method from Inheritance.NPC class to add the superclass attributes to our Inheritance.NPC constructor
        super(heightInCentimeters, age, color);
        this.tuskStyle = tuskStyle;
    }

    //Overriding Inheritance.NPCActions- and Inheritance.NPCInterface-methods

    public void interact() {
        System.out.println(voiceLine(0));
    }

    public void move() {
        double x = 87.9081;
        double y = 55.9031;
        System.out.println("double x = 87.9081");
        System.out.println("double y = 55.9031;");
    }

    public String voiceLine(int voiceLineNumber) {
        if (voiceLineNumber==0){
            return "Greetings!";
        } else
        return null;
    }

    public boolean idle() {
        boolean idling = false;
        return idling;
    }
}
