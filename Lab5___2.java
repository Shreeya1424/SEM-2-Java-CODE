class Time{
    int h;int m;
    Time(){
        h=0;m=0;
    }
    Time(int h,int m){
        this.h=h;
        this.m=m;
    }
    public void addTime(t1,t2){
        this.h=(t1.h + t2.m);
        this.m=(t1.m + t2.m);
        while(this.m>60){
            this.h++;
            this.m-= 60;
        }
        System.out.println(this.h+":"this.m);
    }
}
public class Lab5___2{
public void addTime(t){
    this.h+=t.h;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h,m;
        System.out.println("Enter 1st time: ");
        h=t.t1;
        m=t.t1;
        Time=new Time(t1,t2);
System.out.println("Enter 2st time: ");
        h=t.t2;
        m=t.t2;
        Time=new Time(t1,t2);
        t3=new Time();
        t3.addTime(t1,t2);
    }
}
}