// String is class in java
// Reference of string is stored in stack and object in heap memory
// There is a string pool(separate memory for string objects) that is used to point same objects of diff refs
// Strings are thus immutable in java
// == compares memory location rather than the object itself a.equals(b)
// .equals() only works on non-primitive datatype 
// To access a specific char from String use charAt(index)
package Strings;
public class Basics {
    public static void main(String[] args) {
        //String concatenation
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println("a"+1);
    }
}
