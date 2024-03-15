import java.util.Scanner;
public class LAB3Firstsecond{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
         System.out.println("enter the number");
         int a=sc.nextInt();
        String str="shreeya";
        String revstr="";
        for(int i = str.length()-1;i>=0;i--){
            revstr = revstr+str.charAt(i);
        }
        if(str.equals(revstr)){
            System.out.println("Number is Pelindrom");
        }
        else{
            System.out.println("Number is Not Pelindrom");
        }
    }
}