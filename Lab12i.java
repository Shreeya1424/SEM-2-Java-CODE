import java.util.Scanner;
public class Lab12i{
public static void main(String[] args) {
    Scanner sc=newScanner(system.in);
	float a,b,sum,sub,mul,devi;
	scanner sc = new scanner(System.in);
	System.out.println("Enter a Number");
	float a=sc.nextFloat;
	float b=sc.nextFloat;
	switch(sc){
		case 1:
		sum=a+b;
		break;
		case 2:
		sub=a-b;
		break;
		case 3:
		mul=a*b;
		break;
		case 4:
		devi=a/b;
		break;
		System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(devi);
	}
}
}