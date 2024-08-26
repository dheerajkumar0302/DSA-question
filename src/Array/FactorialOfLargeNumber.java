package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FactorialOfLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        ArrayList<Integer> ans = factorial(n);
        for (Integer i : ans)
        {
            System.out.print(i);
        }
    }

    private static ArrayList<Integer> factorial(int n) {

        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        int carry=0;
        for(int i=2 ; i<=n ;i++)
        {
            for(int j = 0 ; j<result.size() ; j++)
            {
                int temp = i*result.get(j) + carry;
                result.set(j,temp%10);
                carry=temp/10;
            }

            while(carry!=0)
            {
                result.add(carry%10);
                carry/=10;
            }
        }
        Collections.reverse(result);
        return result;
    }


}
