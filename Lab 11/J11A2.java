// Write a program to check that whether the name given from command 
// line is file or not? If it is a file then print the size of file 
// and if it is directory then it should display the name of all 
// files in it.


import java.io.File;
public class J11A2 {
    public static void main(String[] args) {
        File f1 = new File(args[0]);

        if(f1.isFile()){
            System.out.println("File's size =" + f1.length());
            
        }
        else{
            System.out.println("Files in directory : ");
            String[] str = f1.list();
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        }
        
    }
}
