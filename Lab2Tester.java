
import java.util.*;
public class Lab2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arrName=new int[10];
			for(int i=0; i<10; i++) {
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			System.out.println("Enter a number:");

			int num = myObj.nextInt();
			arrName[i]=num;
			}
			    Lab2.printReverse(arrName);
			    System.out.println(Lab2.getLargest(arrName));
			    
			    arrName=Lab2.computeTwice(arrName);
			    for(int i=0; i<arrName.length; i++) {
			    	System.out.print(arrName[i]+ ", ");
			    }

}
}
