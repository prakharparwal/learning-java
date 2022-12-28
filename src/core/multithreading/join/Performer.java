package core.multithreading.join;

public class Performer {

    public static void main(String[] args) {

        Test t = new Test();
        t.start();
        try {
            t.join();
            for(int i=0;i<=5;i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        } catch(InterruptedException ie) {
            System.out.println("IE exception");
        }
    }
}
