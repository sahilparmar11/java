class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name); //print name of called object
        System.out.println(this.age); //print age of called object
        
        // we can not use this and super keywords in static method
    }
}

public class J57{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "sahil";
        s1.age = 19;

        s2.name = "parmar";
        s2.age = 18;
        
        s2.printInfo();
    }
}






// class This{
//     int height;

//     This(int height){
//         this.height = height;
//         System.out.println(height);
//     }
// }

// public class J57 {
//     public static void main(String[] args) {
//     This t1 = new This(10);
//     System.out.println("Enter Height :");
    
//     }
// }
