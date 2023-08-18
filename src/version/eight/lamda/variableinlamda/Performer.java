package version.eight.lamda.variableinlamda;

public class Performer {

    int v1 = 100;

    static String city = "Ratlam";

    public static void main(String[] args) {

        int x = 10; //local variable
        //x= 90; //If we do this then the variable can't be access in lamda expression as this will give an compilation error
                 // saying final or effectively final variable can be used in lamda only


        Performer p = new Performer();

        Test t = (message) -> {
            int y = 20; //local variable

            //Accessing local variable
            System.out.println(x);
            System.out.println(y);

            //Accessing instance variable
            System.out.println(p.v1);

            //Accessing static variable
            System.out.println(city);

            // x = 30; //Variable used in lamda expression should be final or effectively final

            //NOTE: we cannot modify a local variable in a lamda expression. Consider the variable as effectively final

            //Updating local variable
            y = 30;
            System.out.println(y);

            //Updating instance variable
            p.v1 = 200;
            System.out.println(p.v1);

            //Updating static variable
            city = "Chandigarh";
            System.out.println(city);

            System.out.println(message);
        };
        t.printMessage("Hello");

    }
}
