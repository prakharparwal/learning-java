package core.multithreading.join;

public class Performer2 {

    public static Thread t = Thread.currentThread();

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.start();
        for(int i=0;i<= 5;i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
