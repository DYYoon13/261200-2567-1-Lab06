package Lab6;

public class Fly extends Animal implements Flyable {

    @Override
    public void sound() {
        System.out.println("fzzzzzz");
    }
    @Override
    public void fly() {
        System.out.println("I can fly!!");
    }
    @Override
    public void glide() {
        System.out.println("I can glide!!");
    }
    @Override
    public void land() {
        System.out.println("I can land!!");
    }
    
}
