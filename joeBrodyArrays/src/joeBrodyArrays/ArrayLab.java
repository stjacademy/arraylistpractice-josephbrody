package joeBrodyArrays;

import java.util.Scanner;
import java.util.Random;

public class ArrayLab {

	public static void main(String[] args) {
		// problemOne();
		// problemThree();
		// problemFive();
		//problemSeven();
		problemEight();
	}

	public static void problemOne() {
		Scanner scan = new Scanner(System.in);
		String[] userInput = new String[5];
		System.out.println("Enter Inputs:");
		for (int i = 0; i < 5; i++)
			userInput[i] = scan.nextLine().toUpperCase();
		String s = "";
		for (int j = 0; j < 5; j++)
			s = s + userInput[j] + " ";
		System.out.println(s);
		scan.close();
	}

	public static void problemThree() {
		String[] inputs = new String[] { "school teacher", "high school", "school-age", "schooled", "preschool" };
		String s;
		for (int i = 0; i < inputs.length; i++) {
			s = "";
			for (int j = 0; j < inputs[i].length() - 5; j++) {
				if (inputs[i].substring(j, j + 6).equals("school")) {
					s = inputs[i].substring(0, j) + inputs[i].substring(j + 6);
					break;
				}
			}
			System.out.println(s);
		}
	}

	public static void problemFive() {
		Random rand = new Random();
		int[] randInts = new int[5];
		for (int i = 0; i < randInts.length; i++) {
			randInts[i] = rand.nextInt(100) + 1;
			System.out.println("Number: " + randInts[i] + "  Squared: " + randInts[i] * randInts[i]);
		}
	}

	public static void problemSeven() {
		String[] inviteList = { "joe", "liz", "alex", "sarah", "bob", "zach", "samantha", "edward" };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name:  ");
		String userInput = sc.nextLine().toLowerCase();
		sc.close();
		int invited = 0;
		for (int i = 0; i < inviteList.length; i++) {
			if (userInput.equals(inviteList[i]))
				invited = 1;
		}
		if (invited == 1)
			System.out.println("INVITED");
		else
			System.out.println("NOT INVITED");
	}

	public static void problemEight() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence below: ");
		String userInput = s.nextLine().toLowerCase();
		s.close();
		//char[] alphabet = {'a', "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p","q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int[] frequency = new int[26];
		for(int i = 0; i < userInput.length(); i++) {
			for(int j = 0; j<26; j++) {
				if(userInput.charAt(i) == )
			}
		}
	}
	
}
