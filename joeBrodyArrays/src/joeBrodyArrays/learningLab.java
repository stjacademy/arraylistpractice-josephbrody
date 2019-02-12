package joeBrodyArrays;
import java.util.ArrayList;

public class learningLab {

	public static void main(String[] args) {
		ArrayList<String> band = new ArrayList<String>();
		
		/* Problems 1-3
		band.add("Lindsey");
		band.add("Mick");
		band.add("Stevie");
		band.add("Dave");
		band.add("Christine");
		band.add(band.remove(2));
		band.set(0,  band.get(4));
		System.out.println(band);
		*/
		
		/* Problem 4
		band.add("Paul");
		band.add("Ringo");
		band.add("John");
		band.add("George");
		String removed = band.remove(band.size() - 1);
		System.out.println(removed);
		System.out.println(band);
		*/
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		nums.add(10);
		nums.add(12);
		for(int i = nums.size() - 1; i >= 0; i--)
			System.out.println(nums.get(i) + " ");
		for(int j = 0; j < nums.size(); j++)
			nums.remove(j);
		System.out.println(nums);
		
	}

}
