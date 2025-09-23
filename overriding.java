class animal{
    animal(){
int a=5;
    }
   
}
 class dog extends animal{
  dog(){
  int a=10;
  }
  
}
public class overriding {
    public static void main(String[] args) {
        dog d1 = new dog();
        System.out.println(d1.a);
    }
}
