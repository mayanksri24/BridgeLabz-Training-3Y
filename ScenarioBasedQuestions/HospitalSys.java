interface Payable{double calcPay();} 

class Patient{
    private String n,h;private int a;
    public Patient(String n,int a){this.n=n;this.a=a;h="NA";} 
    public Patient(String n,int a,String h){this.n=n;this.a=a;this.h=h;} 
    public String getSum(){return n+" Age:"+a+" Hist:"+h;}
    public void disp(){System.out.println("Patient:"+getSum());}
}

class InPatient extends Patient{
    private int r;
    public InPatient(String n,int a,String h,int r){super(n,a,h);this.r=r;}
    public void disp(){System.out.println("InPatient:"+getSum()+" Room:"+r);} 
}

class OutPatient extends Patient{
    private String d;
    public OutPatient(String n,int a,String h,String d){super(n,a,h);this.d=d;}
    public void disp(){System.out.println("OutPatient:"+getSum()+" Doc:"+d);} 
}

class Doctor{
    private String n,s;
    public Doctor(String n,String s){this.n=n;this.s=s;}
    public void disp(){System.out.println("Doctor:"+n+" Spec:"+s);} 
}

class Bill implements Payable{
    private double amt;
    public Bill(double amt){this.amt=amt;}
    public double calcPay(){return amt*1.18-50;} 
    public void print(){System.out.println("Total Pay:"+calcPay());}
}

public class HospitalSystem{
    public static void main(String[] args){
        Patient p1=new InPatient("Ravi",45,"Diabetes",101);
        Patient p2=new OutPatient("Sita",30,"NA","Dr.Amit");
        Doctor d=new Doctor("Dr.Amit","Cardio");
        Bill b=new Bill(1000);

        p1.disp();
        p2.disp();
        d.disp();
        b.print();
    }
}
