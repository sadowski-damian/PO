public class Main {
    public static void main(String[] args) {
        // methods can share the same name but not same parameters
        System.out.println(add(1,2,3));
        System.out.println(add(1,2));

        String pizza = bakePizza("flat bread", "parmesan", "peperoni");
        System.out.println(pizza);
   }
   static double add(double a, double b){
        return a + b;
   }
   static double add(double a, double b, double c){
        return a + b + c;
   }

   static String bakePizza(String bread){
        return bread + " pizza";
   }
    static String bakePizza(String bread, String cheese){
        return bread + " pizza" + cheese + " cheese";
    }
    static String bakePizza(String bread, String cheese, String meat){
        return bread + " pizza " + cheese + " cheese " + meat + " meat.";
    }

}
