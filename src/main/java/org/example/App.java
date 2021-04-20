package org.example;


public class App
{
    public static void main( String[] args )
    {

        String palindrome = "Ni talar bra latin";

        String palindrome2 = "Ni talar bra latin";

        String palindrome3 = new String("Ni talar bra latin");

        System.out.println(palindrome == palindrome2); // True because of "String pool"
        System.out.println(palindrome == palindrome3); // False because of new Keyword
        System.out.println(palindrome.equals(palindrome3)); //True because content match

        String[] parts = palindrome.split(" ");

        String foo = "This is a string";

        String is = foo.substring(5, 7);
        System.out.println(is);

        String is2 = "is";
        System.out.println(is2.substring(0) == is2); //Should be true because it dont need to create a new string

        System.out.println(is == is2); //False because of new String being created internally

        System.out.println(
                foo.substring(5)
                        .substring(3)
                        .toUpperCase()
        );





    }

    public static boolean isPalindrome(String s){
        boolean palindrome = s.replace(" ", "")
                .equalsIgnoreCase(
                        new StringBuilder(s.replace(" ", ""))
                                .reverse()
                                .toString()
                );
        return palindrome;
    }
}
