class MyClass{
    static int count=0;

    MyClass(){
       count++;
    }
}

public class J56 {
    public static void main(String[] args) {
            MyClass obj1 = new MyClass();
            MyClass obj2 = new MyClass();
            MyClass obj3 = new MyClass();
                                                
            System.out.println("Number Of objects :"+obj1.count); // jetla constructor banse etla obj banse

    }
}
