public class Operators {

    public static void main(String[] args) {
        // Operators in Java:

        //1. Arithmetic Operator +, -, *, /, %

           int sum=0;
           sum=sum+1; // value of sum has got increased by 1
           sum+=1;  // as good as writing sum=sum+1;
           sum+=5;  // sum=sum+5;
           sum-=2;  // sum=sum-2;
           sum/=5;  // sum=sum/5;
           sum*=10; // sum = sum*10;


//        int a = 100;
//        int b = 3;
//        System.out.println(a % b);

        //2. Increment/ decrement operators
        // Notes : pre increment/decrement operators e.g. ++i here first increment/decrement takes place by 1
        // then value will get printed.
        /// post increment/decrement operators e.g. i++ here first value will get printed
        // then increment/decrement takes place by 1.
        // ++, --

//          int i=10;
//         System.out.println(i++);
//         System.out.println(i);
        int x = 100;
//        System.out.println(++x); // pre-increment 101 correct
//        System.out.println(x++); // 101
//        System.out.println(x--); // 102
//        System.out.println(++x); // 102
//        System.out.println(--x); // 101
//        System.out.println(x);   // 101

        //3. Assignment Operator =
        // int y<-50;  50 value is getting assigned to y variable

        //4. Relational operators ==, <, >, >=, <=, != always return boolean output that means true or false.

//        int p = 50;
//        int q = 80;
//        System.out.println(p >= q);

//5. Logical Operator (AND &&)   (OR ||)

        // AND && operator both of the conditions should be true in order to get true output

        int k=5;
        int l=7;
//        System.out.println(k<=l && k<l);

        // in AND operator if the first condition false second condition will not
        // be checked by compiler bcoz that doesnt matter answer would be false in anyway.

        // OR || operator return true even if one condition is true.

//        System.out.println(k<l || k==l);

        // In OR operator if first condition is true then compiler will not check then second one
        // bcoz answer has to be true anyhow.

         // Logical NOT !
          boolean flag = true;

          if(!flag){
              System.out.println("Java");
          }

          // In mathematics we have studies BODMAS (brackets, division, multiplication, addition and subtraction  )
          // In Java programming we follow PEDMAS (parentheses, Exponential, division, multiplication, addition and subtraction )

       /** Operator Precedence
        "Order of operations" when mixing different kinds of operators
        A single expression can mix all of the different kinds of operators together. It is
        best practice to use parentheses whenever things might get confusing, but Java
        does have a set precedence among the different operators:
        1. Arithmetic Operators
        2. Relational Operators
        3. Logical Operators
        4. Assignment Operators  */

        // for example
         int q=5;
         int r=7;

        System.out.println(q+1==r-1);


    }


}
