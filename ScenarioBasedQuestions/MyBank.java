interface IT{void dp(double a);void wd(double a);void cb();} 

class A{
    protected String no;private double b;
    public A(String n,double ob){no=n;b=ob;} 
    public void dp(double a){b+=a;System.out.println("Deposited:"+a);} 
    public void wd(double a){if(a>b) System.out.println("Insufficient!");else{b-=a;System.out.println("Withdrawn:"+a);}} // withdraw
    public void cb(){System.out.println("Balance:"+b);} 
    public double getB(){return b;} 
}

class SA extends A{
    private double ir=5; 
    public SA(String n,double ob){super(n,ob);}
    public void calcInt(){double i=getB()*ir/100;System.out.println("Savings Interest:"+i);}
}

class CA extends A{
    private double ir=2; 
    public CA(String n,double ob){super(n,ob);}
    public void calcInt(){double i=getB()*ir/100;System.out.println("Current Interest:"+i);} 
}

public class MyBank{
    public static void main(String[] args){
        SA s=new SA("ACC123",1000);
        CA c=new CA("ACC456",5000);

        s.dp(500);s.wd(200);s.cb();s.calcInt();
        c.dp(1000);c.wd(7000);c.cb();c.calcInt();
    }
}
