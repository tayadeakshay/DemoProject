
public class StarPattern {

	public static void main(String[] args) {
		int noOfRows = 5;
		//Here we take no of rows,as we are starting i from 0, total rows will be noOfRows -1.
		for(int i=0;i<=noOfRows-1;i++)
		{
			//Descending order of symbols should be printed,i is starting from 0 hence j>i and not j>=i.
			for(int j=noOfRows;j>i;j--)
			{
				System.out.print(" ");
			}
			//loop is going to repeat on 5 times hence we need to take here k<=i also if we take k<i then for once k and i will be equal and one star will be less
			for(int k=0;k<=i;k++)
			{
				System.out.print(" *"); // space before * is given to create a tree pattern
			}
			// there should be a space after both for loops executes.
			System.out.println();
		}

	}

}
