class A{
    void show(){
        System.out.println("in A");
    }
}
class B extends A{
    void show(){
        System.out.println("in B");
    }
}
class C extends A{
    void show(){
        System.out.println("in C");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        A a = new A();
    a.show();

    a= new B();

    B b = new B();

    b.show();
    a.show();
    }
    
}
