package basic;
public class operators {
    public static void main(String[] args) {
        int a=5;
        int b=10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        a++;
        b--;
        a+=3;
        b-=1;
        

        boolean m=true;
        boolean n=true;

        boolean p = m&& n;
        boolean q = m|| n;

        System.out.println(p);
        System.out.println(q);

        System.out.println(a+"and"+b);
    }
}
