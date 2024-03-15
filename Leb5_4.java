import java.util.Scanner;
public class Leb5_4 {
    public static void main(String[] args){
  
      Bank_Accout b1 = new Bank_Accout();
      b1.getAccountDetails();
       b1.displayaccountdetails();
    }
}
class Bank_Accout{
    int account_no;
    String username;
    String email;
    String accounttype;
    double accountbalance;

    void getAccountDetails(){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter account no : ");
      this.account_no = sc.nextInt();
      
    

      System.out.println("Enter username : "); 
      this.username = sc.next();

      
      System.out.println("Enter email: "); 
      this.email = sc.next();

      
      System.out.println("Enter accounttype: "); 
      this.accounttype = sc.next();

      
      System.out.println("Enter accountbalance: "); 
      this.accountbalance= sc.nextDouble();
   }

   void displayaccountdetails(){
      System.out.println("Enter account no : "+this.account_no);
      System.out.println("Enter username : "+this.username);
      System.out.println("Enter email: " +this.email); 
      System.out.println("Enter accounttype: "+this.accounttype); 
      System.out.println("Enter accountbalance: "+this.accountbalance); 
   }
}