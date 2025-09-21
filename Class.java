 class addition{
    public int add(int num1 , int num2){
        return num1+num2;
    }
    public String hey(int a){
        if(a>5) return "he";
        return "hi";
    }
}
public class Class{
    public static void main(String args[]){
        addition a = new addition();
        int result = a.add(4,5);
        String s = a.hey(6);
        System.out.println(result);
        System.out.println(s);
    }
}