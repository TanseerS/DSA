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

        //String Builders: String are immutable but builders are mutable with dynamic size
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('a'+i);
            build.append(ch);
        }
        System.out.println(build.toString());

        //Palindrome:
        String pal = "abcba";
        boolean ans=  isPallindrome(pal);
        System.out.println(ans);
    };
    static boolean isPallindrome(String pal){
        int start = 0;
        int end = pal.length()-1;
        while(start <= end){
            if(pal.charAt(start) == pal.charAt(end)){
                start += 1;
                end -=1;
            }else{
                return false;
            }
        };
        return true;
    }
}
