import java.io.*;
import java.lang.*;

public class SearchInSortedMatrix{
	public static void main(String[] args) {
		int mat[][] = { {10, 20, 30, 40},
                           {15, 25, 35, 45},
                           {27, 29, 37, 48},
                           {32, 33, 39, 50} };
            
           search(mat, 4, 28);
	}
	public static void search(int[][] mat,int n,int x){
		int i=n-1;int j=0;
		while(i>=0 && j<n){
			int e=mat[i][j];
			if(e==x) {
				System.out.println("FOund the number in i and j"+i+" "+j);
				return ;
			}
			else if(e<x){
				j++;
			}
			else {
				i--;
			}

		}
		System.out.println("Not found");
		return ;
	}

}