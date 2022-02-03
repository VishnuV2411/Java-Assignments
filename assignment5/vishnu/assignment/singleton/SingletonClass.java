/*
package vishnu.assignment.singleton;

public class SingletonClass {
    String str;
    public SingletonClass(String inStr){
        str = inStr;
    }

    public static SingletonClass SingletonMethod(String s){
        str = s;          /*A Static method can only access static variables,as
                            A static method does not run in context of any specific instance of the class
                            To use a non-static variable, you need to soecify which instance of the class
                            the variable belongs to.*/

   /*    SingletonClass sc = new SingletonClass(s);
        return sc;
    }

    public void print(){
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        SingletonClass sc = new SingletonClass(str);
        sc.SingletonMethod(str);
        sc.print();

    }
}*/
