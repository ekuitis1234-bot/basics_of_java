package basic;

public class conditionals {
    public static void main(String[] args) {
       int a=2;
       if(a%2==0) System.out.println("even");
       else if(a%2==0) System.out.println("odd");
       else System.out.println("nof");

       boolean result = a%2==0 ? true : false ;
       System.out.println(result);
    }
}
