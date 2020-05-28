import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        String bins=Integer.toBinaryString(num);
        int bin=Integer.parseInt(bins);
        System.out.println(bin);
        int count=0;
        while(bin>0)
        {   
            int e=bin%10; 
            bin/=10;
            if(e==0){
                count+=1;
            }
        }
        System.out.println(count);
        
    }
}









