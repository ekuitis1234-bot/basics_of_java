 class A extends Thread{
    public void run(){
        for(int i =0;i<100;i++){
 System.out.println("showring A");
 try{
Thread.sleep(5);
 }
 catch(InterruptedException e){
    e.printStackTrace();
 }
 
        }
       
    }
 }
  class B extends Thread{
    public void run(){
for(int i =0;i<100;i++){
 System.out.println("showring B");
 try{
Thread.sleep(5);
 }
 catch(InterruptedException e){
    e.printStackTrace();
 }
        }
    }
    
 }
public class multithreding {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(1);
        obj2.setPriority(9);
        obj1.start();
        obj2.start();
        
    }
}
