package Lab6;

public class Main {
    public static void main(String[] args) {
        //Animal thing = new Animal();
        Duck psyDuck = new Duck();
        psyDuck.sound();

        Owl butterOwl = new Owl();
        butterOwl.sound();

        psyDuck.clean(butterOwl);

        PekingDuck crispyDuck = new PekingDuck();

        crispyDuck.clean(butterOwl); // void clean at Duck.java

        butterOwl.joy(psyDuck); // void joy at Owl.java
    }
}
