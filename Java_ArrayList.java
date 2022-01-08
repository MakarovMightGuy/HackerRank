import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainActivity {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int noOfLines = sc.nextInt();
	int noOfIntegers;

	List<ArrayList<Integer>> mainList = new ArrayList<>();
	ArrayList<Integer> subList;
		
	for (int i = 0; i < noOfLines; i++) {
		noOfIntegers = sc.nextInt();
		subList = new ArrayList<>();
			
		for (int j = 0; j < noOfIntegers; j++) {
			subList.add(j, sc.nextInt());
		}
			
		mainList.add(i, subList);
		}
		
		System.out.println(mainList);
		
		int noOfQueries = sc.nextInt();
		
		for (int i = 0; i < noOfQueries; i++) {
		try {
			int y = sc.nextInt();
			int x = sc.nextInt();
				
			System.out.println(mainList.get(y - 1).get(x - 1));
		} catch (Exception e) {
			System.out.println("ERROR!");
		}
	}
    }    
}    