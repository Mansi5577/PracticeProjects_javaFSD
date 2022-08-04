package CoreJavaProjects;

import java.util.*;
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int count[]=new int[arr.length];
		int omax=0;
		for(int i=0;i<arr.length;i++){
			int max=0;
			for(int j=0;j<i;j++){
				if(arr[j]<arr[i]){
					if(count[j]>max){
						max=count[j];
					}
				}
				
			}
			count[i]=max+1;
			if(count[i]>omax){
				omax=count[i];
			}
		}
		System.out.println("Count of longest subsequent array: "+omax);
	}

}
