 class Cat {
String name;
int age;
static int Catcount;
Cat(){
    Catcount++;
}}
public class LAb5__6 {
public static void main(String[]args){
    Cat c1 = new Cat();
    System.out.println(Cat.Catcount);
    Cat c2 = new Cat();
    System.out.println(Cat.Catcount);
    Cat c3 = new Cat();
    System.out.println(Cat.Catcount);
    c1 = new Cat();
    System.out.println(Cat.Catcount);
}
}
