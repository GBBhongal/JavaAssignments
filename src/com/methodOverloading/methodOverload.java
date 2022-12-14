package com.methodOverloading;

public class methodOverload {
    public static void main(String[] args) {
        /*
         * CALL TWO METHODS WITH SAME NAME WITH DIFFERENT NO. OF PARAMETERS OF SAME DATATYPE
         * */
    sum(18,24);
    sum(18,24,36);
        /*
         * CALL TWO METHODS WITH SAME NAME WITH DIFFERENT NO. OF PARAMETERS OF DIFFERENT DATATYPE
         * */
    diff(23,32);
    diff(23.32f,32.23f,54.98f);
        /*
         * CALL TWO METHODS WITH SAME NAME WITH SAME NO. OF PARAMETERS OF SAME DATATYPE
         * */
        mult(3,4,5);
        mult(3.2f,4.56f,5.98f);
        /*
         * CALL TWO METHODS WITH SAME NAME WITH SAME NO. OF PARAMETERS OF DIFFERENT DATATYPE
         * */
       div(67);
       div(67.78567f);
    }
    /*
     * TWO METHODS WITH SAME NAME WITH DIFFERENT NO. OF PARAMETERS OF DIFFERENT DATATYPE
     * */
    public static void diff(int v, int v1) {
        System.out.println(v1-v);
    }
    public static void diff(float v, float v1,float v2) {
        System.out.println((v2-v1)-v);


    }

    /*
    * TWO METHODS WITH SAME NAME WITH DIFFERENT NO. OF PARAMETERS OF SAME DATATYPE
    * */
        public static void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    /*
     * TWO METHODS WITH SAME NAME WITH SAME NO. OF PARAMETERS OF SAME DATATYPE
     * */
    public static void mult(int a,int b,int c)
    {
        System.out.println(a*b*c);

    }
    public static void mult(float a,float b,float c)
    {
        System.out.println(a*b*c);
    }
    /*
     * TWO METHODS WITH SAME NAME WITH SAME NO. OF PARAMETERS OF different DATATYPE
     * */
    public static void div(int roll)
    {
        System.out.println(roll);
    }
    public static void div(float roll)
    {
        System.out.println(roll);
    }
}

