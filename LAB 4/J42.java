import java.util.Scanner;

public class J42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");

        String str = sc.nextLine();
        int consonant=0 , vowel=0;
        sc.close();
        String s = "aeiouAEIOU";
        sc.close();
        
        /*for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u'
            || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O'|| str.charAt(i)=='U'){
                vowel++;
            }

            else{
                consonant++;
            }
        }
        */
        for(int i=0;i<str.length();i++){
        if(str.indexOf((s.charAt(i)))==-1){
             consonant++;
            
        }
        else{
             vowel++;
        
        }
    }
        System.out.println("Number of Vowels :"+vowel);
        System.out.println("Number of Consonants :"+consonant);
    }

    
}
