import java.util.Scanner;

class StringVowel{
    String str;
    int count_a, count_e,count_i,count_o,count_u;

    StringVowel(String str){

        count_a = 0;
        count_e = 0;
        count_i = 0;
        count_o = 0;
        count_u = 0;

        str = str.toLowerCase();
        int j=0;

        while(!str.equalsIgnoreCase("quit") && j<str.length()) {   

            if(str.charAt(j)=='a'){
                count_a++;
            }
            else if(str.charAt(j)=='e'){
                count_e++;
            }
            else if(str.charAt(j)=='i'){
                count_i++;
            }
            else if(str.charAt(j)=='o'){
                count_o++;
            }
            else if(str.charAt(j)=='u'){
                count_u++;
            }
            j++;
        }
        System.out.println("Number of character a in string :"+count_a);
        System.out.println("Number of character a in string :"+count_e);
        System.out.println("Number of character a in string :"+count_i);
        System.out.println("Number of character a in string :"+count_o);
        System.out.println("Number of character a in string :"+count_u);

        count_a = 0;
        count_e = 0;
        count_i = 0;
        count_o = 0;
        count_u = 0;
    }
}

public class J53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        StringVowel str = new StringVowel("My Name Is Sahil quit");
        sc.close();
    }
}
