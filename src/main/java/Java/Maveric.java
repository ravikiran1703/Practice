package Java;

import java.util.Scanner;

public class Maveric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i =  0; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

	}

}
