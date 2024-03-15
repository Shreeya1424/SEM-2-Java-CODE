import java.util.Scanner;
public class Demostring{
    public static void main (String[]args){
        String str ="darshan collage rajkot,Gujarat";
        int index = str.indexOf('a');
        while(index!=-1){
            System.out.println(index);
            index = str.indexOf('a',index+1);
        }
    }
}