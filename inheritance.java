class animal{
    int a=10;
}
class dog extends animal{
    int b = 1+10;
    public dog(){
        System.out.println(b);
    }
}
public class inheritance{
    public static void main(String args[]){
        dog d1 = new dog();
    }
}