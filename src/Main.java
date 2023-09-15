/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

Example 1:

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
 */
import java.util.Scanner;
public class Main {
    static void Value_Equal_To_Index(int[] array){
        for (int start = 0; start < array.length; start++){
            int val = array[start];
            int index = ++start;
            if (val == index){
                System.out.println(index);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        Value_Equal_To_Index(array);
    }
}