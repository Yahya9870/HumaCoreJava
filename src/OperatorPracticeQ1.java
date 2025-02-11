public class OperatorPracticeQ1 {
    public static void main(String[] args) {
//        int a = 5, b = 3, c = 2, d = 4, e = 6;
//
//        int result = ++a - b-- * c++ + d / --e;
//
//           // 6 - 3 * 2 + 4 / 5
//           // 6-6 = 0
//           // PEDMAS
//
//        System.out.println("Result = "+result);

        int x = 6, y = 3, z = 4, w = 5;

        int result = x++ - --y * z-- + w++ + x - --w + y++ * z;

          // -2 + + w++ + x - --w + y++ * z;

        // 1.Evaluation of x++:

        // post increment first actual will be use
         // 6 but incremented would 7
        // 2. Evaluation of --y:
          // y=2

        //3. evaluation of z--:
          // actual value would be there 4 but it becomes 3

        // 4. expression so far: x++ - --y*z--
            //     6 - 8 == -2


        // 5. evaluate w++:
          // 5 would be there but (it becomes 6 for future use)


        // 6. add w++ to previous result

         // -2+5 = 3 + x - --w + y++ * z;

        //7. current value of x is 7 + 3 = 10

         //   10 - --w + y++ * z;

        //8.  evaluation of --w
          // 5

         // 10 - 5 + y++ * z;
         // 5+ + y++ * z;

        //9. evaluate y++:
           // value used in expression 2 but become 3 for future

        // 10. Use of z after decrement : 3
        // multiply y++ * 3 = 6

        // 11. Add the last multiplication to the previous result:

         // 5 + 6 = 11 (Answer)







        System.out.println("Result: " + result);


    }
}
