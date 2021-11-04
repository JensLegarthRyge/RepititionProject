package Inheritance;

//Creating an interface called Inheritance.NPC Actions
public interface NPCActions {
    //Here I declare(?) methods that would all be required for an Inheritance.NPC to work properly
    //The methods are without bodies, since the methods vary from Inheritance.NPC-type to Inheritance.NPC-type
    void interact();
    void move();
    //An interface method can also have required parameters.
    String voiceLine(int voiceLineNumber);

}
