

public class Q_149 implements Runnable {
    public static void main(String[] args) {
        Q_149 k = new Q_149();
        Thread t = new Thread(k);
        Thread sk = new Thread(k);
        sk.start();

        t.start();

    }

    @Override
     synchronized public void run() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
        for(int i =0;i<5;i++){
            System.out.println(i);
        }
    }
    
}
