import java.util.Scanner;
class Student{
    int id_no;
    int  no_of_subjects_registered;
    String[] subject_code;
    int [] subject_credits;
    String[]  grade_obtained;
    double spi;

public Student(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter ID no");
    id_no=sc.nextInt();
    System.out.println("enter no of sub registered");
    no_of_subjects_registered=sc.nextInt();
    subject_code=nextInt(no_of_subjects_registered);
    subject_credits=nextInt(no_of_subjects_registered);
    grade_obtained=nextInt(no_of_subjects_registered);

    for( int i=0;i<no_of_subjects_registered;i++){
        System.out.println("Enter Subject Code for subject no "+(i+1));
        subject_code[i]=sc.nextInt();
        System.out.println("Enter Subject Credits for subject no "+(i+1));
        subject_credits[i]=sc.nextInt();
        System.out.println("Enter Subject great obtain for subject no "+(i+1));
        grade_obtained[i]=sc.nextInt();
    }
}
 void Calculation_spi(){
double totalcredit=0;
int temp=0;
for(int i=0;i<grade_obtained.length;i++){
    totalcredit+=subject_credits[i];
    int greadW=0;
    if(grade_obtained[i].equals("A")){
        gradeW = 10;
    }else if(grade_obtained[i].equals("B")){
        gradeW = 9;
    }
    temp = temp + (subject_credit[i]*gradeW);
}
spi = temp/totalCredit;
}
}
public class Lab6__1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();

		Student[] students = new Student[n];

		for(int i=0;i<n;i++){
			students[i] = new Student();
		}

		for(int i=0;i<n;i++){
			students[i].calculate_spi();
		}

		for(int i=0;i<n;i++){
			System.out.println("SPI of student with ID "+students[i].id_no +" = "+students[i].spi);
		}
	}
}