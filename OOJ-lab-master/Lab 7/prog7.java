class Gen<T> {
    T ob1,ob2;

    Gen(T o1,T o2){
        ob1=o1;
        ob2=o2;
    }

    T getob1(){
        return ob1;
    }

    T getob2(){
        return ob2;
    }

    void showdata(){
        System.out.println("Value 1: "+ob1);
        System.out.println("Value 2: "+ob2);
    }

    T sum(){
        if(ob1 instanceof Double){
            double d1=(double)getob1(),d2=(double)getob2();
            return (T)new Double(d1+d2);
        }
        else if(ob1 instanceof Integer){
            int d1=(int)getob1(),d2=(int)getob2();
            return (T)new Integer(d1+d2);
        }
        else if(ob1 instanceof String){
            String s1=(String)getob1(),s2=(String)getob2();
            return (T)new String(s1+s2);
        }
        else
        {
            System.out.println("Type "+ob1.getClass()+" not supported by this method");
            return (T)new Integer(-1);
        }
    }
}

class prog7{
    public static void main(String args[]){
        Gen<Integer> obj1=new Gen<Integer>(2,1);
        obj1.showdata();
        System.out.println("Sum:"+obj1.sum());
        Gen<Double> obj2=new Gen<Double>(4.5,3.2);
        obj2.showdata();
        System.out.println("Sum:"+obj2.sum());
        Gen<String> obj3=new Gen<String>("foot","ball");
        obj3.showdata();
        System.out.println("Sum:"+obj3.sum());
    }
}