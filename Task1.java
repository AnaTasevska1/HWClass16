package HWClass16;

public class Task1 {
    /*  Create a method that will take a String as a parameter and returns reversed String.
      Method should be available to all classes within your project and accessible by class name. */
    public String reversed(String a) {
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        a = sb.toString();

        return a;
    }
    public static void main(String[] args) {
        Task1 obj = new Task1();
        String results = obj.reversed("Hello world");
        System.out.println(results);
    }
}

