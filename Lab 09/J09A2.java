// Write a program to create two threads, one thread will print odd 
// numbers and second thread will print even numbers between 1 to 20 
// numbers.

class PrintOddNumbers implements Runnable {
    public void run(){
        try{
            for(int i=0; i<=20;i++){
                if(i % 2 == 1){
                   System.out.println(i);
                   Thread.sleep(1000);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception is handled");
        }
    }
}

class PrintEvenNumbers implements Runnable {
    public void run(){
        try{
            for(int i=0; i<=20;i++){
                if(i % 2 == 0){
                   System.out.println(i);
                   Thread.sleep(1000);
                }
            }
        }
        catch(Exception e){
            System.out.println("Exception is handled");
        }
    }
}



public class J09A2 {
    public static void main(String[] args) {
        PrintOddNumbers pOdd = new PrintOddNumbers();
        Thread t1 = new Thread(pOdd);

        PrintEvenNumbers pEven = new PrintEvenNumbers();
        Thread t2 = new Thread(pEven);

        t1.start();
        t2.start();
    }
    
}
