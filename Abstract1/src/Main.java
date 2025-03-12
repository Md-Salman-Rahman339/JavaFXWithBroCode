
//abstract class Animal{
//    public abstract void animalSound();
//
//    public void sleep(){
//        System.out.println("Zzz");
//    }
//}
//
//class Tiger extends Animal{
//    public void animalSound(){
//        System.out.println("The tiger says :wee wee");
//    }
interface Animal{
    public void AnimalSound();
    public void sleep();
}

class Goat implements Animal{
    public void AnimalSound(){
        System.out.println("The goat sounds like meee meee ");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzz");
    }
}





class Main{
    public static void main(String[] args) {
        Goat g=new Goat();
        g.AnimalSound();
        g.sleep();
    }
}