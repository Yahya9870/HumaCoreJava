public class Loops {
    public static void main(String[] args) {
        // Loops in Java:

        // What is a normal loop?

        // Ans: Repetition of some tasks is called a loop.


        // Main reason of using loops:

        // Question to print your name 100 times:

        // Option A:
        // System.out.println("Huma"); // ... till 100 times

        // Option B:
        // loop (run 100 times) { print("Huma")}
        // In Java programming we have 4 kinds of loops:
        //1) for-loop   2) while loop 3) do-while loop
        // 4) for-each loop / enhanced for loop.

        // for loop

        // Syntax
        // for(declaration and initialization;condition checker;updation(increment/decrement)){
        //  body of for-loop
        //
        // }

        // Actual for loop implementation in Java

        // If you have to run a for loop N (where N can be any natural number 1,2, ... 10000) number of times

        // if you start from i=0 then for (i=0;i<N)
        // if you start from i=1 then for (i=1;i<=N)

//        for (int i = 1; i <= 10; i++) {
//
//            System.out.println("This is a for loop");
//
//
//
//        }

        // control flow of a for-loop

        // step 1: initialization takes place
        // step 2: condition checker
        // step 3: body of the loop
        // step 4: updation

        // 2. while loop:

        // syntax
        // initialization and declaration outside the loop

        // while(condition checker){
        //
        // body of the loop
        //
        //  updation(increment/decrement);
        // }

        // control flow

        // step 1: initialization takes place
        // step 2: condition checker
        // step 3: body of the loop
        // step 4: updation

        // Actual while loop

//         int j=0; // initialization
//         while (j<10){
//             System.out.println("I am while loop");
//             j++;
//         }


        //3. do-while (least used loop)

        // Special loop that run at-least 1 time even
        // if the given condition is false.

        // Syntax
        // initialization
        // do{
        // body of the loop
        //


        // updation
        // }

        // while(condition checker);

        // Actual implementation in Java

//         int k=100;
//
//         do{
//             System.out.println("I am do-while loop");
//             k++;
//         }
//
//         while (k<0);

    }
}
