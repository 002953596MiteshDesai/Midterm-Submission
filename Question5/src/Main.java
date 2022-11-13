import java.util.ArrayList;
import java.util.Arrays;
//Complexity is O(n2)

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
	}
	
	// arr = [0,0,0,0,0,1,1,1,1,2,2,5,5,5,8,9,10,11]
	// values = [1,4,5,10]
	// output = [5, -1, 12, 17]
	private static int[] getStartOfEachValues(int[] arr, int[] values) {
		int[] indexes = new int[values.length];
		int start = findFirstIndex(arr , values);
		int end = findLastIndex(arr , values)
		Arrays.fill(indexes,start);
		Arrays.fill(indexes, end );
		
		
		return indexes;
	}
	
	public static int findFirstIndex(int[] arr, int x){
		return  findFirstIndex(arr, x, 0, arr.length -1);
	}
	private static int findFirstIndex(int[] arr, int x, int low, int high){
		if( low > high){
			return -1;
		}
		if(arr[high] < x){
			return -1;
		}
		if(arr[low] > x){
			return -1;
		}
		if(arr[low] ==x && arr[high] == x){
			return low;
		}
		int mid = (high + low)/2;
		
		if(arr[mid] < x){
			return findFirstIndex(arr, x, mid +1, high);
		}
		else if(arr[mid] > x){
			return findFirstIndex(arr, x, low, mid -1);
		}else{
			return findFirstIndex(arr, x, low, mid -1);
		}
	}
	
	
	public static int findLastIndex(int[] arr, int x){
		return  findLastIndex(arr, x, 0, arr.length -1);
	}
	private static int findLastIndex(int[] arr, int x, int low, int high){
		if( low > high){
			return -1;
		}
		if(arr[high] < x){
			return -1;
		}
		if(arr[low] > x){
			return -1;
		}
		if(arr[low] ==x && arr[high] == x){
			return high;
		}
		int mid = (high + low)/2;
		
		if(arr[mid] < x){
			return findLastIndex(arr, x, mid +1, high);
		}
		else if(arr[mid] > x){
			return findLastIndex(arr, x, low, mid -1);
		}else{
			return findLastIndex(arr, x, mid, high -1);
		}
	}
	
}



