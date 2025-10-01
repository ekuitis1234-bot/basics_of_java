interface addition{
    int add(int x ,int y);
}
interface substractoin{
    int sub(int x ,int y);
}
public class lambda_with_return {
    public static void main(String[] args) {
        addition a1 =(int a, int b) -> {
                return a+b;
            };
        
        substractoin a2 = ( a,  b) ->  a-b;
            
        
      System.out.println(  a1.add(4,5));
      System.out.println(  a2.sub(4,5));
    }
}
