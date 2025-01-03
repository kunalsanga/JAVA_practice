class pen{
    String color;
    String type;//ballpoint;gel

    public void write(){
        System.out.println("writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("constructor called");
    }

}

public class oops {
    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color ="black";
        pen2.type ="ballpoint";

        pen1.write();//function calling

        pen1.printcolor();
        pen2.printcolor();

        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 24;

        s1.printinfo();


    }
    
}
