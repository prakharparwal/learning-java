package core.oops.inheritance;

public class Performer {

    public static void main(String[] args) {

        Parent p = new Parent();

        //1
        System.out.println("1");
        p.doSomething("a","b" );
        p.printHello();

        //2
        System.out.println("2");
        Child c = new Child();
        c.doSomething(1,2 );
        c.printHello();

        //3
        System.out.println("3");
        Parent p1 = new Child();
        p1.doSomething("a","b" );
        p1.printHello();
        //p1.sayBye();      [X]

        //4
        System.out.println("4");
        Child c1 = new Child();
        c1.doSomething(1,2 );
        c1.printHello();
        c1.sayBye();

        System.out.println("###Constructor###");
        Child c2 = new Child();
        Parent pc2 = new Child();


        System.out.println("-- PC2 ---");
        //5
        pc2.printHello();
        pc2.doSomething("a","b" );

    }
}
