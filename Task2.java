package HWClass16;
/*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name
 */
public class Task2 {
    private String vowels(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' || a.charAt(i)=='a' || a.charAt(i)=='e'){
            System.out.print(a.charAt(i)+" ");
        }
        } return a;
    }
    public static void main(String[] args) {
        Task2 obj=new Task2();
        obj.vowels("Hello World!");
    }
}

