public class exception_thorw {
    public static void main(String[] args) {
        int i=10;
        int j=0;

        try{
            i=i/j;
            if(j==0) throw new ArithmeticException("wrong");
        }
        catch(ArithmeticException e){
            i=i/1;
            System.out.println(i);
            System.out.println("useing thorow");
        }
    }
}
