import java.util.Scanner;
public class Pelindrom{
    public static void main(String[]args){
    
        String str="sts";
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