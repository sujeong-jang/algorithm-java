package search;

public class BinarySearch {
	public static int binary_search(int n, int[] a) {
		int mid;
		int low = 0;
		int high = a.length-1;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == n) 
				return mid;
			else if (a[mid] > n)
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return -1;
	}
	
	public static int binary_search_recur(int n, int[] a, int low, int high) {
		if (low > high)
			return -1;
		
		int mid = (low + high) / 2;
		if (a[mid] == n)
			return mid;
		else if (a[mid] > n)
			return binary_search_recur(n, a, low, mid-1);
		else
			return binary_search_recur(n, a, mid+1, high);
	}
	
	public static void main(String[] args) {
		int[] a = {1, 4, 19, 53, 65};
		int n = binary_search(4, a);
		
		System.out.println(n);
	}

}
