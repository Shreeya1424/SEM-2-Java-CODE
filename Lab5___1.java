import java.util.Scanner;
class Circle{
    double radius;
     double areaOfCircle(){
        return Math.PI * radius * radius;
    }
}
public class Lab5___1 {
    public static void main(String[] args){
      Circle c = new Circle(); 
      c.radius = 10.0;
      double area = c.areaOfCircle();
      System.out.println("Area :"+area);
    }
}
