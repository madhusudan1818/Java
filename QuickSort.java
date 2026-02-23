//implementation of quick sort in java
class QuickSort {
	static int [] a;
	static int partition(int low,int high) {
		int pivot[]= a[low];
		int i= low+1;
		int j= high;
		while(true){
			while(i<=high && a[i]<=pivot){
				i++;
			while(a[j]>pivot)
				j--;
			if(i<j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}else {
					break;
				}
		}
		a[low]=a[j];
		a[j]=pivot;
		return j;
	}
	static void quickSort(int low, int high){
		if(low<high){
			int j =partition(low,high);
			quickSort(low,j-1);
			quickSort(j+1,high);
		}
	}
	public static void main(String args[]){
		a = new int[] {1,9,4,2,7,6};
		System.out.println("Before sorting:");
		for(int x:a)
			System.out.print(x+" ");
		quickSort(0,a.length-1);
		System.out.println("After sorting:");
		for(int x:a)
			System.out.print(x+" ");
	}
}
