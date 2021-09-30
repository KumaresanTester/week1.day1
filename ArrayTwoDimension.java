package array.packages;

public class ArrayTwoDimension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] name= {{"Kumar","Raj","Vijay","Ram"},{"Sam","Prem","Suresh","Raghu"},
						  {"Balaji","Rajini","Roshan","Ganesh"}};
		
		for (int row = 0; row < name.length; row++) {
			for (int column = 0; column < name[row].length; column++) {
				
				System.out.print(name[row][column]+" ");
			}
			
			System.out.println();
		}
		
	}

}
