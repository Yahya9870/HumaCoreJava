import java.util.Scanner;

public class DataTypesAndVariables {
    public static void main(String[] args) {

        //  Theory Explanation:
        //         Variable and Data Types in Java// 100 1+2+......+100
//         There are 2 kinds of data type in Java
//         1. Primitive (e.g. int float double etc.) 2. Non-Primitive (ArrayList, Stack etc.)
//         In Primitive, we have 8 types 1. int  2. long 3. float 4. double
//         5. boolean 6. char 7. byte and 8. short
//         Non-Primitive we have Arrays, String, Map etc.
//         As of now we mostly focus on Primitive Data Types
           // INTEGERS (byte, short, int and long)
        // 1. Byte   1 byte (memory size)   bits= 1X8=8bits    Generalized formula for the range -2^(bits-1)  to 2^(bits-1)-1 == -128 to 127
//        // Database administrator in an IT Company
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a byte: ");
//        byte b = sc.nextByte();
//        System.out.println("byte value: "+b);
        // ur task is to store age of all people living in NYC
        //  example 9M people living in that city.
        int age; // 4 bytes // 9X4M= 36M memory size (it will take huge chunk of memory and )
        byte age1; // -128 to 127  // 1 byte // 9X1=9M memory size (75% less memory as compared to int)
//        byte age = 0;  // optimal solution // software engineering is all about getting the best/optimal solution
//        System.out.println(age);
//        long age1=126;  // not optimal taking a lot of unnecessary spaces.
        // default value in zero

        //2. Short  2 bytes = 2X8 = 16 bits      range -2^15 to (2^15)-1
        // default value is zero                -2^(bits-1) to 2^(bits-1)-1

        //3. Integer or int  4 bytes = 4X8=32 bits    range -2^31 to (2^31)-1
        //    default value is zero

        // 4. float (decimal)  memory size is 4 bytes      (its range is not defined).

        //float f= 3.252678953f;
        // int a =5; (hard coded)


//
//        System.out.println(x);

        //     default value is 0.0f
        // 5. double memory size is 8 bytes       (its range is not fined).
        double y = 3.16;
//        System.out.println(y);
        // default value is 0.0d or 0.0
        // 6. long  8 bytes = 8X8=64        range -2^63 to (2^63)-1
        // default value is zero
        // 7. char   2 bytes = 2X8=16      range (2^16)-1  65535
//        char kashif='a';
//
//                      System.out.println(kashif); // A
//        int asciiValue=kashif;
//        System.out.println("The ascii value of given alphabet is "+asciiValue+" something.");

        // 8. boolean   it can be either true or false
    //    boolean something = false;
////
     //   System.out.println(something);


        //   size depends upon JVM (Java Virtual Machine)

        // default value is false
//        int a=10;
//        System.out.println(a++);  // 10
//        System.out.println(a);    // 11

//        int b=10;
//        System.out.println(++b); // 11
//        System.out.println(b++); // 11
//        System.out.println(++b); // 12           (4/5) marks 80%

        // if u put ++ or -- after the variable then it is called post incremental operator.
        // ++ or -- we put before the variable then it is called pre incremental operator and it updates the variable right-away.

        // System.out.println("Program is running");

    }
}
