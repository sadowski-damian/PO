public class Main {

    static int x = 3; // CLASS scope

    public static void main(String[] args) {
        // variable scope
        int x = 5; // local
        System.out.println(x);
        doSomething();
   }
   static void doSomething(){
        int x = 10; // local
       System.out.println(x); // LOCAL VARIABLES FIRST, THEN CLASSES
   }

}
