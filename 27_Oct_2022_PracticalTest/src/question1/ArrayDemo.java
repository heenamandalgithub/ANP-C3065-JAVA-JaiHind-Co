package question1;

public class ArrayDemo {
	
	int[] manipulateIntegerArray(int arr[]) {
		int newArr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]+=5;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,22,34,40,55};
ArrayDemo arrayDemoObj=new ArrayDemo();
int newArr[]=arrayDemoObj.manipulateIntegerArray(arr);
for(int i=0;i<newArr.length;i++) {
	System.out.println(newArr[i]);
	
}
	}

}