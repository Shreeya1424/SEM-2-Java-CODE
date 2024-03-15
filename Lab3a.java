import java.util.Scanner;
public class Lab3a{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mark of 5 student");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        float per=(a+b+c+d+e)/5;
        if(per<=40){
            System.out.println("Fail");
        }
        else if(per>=49){
            System.out.println("Third Divition");
        }
        else if(per>=59){
            System.out.println("Second divition");
        }
        else{
            System.out.println("First divition");
        }
    }
}