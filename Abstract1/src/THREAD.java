public class THREAD extends Thread {
    public static int amount=0;

    public static void main(String[] args) {
        THREAD th=new THREAD();
        th.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
        th.run();
    }

    public void run(){
        amount++;
        System.out.println(amount);
    }

}
