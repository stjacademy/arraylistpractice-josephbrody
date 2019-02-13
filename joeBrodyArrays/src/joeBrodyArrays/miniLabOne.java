package joeBrodyArrays;

import java.util.ArrayList;
import java.util.Scanner;

public class miniLabOne {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> test = new ArrayList<Integer>();
		System.out.println("Length of array:");
		int inputLength = reader.nextInt();
		System.out.println("Enter each input on its own line:");
		for(int i = 0; i < inputLength; i++) {
			test.add(reader.nextInt());
		}
		System.out.println(getCompositeNumbers(test));
		reader.close();
	}

	public static ArrayList<Integer> getListOfFactors(int num) {
		ArrayList<Integer> factored = new ArrayList<Integer>();
		for (int i = 2; i < num; i++) {
			if (num % i == 0 )
				factored.add(i);
		}
		return factored;
	}
	
	public static ArrayList<Integer> getCompositeNumbers(ArrayList<Integer> arrIn){
		ArrayList<Integer> arrOut = new ArrayList<Integer>();
		for(int i = 0; i < arrIn.size(); i++) {
			int currentInt = arrIn.get(i);
			if(getListOfFactors(currentInt).size() > 0) 
				arrOut.add(currentInt);
		}
		return arrOut;
	}
}
