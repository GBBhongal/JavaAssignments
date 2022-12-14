// Create an interface with only one method and implement it in a class.call the method implemented.

package com.Interfaces;
interface oneMethod{
    void method();

}
class oneMethodClass implements oneMethod{
    public void method()
    {
        System.out.println("Calling method by implementing interface: ");
    }
}

     class oneMethodinterface {
    public static void main(String[] args)
    {
        oneMethodClass one=new oneMethodClass();
        one.method();
    }
}
