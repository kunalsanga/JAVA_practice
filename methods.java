public class methods {
    public static void main(String[] args){
        sayhello();
        int sum = add(5,10);
        System.out.println("sum:"+sum);

    }
    public static void sayhello(){
        System.out.println("hello!");
    }
    public static int add(int a, int b){
        return a + b;
    }
}
