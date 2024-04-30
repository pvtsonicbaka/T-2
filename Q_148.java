// package QB;

public class Q_148 extends Thread {
    public static void main(String[] args) throws Exception {
        Q_148 t1 = new Q_148("1");
        Q_148 t2 = new Q_148("2");

        Q_148 t4 = new Q_148("3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t4.start();
        t4.join();
        
        System.out.println("byy");

    }
    Q_148(String s ){
        super(s);
    }
    @Override
     synchronized public void  run() {
        Thread t = Thread.currentThread();

        for(int i=0;i<10;i++){
        System.out.println("hellow"+Thread.currentThread());
        
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    }
}
