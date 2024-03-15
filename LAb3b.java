import java.util.Scanner;
public class Lab3b{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        int rem,r=0,temp=a;
        while(a>0){
        rem=a%10;
        r=r*10+rem;
        a=a/10;
        }
        if(temp==r){
            System.out.println("Pelindrom Number");
        }
        else{
            System.out.println("number is not pelindrom");
        }
    }
}

while(s<=length()/2)
if(Str.charAt(s)!=Str.charAt(e))
flag=false
break;
else s++,end--;haji ek var if cindition avshe
int s=0,flag=true;
return;\\System vadu krvanu