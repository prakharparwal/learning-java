package version.eight.default_method;

public class Punjabi implements Human{

    @Override
    public String nature() {
        return "Jolly";
    }

    public static void main(String[] args) {
        Human punjabi = new Punjabi();
        System.out.println("Nature "+punjabi.nature());
        punjabi.dance();
    }
}
