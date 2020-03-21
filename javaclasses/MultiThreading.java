package javaclasses;

class MultiThreadControler {
    public static void main(String[] args){
        System.out.println("MultiThreadControler Activated...");

        //Create threads

        A threadA = new A();
        B threadB = new B("B");
        B threadC = new B("C");

        threadA.start();
        threadB.start();
        threadC.start();

        System.out.println("Completed main thread.");

    }
}


class A extends Thread{
    public void run(){
        System.out.println("Started Thread A");
        for (int i=0;i<10;i++){
            System.out.println("Executed A, i = "+i);

            if (i==5){
                System.out.println("Hit i = 5, going to yeild");
                yield();
                System.out.println("Completed yield");
            }
        }
    }
}

class B extends Thread{
    String threadname = "";
    B(String threadname){
        super();
        this.threadname = threadname;
    }

    public void run(){
        System.out.println("Started Thread "+threadname);
        for (int i=0;i<10;i++){
            System.out.println("Executed "+ threadname +", i = "+i);
        }
    }

}
