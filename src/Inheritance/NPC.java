package Inheritance;

//Creating an abstract class called Inheritance.NPC
public abstract class NPC {
    //declaring variable attributes that would apply to all Inheritance.NPC's, per default these should always be private
    //as means to protect the data stored. We cam always retrieve and edit this using getters and setters.
    private int heightInCentimeters;
    private int age;
    private int color;

    //Creating a constructor is necessary since we will be using the below method to construct our different Inheritance.NPC's
    //such as ogre in this case.
    public NPC(int heightInCentimeters, int age, int color) {
        this.heightInCentimeters = heightInCentimeters;
        this.age = age;
        this.color = color;
    }
}
