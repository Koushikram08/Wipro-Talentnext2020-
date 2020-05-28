import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner s= new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        boolean array1[][]=new boolean[row][col]; 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array1[i][j]= s.nextBoolean();
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array1[i][j])
                System.out.print('t');
                else
                System.out.print('f');
                System.out.print(' ');
            }
            System.out.print("\n");
        }
    }
}