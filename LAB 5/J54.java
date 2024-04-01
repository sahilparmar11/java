import java.util.Scanner;

class Bank__Account{
    int accountNo;
    String userName;
    String email;
    String accountType;
    float accountBalance;

    public void getAccountDetails(Bank__Account p1){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter AccountNo :");
        p1.accountNo = sc.nextInt();

        System.out.print("Enter Username :");
        p1.userName = sc.nextLine();

        System.out.print("Enter Email :");
        p1.email = sc.next();

        System.out.print("Enter Account Type :");
        p1.accountType = sc.next();

        System.out.print("Enter Account Balance");
        p1.accountBalance = sc.nextInt();
        sc.close();
            
            
    }
     public void displayAccountDetails(Bank__Account p1){
        System.out.println("account no: " + p1.accountNo);
        
        System.out.println("user Name: " + p1.userName);
        
        System.out.println("Email: " + p1.email);
        
        System.out.println("account Type: " + p1.accountType);
        
        System.out.println("account Balance: " + p1.accountBalance);

    }


public class J54 {
    public static void main(String[] args) {
        Bank__Account p1 = new Bank__Account();
        p1.getAccountDetails(p1);
        p1.displayAccountDetails(p1);

        }
    }
}
    

