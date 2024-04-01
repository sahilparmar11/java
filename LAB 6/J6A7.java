final class Demo{ // This class can't be inheritate
    final int i = 2;
     // value of i cannot be change
    // int i = 3;
    void getter(){
        System.out.println("i= "+i);
    }
}

public class J6A7 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.getter();
    }
}
