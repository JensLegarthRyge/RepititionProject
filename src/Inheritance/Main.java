package Inheritance;

public class Main {
    public static void main(String[] args) {
        Ogre martin = new Ogre(213, 35, 1, 3);
        martin.interact();
        martin.move();
        System.out.println(martin.idle() + "\n\n");
    }
}
