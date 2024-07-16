package Lab6;

public class Owl extends Animal implements Flyable , Pettable{

    @Override
    void sound(){System.out.println("Hoot Hoot!!");}
    
    @Override
    public void fly(){
        System.out.println("I believe I can fly!!");
    }

    @Override
    public void glide(){
        System.out.println("Owls can glide!!");
    }

    @Override
    public void canBePet(){
        System.out.println("I can be your pet!!");
    }

    @Override
    public void play(){
        System.out.println("You can play with me!!");
    }

    public void joy(Pettable cutie){
        System.out.println("I am playing with " + cutie);
    }
    
}
