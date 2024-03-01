class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this,"New Thread");
        t.start();
    }
    public void run(){
        try{
            while(true){
                System.out.println("CSE");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

class prog9{
    public static void main(String args[]){
        NewThread t=new NewThread();
        try{
            while(true){
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}