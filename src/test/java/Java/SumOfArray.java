package Java;

public class SumOfArray {

	public static void main(String[] args) {
	int[] sumArr = new int[] {25,26,9,18,3,12};
	int sum = 0;
	for (int i = 0; i < sumArr.length; i++) {
		sum = sum + sumArr[i];
	}
System.out.println("sum of array= " +sum);
	}

}
