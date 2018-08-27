import java.util.*;
import java.util.Scanner;
public class Solution2 {

	
	public static int TestCase;
	public static int N;
	public static int L;
	public static int M;
	public static int[][]Edge = new int[101][2];
	
	public static int CheckNumber(int CellNumber) {
		
	    //find value in Cell Y
	    int CellNumber2 = CellNumber/2;
	    int valueY =0;
		if(CellNumber2>0)
		{
		 valueY = Edge[CellNumber2-1][0];
		}
		else
		{
	      valueY = Edge[CellNumber2][0];
		}
		for(int i =0; i< M; i ++)
		{
			if(Edge[i][1]== valueY)
				return i;
		}
		return CellNumber;
	}
	
	//Find whether Cell X exist in Cell Y
	public static boolean CheckXinY(int CellNumber)
	{
		int ValueX = Edge[CellNumber][0];
		for(int i=0; i < M; i++)
		{
			if(Edge[i][1]== ValueX)
				return true;
		}
		return false;
	}
	public static void main(String [] arg) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter number of Test Case:");
		 TestCase = scanner.nextInt();
		 int []answers = new int[TestCase];
		 
		 for(int j = 1; j <=TestCase; j++)
		 {
			 Boolean Valid = false;
			 answers[j-1] = 0;
		 System.out.println("Enter Number of Largest Number");
		 N = scanner.nextInt();
		System.out.println("Enter Number of row");
		M = scanner.nextInt();
		System.out.println("Enter Last cell that Edit");
		L = scanner.nextInt();
		System.out.println("Enter Value for Cell X and Cell Y");
		for(int i =0; i<M;i++) {
			Edge[i][0] = scanner.nextInt();
			Edge[i][1] = scanner.nextInt();
		}
			int count=0;
			int Cellnumber = L;
			while(!Valid && count < M*2)
			{
				 Cellnumber = CheckNumber(Cellnumber);
				 if(CheckXinY(Cellnumber) && Edge[Cellnumber][0] == L)
				 {
					 answers[j-1] = 1;
				 }
				 count ++;
			}
			
		}
		 scanner.close();
		 for(int j = 1; j <=TestCase; j++)
		 {
	     	 System.out.println("#" + TestCase + " " +answers[TestCase-1]);
		 }
	}	
	

}
