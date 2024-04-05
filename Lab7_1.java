abstract class Vegetable{
String color;
public Vegetable(String color){
    this.color = color;
}
abstract public String toString();
}

class Potato extends Vegetable{
    public Potato(String color){
        super(color);
    }
    public String toString()
	{
		return "Name = Potato : Color = "+color;
	}
}

class Bringel extends Vegetable{
    public Bringel(String color){
        super(color);
    }
    public String toString()
	{
		return "Name = Bringel : Color = "+color;
	}
}
class Tomato extends Vegetable{
    public Tomato(String color){
        super(color);
    }
    public String toString()
	{
		return "Name = Tomato : Color = "+color;
    }
}
public class Lab7_1 {

public static void main(String[]args){
    Potato p = new Potato("Brown");
    Bringel b = new Bringel("Purple");
    Tomato t = new Tomato("Red");
    System.out.println(p);
    System.out.println(b);
    System.out.println(t);
}

    
}
