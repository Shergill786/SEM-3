// public class abc extends Thread{
//     public void run(){
//         System.out.println("first thread started");
//     } 
// }
// public class xyz extends Thread{
//     public void run(){
//         System.out.println("second thread started");
//     }
// }

// public class abc implements Runnable{

//     private String s1;

//     public abc(String a){
//         this.s1=a;
//     }
//     public void run(){
//         System.out.println(s1+ "is executed by"+Thread.currentThread().getName());
//     } 

//     public static void main(String[] args) {
//         Thread t1 = new Thread(new abc("red"));
//         Thread t2 = new Thread(new abc("blue"));
//         Thread t3 = new Thread(new abc("green"));
//         Thread t4 = new Thread(new abc("yellow"));
    
//     t1.start();
//     t2.start();
//     t3.start();
//     t4.start();
//     }
// }



// thread 
// same memory space share 
// thread class runable interface
// 


// states of thread 6 
// new ,runnable ,blocked ,wating,timewating ,terminated

// 
// 
// public static void main(String[] args) {
    // Thread t1 = new Thread(new abc("red"));
    // System.out.println(t1.getState());
//     Thread t1=new Thread(() -> {
//         System.out.println("Thread is running");
//     });
// t1.start();
// System.out.println(t1.getState());


class abc implements Runnable{

    public void run(){
     try {
        Thread.sleep(200);
        System.out.println("abc.mainThread.getState()");
        Thread.sleep(100);
    }
    catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
    }

}
public class xyz{
    public static Thread mainThread;    
    public static void main(String[] args) throws InterruptedException {
       mainThread = Thread.currentThread();
        
       Thread t2 = new Thread(new abc());
        System.out.println(t2.getState());
      
       t2.start();
       System.out.println(t2.getState());
        
       Thread.sleep(100);
       System.out.println(t2.getState());

       System.out.println(t2.getState());
       t2.join();

       System.out.println(t2.getState());

    }
}