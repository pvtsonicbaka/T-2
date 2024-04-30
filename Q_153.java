class Q_153 {
    public static void main(String[] args) {
        Odd o1 = new Odd();
        Even e1 = new Even();
        e1.start();
        try {
            e1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        o1.start();;
    }
}
/**
 *  odd
 */
class  Odd  extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            if(i%2==0)
            System.out.println(i+"-->is even");
        }
    }
    
}
/**
 *  evem
 */
class  Even extends Thread{
    public void run(){
        for(int i=1;i<100;i++){
            if (i%2!=0) {
                
                System.out.println(i+ "-->is odd");
            }

        }

    }
    
}