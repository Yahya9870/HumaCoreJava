public class Identifiers_Variables_Naming {

    // What is an identifier?

    // Ans: The self chosen names by the programmer for classes, objects, methods, packages and variables are known as identifiers.
    // naming convention rules .

    // Rule Number 1: Must not start with a number.

    // int 1a;  // error

    // Rule Number 2: Case sensitive in nature. (Java is a case-sensitive language)
     // all of them are different
     int HUMA;
     int Huma;
     int huma;
     int HUma;
     int huMA;

     // Rule Number 3: Cannot be keyword

      // int int; error
      int Int;  // not give error but not a good programming practice.
       // All of them will be given errors.
//      int static;
//      int void;
//      int continue;
//      int try;
//      int if;

    // Rule Number 4: Cannot have white spaces (normal spaces)

      // int hello  my name     is    huma;   // error

      int helloMyNameIsHuma;
      int hello_my_name_is_Huma;

      // Note: there is  no length limit while declaring an identifiers.
    // Rule Number 5: Can have underscores, numbers, special symbols if above conditions are satisfied.

      // What are the valid identifiers among the following:

     // a) int 123_abc (wrong as we cannot start with numbers);  b) int _12abc (correct)  c) int Double (correct but not a good programming practice) d) int a_123 () correct e) int float not correct as float is a reserved keyword of java.

    int _huma; // no errors we can start with underscore.

}
