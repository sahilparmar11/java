// Write an application that executes two threads. One thread 
// displays "Good Morning" every 1000 milliseconds & another thread 
// displays "Good Afternoon" every 3000 milliseconds. Create the 
// threads by implementing the Runnable interface.

class MyThread1 implements Runnable {
    public void run(){
        try{
            while(true){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Exception is handled");
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        try{
            while(true) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){
            System.out.println("Exception is handled");
        }
    }
}

class J09A1{
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread1());
        // MyThread1 mt1 = new MyThread1();
        // Thread t1 = new Thread(mt1);

        Thread t2 = new Thread(new MyThread2());

        // MyThread2 mt2 = new MyThread2();
        // Thread t2 = new Thread(mt2);
        
        t1.start();
        t2.start();
    }
}