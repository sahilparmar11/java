// Refine the student manager program to manipulate the student 
// information from files by using the BufferedReader and 
// BufferedWriter.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class Student{
    int age;
    String name;

    Student(int age , String name){
        this.age = age;
        this.name = name;
    }
}

class J11A1{
    public static void main(String[] args){
        // try{
        //     BufferedWriter bw = new BufferedWriter(new FileWriter("File.txt") );
        //     bw.write("Sahil,18\n");
        //     bw.write("Rishil,17\n");
        //     bw.write("Harsh,18\n");

        //     bw.close();
        //     System.out.println("Data Written Successfully");

        // }
        // catch(Exception e){
        //     e.printStackTrace();
        // }
        Student st1 = new Student(18,"sahil");
        Student st2 = new Student(17,"rishil");
        Student st3 = new Student(18,"harsh");

        try{
            BufferedReader br = new BufferedReader(new FileReader("File.txt"));

           String temp = br.readLine();
           while (temp != null) {
                String[] arr = temp.split(",");
                Student st = new Student(Integer.parseInt(arr[1]), arr[0]);
                System.out.println(temp);
                temp = br.readLine();
            }
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}