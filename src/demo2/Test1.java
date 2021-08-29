package demo2;

public class Test1 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Mosses", 3.7f);
        Person p3 = new Person(2,"Avi", 4.2f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
