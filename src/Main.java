public class Main {

    public static void main(String[] args) {
		IntegerSet set = new IntegerSet(5);

		for (int i = 0; i < 10; i++) {
			set.add(i);
		}

		set.addAll(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19});

		set.remove(15);

		System.out.println(set);


		int[] arr = {1,2,3,4,5,6,7,8,9,10};


		System.out.println(binarySearch(arr, 11));
		System.out.println(linearSearch(arr, 10));
	}

	public static boolean binarySearch(int[] arr, int x){

    	int low =0;
    	int high = arr.length - 1;

    	while(high >= low){
			int m = (low + high)/2;

			if (arr[m] == x) {
				return true;
			}

			if(arr[m] > x){
				high = m -1;
			}

			if(arr[m] < x){
				low = m +1;
			}
		}
		return false;
	}

	public static boolean linearSearch(int[] arr, int x){
		for(int i = 0;  i < arr.length;  i++){
			if(arr[i] == x){
				return true;
			}
		}
		return false;
	}
}
