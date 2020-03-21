package javaclasses;

class MainClass {
    public static void main(String[] args){
        System.out.println("Exception Handling Demo Started...");

        int x=1, y=0, z;

        //This will raise an expetion
        try {
            z = x/y;
            System.out.println(z);
        } catch(ArithmeticException e){
            System.out.println("Caught the exception in the first clause.");

        } catch(StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println("Multiple Exception catching");

        } catch (Exception e){
            System.out.println("Catching general exceptions");
            System.out.println("Error: "+e);
            System.out.println(e.getMessage());
        }

        try{
            testrun();
        }catch (MyException e){
            System.out.println("Caught My exception");
        }finally{
            System.out.println("This is always there");
        }

    }

    static void testrun () throws MyException{
        throw new MyException();
    }
}

class MyException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    MyException() {
        super("This is a custom exception");
    }
}