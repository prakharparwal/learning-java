package version.fourteen.record;

public class Performer {
    public static void main(String[] args) {

        //1
        Person p = new Person(101, "Prakhar");

        //2
        System.out.println(p.name());
        System.out.println(p.id());

        //3
        Person p1 = new Person(101, "Prakhar");
        System.out.println(p1 == p);

        //4
        System.out.println("Hashcode of p: "+p.hashCode());
        System.out.println("Hashcode of p1: "+p1.hashCode());

        //5
        System.out.println(p.toString());

        //6.1
        Person p3 = new Person(101, null);
        System.out.println(p3);


        //6.2
     //   Person p4 = new Person("TEST");
     //   System.out.println(p4);

        //6.3

        System.out.println(Person.SOME_FIELD);
        System.out.println(Person.someMethod());

    }
}
