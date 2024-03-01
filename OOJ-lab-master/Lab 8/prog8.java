import java.util.*;

class WrongAge extends Exception{
    private static final long serialVersionUID = 1L;
    String str;
    WrongAge(String s) {
        str=s;
    }
    public String toString(){
        return "WrongAge: "+str;
    }
}

class Father{
    public int age;
    public Father(int a) throws WrongAge{
        age=a;
        if(a<0)
            throw new WrongAge("Age cannot be less than 0");
        else
            System.out.println("Valid");
    }   
}

class Son{
    Son(int s,int f) throws WrongAge{
        if(s>=f)
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        else
            System.out.println("Valid");
    }
}

class prog8{
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            int f,s;
            System.out.print("Enter father's age: ");
            f=sc.nextInt();
            System.out.print("Enter son's age: ");
            s=sc.nextInt();
            Father ob1 = new Father(f);
            Son ob2 = new Son(s,f);
        }
        catch(WrongAge e){
            System.out.println(e);
        }
    }
}