class A implements Runnable {

}

class B implements Runnable {

}

public class runnable {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("showring A");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        Runnable obj2 = () -> {

            for (int i = 0; i < 10; i++) {
                System.out.println("showring B");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
