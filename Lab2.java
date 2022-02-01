
public class Lab2 {
	public static void printReverse(int[] arrOne){
        //takes in arrName and prints the values in reverse order.
		
		for(int i=0; i<arrOne.length/2; i++) {
			int temp=arrOne[i];
			arrOne[i]=arrOne[arrOne.length-1-i];
			arrOne[arrOne.length-1-i]=temp;
			
		}
		for(int a=0; a<arrOne.length; a++) {
			System.out.print(arrOne[a]);
			if(a<arrOne.length-1) {
				System.out.print(", ");
			}
		}
         
    }
     public static int getLargest(int[] arrTwo){
        //returns the largest value in an array
        int largestVal=arrTwo[0];
        for(int i=1; i<arrTwo.length; i++){
            if(arrTwo[i]>largestVal){
                largestVal=arrTwo[i];
            }
        }
        return largestVal;
    }
        
    //computeTwice method takes in arrTester reversed and should return the reversed array with the numbers also doubled
    
    
    public static int[] computeTwice(int[] arrThree){
        //apply the arrReverse to arrThree
    	int[] arrFour=new int[arrThree.length];
    	for(int i=0; i<arrThree.length; i++) {
    		arrFour[i]=arrThree[i]*2;
    	}
    	return arrFour;
    } 
}
