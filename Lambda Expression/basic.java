// ###    JAVA 8 FEATURES  ####

// 1-> lambda                     			  //this are similar to method . ex-> (x,y)->x+y
// 2-> Functional Interface               // it is excatly one abstract method @FunctionalInterfacae annotation. 
// 3-> stram API                 				  // java stream api are for bulk data operations on collection 
// 4-> Date and Time API   			 // under the package of java.time  java offers new date and time api
// 5-> Base 64 encode and decode // java build in encode and decode functions.
// 6-> Method referance 
// 		and constructor referance    // :: operator (double operator)
// 7-> Default method in interface


// ####     FEATURES ONE BY ONE ####

// 1) LAMBDA-> 
// 					Not having return type
// 					not having any name
// 					not having modifier
			
// Step to make any function to lambda 
// 1) remove modifier
// 2) remove name
// 3) remove return type
// 4) place arrow ->



public class basic {




    // private int getStringLength(String str) {
    //     return str.length();
    // }
    // 1. Normal way to write
    // (String str)->{return str.length();}

    // 2. Type inference way to write
    // (str) -> return str.length();

    // 3. Remove the return keyword
    // (str) -> str.length;

    // 4. Only if one param remove small brackets
    // str -> str.length();


    
    // private void add(int a , int b) {
        // System.out.println(a+b);
    // }

    // Normal way to write
    // (int a, int b)->{System.out.println(a+b);}

    // Type inference way to write
    // (a, b) -> System.out.println(a+b);





    // we can write it like 
    // 
    public static void main(String[] args) {
        String str = "Manish";

    }
}