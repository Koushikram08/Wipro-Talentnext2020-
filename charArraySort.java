import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.stream.Collectors; 
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine().toLowerCase();
        String str2 = s.nextLine().toLowerCase();
        List<Character> arr1 = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            {
            char st=str1.charAt(i);
            arr1.add(st);
            }
        for (int i = 0; i < 5; i++)
            {
            char st=str2.charAt(i);
            arr1.add(st);
            }
        List<Character> arr2 =arr1.stream().distinct().collect(Collectors.toList());
        Collections.sort(arr2);
        for(int j=0;j<arr2.size();j++){
            System.out.print(arr2.get(j));
        } 
    }
}