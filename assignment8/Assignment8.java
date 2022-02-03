package assignment.assigment8;

import java.util.Scanner;

class EvenNumberException extends Exception {
    public EvenNumberException(String exception){
        super(exception);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String exception){
        super(exception);
    }
}

class ZeroException extends Exception{
    public ZeroException(String exception){
        super(exception);
    }
}

public class Assignment8 {

    public void exceptionCheck(int n){
        try{
            if(n % 2 == 0 && n > 0 ){
                throw new EvenNumberException("This is an Even Number");
            }

            else if(n < 0){
                throw new NegativeNumberException("This is a Negative Number");
            }

            else if(n == 0){
                throw new ZeroException("This is Zero");
            }

            else{
                throw new NullPointerException();
            }
        }

        catch(EvenNumberException | NegativeNumberException | ZeroException e){
            System.out.println(e.getMessage());
        }

        finally{
            System.out.println("Finally Block");
        }
    }

    public static void main(String[] args) {
        Assignment8 newExceptions = new Assignment8();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        newExceptions.exceptionCheck(n);
    }
}

/*Input and Output
    Enter a number
    8
    This is an Even Number
    Finally Block

    Enter a number
    0
    This is Zero
    Finally Block

    Enter a number
    -90
    This is a Negative Number
    Finally Block

 */