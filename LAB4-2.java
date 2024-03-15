import java.util.Scanner;
public class LAB4-2{
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a alphabate");
    String s=sc.(next());
    int v=0;
    int c=0;
    for( int i=0; i<s.length(i)-1;i++){
        if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A' || s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
            v++;
        }
        else{
            c++;
        }
    }
    System.out.println("vovel"+v);
    System.out.println("consonent"+c);
}
}