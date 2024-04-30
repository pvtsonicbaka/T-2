public class Q_152 {
    public static void main(String[] args) throws InterruptedException {

            PleaseNameMe gm = new PleaseNameMe();
            Thread t = new Thread(gm,"Good mourning");
            t.start(); 
                  
            PleaseNameMe gn = new PleaseNameMe();
             t = new Thread(gn,"good night");
            t.start();
        


    }
}
/**
 *  PleaseName me
 */
 class  PleaseNameMe implements Runnable{
   
    public void run(){
        Thread t = Thread.currentThread();

        int i =0;
        while (i!=10) {
            
            try {
                if(t.getName().equalsIgnoreCase("Good mourning")){
                    System.out.println(t.getName());
                        // System.out.println(1000);
                        Thread.sleep(1000);
                }
                else{
                    System.out.println(t.getName());
                    Thread.sleep(2000);
                }
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    
}
