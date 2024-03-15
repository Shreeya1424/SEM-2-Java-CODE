import java.util.Scanner;
public class str{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int s=0,e;
        boolean flag=true;
        while(s<=Length(a)/2){
            if(str.charAt(int s)!=str.charAt(int e)){
                flag=false;
                break;
            }
            else{
                s++;
                e--;
                break;
            }
        }
        if(flag=true){
            System.out.println ("number is pelindrom"); 
        }
        else{
            System .out.println ("number is not pelindrom");
        }
        
    }
}   