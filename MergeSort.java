//implementation of merge sort
class MergeSort {
	static int[]  a;
	static int[]  b;
	static void  merge(int low,int mid,int high){
		int i=low;
		int k= low;
		int j=mid+1;
		while(i<=mid && j<=high){
			if(a[i]<=a[j]){
				b[k++]=a[i++];
			}
			else{
				b[k++]=a[j++];
			}
		}
		while(i<=mid) {
			b[k++]=a[i++];
		}
		while(j<=high){
			b[k++]=a[j++];
		}
		for(i=low;i<=high;i++){
			a[i]=b[i];
		}
		
	}
	static void mergeSort(int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(low,mid);
			mergeSort(mid+1,high);
			merge( low, mid,high);
		}
	}
	public static void main (String args[]){
		a = new int[]{17,9,4,1,38,26};
		b=  new int[a.length];
		System.out.print("before sorting:");
		for(int x:a){
			System.out.print(x+" ");
		}
		mergeSort(0,a.length-1);
		System.out.print("after sorting :");
		for(int x:a){
			System.out.print(x+" ");
		}
	}
}
		
		
			
				
