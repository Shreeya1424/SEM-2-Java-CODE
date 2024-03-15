class Abc{
    static int count = 0;
}
public class StaticDemo{
public static void main(String[]args){
    Abc a1 = new Abc();
     Abc a2 = new Abc();
     Abc.count++;
     Abc.count++;
     Abc.count++;
     System.out.println(a1.count);
}
}
