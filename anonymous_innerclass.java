class car{
    void run(){
        System.out.println("car runs");
    }
}
public class anonymous_innerclass {
    public static void main(String[] args) {
        car c1 = new car(){
            void run(){
                System.out.println("fuck thisi car runs");
            }
        };
        c1.run();
    }
}
