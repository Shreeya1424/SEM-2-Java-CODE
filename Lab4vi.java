import java.util.Scanner;
public class Lab4vi{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a alphabate");
        String s=sc.nextLine();
        int length=args.length;
        for (int i=0;i<length;i++){
            args[i].charAt(0);
            if(s.charAt(0)<65||s.charAt(0)>90){
            System.out.println("Error");
            return;
            }
        }
    }
}