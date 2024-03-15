import java.util.Scanner;
public class LAB4ii{
public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a alphabate");
    String s=sc.nextLine();
    int v=0;
    int c=0;
    String vowel ="aeiou";
    for(int i=0;  i<s.length()-1;i++){
        if(vowel.indexOf(i)==-1){
            c++;
        }
        else{
            v++;
        }
    }
    System.out.println("vowel"+v);
    System.out.println("consonent"+c);
}
}