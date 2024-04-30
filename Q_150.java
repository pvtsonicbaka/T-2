

public class Q_150 {
    public static void main(String[] args) throws InterruptedException {
        PrimeCheck pc [] = new PrimeCheck[100];
        PrimePrint pp [] = new PrimePrint[100];
        for(int i =0;i<pc.length;i++){
            pc[i] = new PrimeCheck(""+i,i);
            pc[i].start();
            // pc[i].join();
            pp[i] = new PrimePrint(i+"", i);
            pp[i].start();

        }
    }
    
    
}
class PrimeCheck  extends Thread {
    int n;
    
    public PrimeCheck(String name, int n) {
        super(name);
        this.n = n;
    }
    boolean b = false;


    public synchronized void run(){
        boolean b = false;
        for(int i=2;i<=  n-1;i++){
            if( n%i==0){
                b= true; 
                break;
            }
        }
        if(b){
            System.out.println(n+ "-->is not prime");
        }
        else{
            System.out.println(n+ "-->prime");
        }
    }
}
class PrimePrint extends Thread{
    boolean b = false;
    int n ;

    public PrimePrint(String name, int n) {
    super(name);
    this.n = n;
}

    public void run(){
        if(b){
        System.out.println(n+"n printed");
        }
    }
}
