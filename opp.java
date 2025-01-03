class Student{
    String name;
    int age;

    public void getinfo(){
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
    }
}


public class opp {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "kunal";
        s1.age = 20;
        s1.getinfo();

        Student s2 = new Student();
        s2.name = "shradha";
        s2.age = 22;
        s2.getinfo();
    }
    
}
