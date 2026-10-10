import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if(str1.length() != str2.length()){
            System.out.println("Not an Anagram");
            return;
        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }
    }
}