package oops;
//
//class A{
//	static void show() {
//		System.out.println("Show in A");
//	}
//};
//class B Extends A{
//	static void
//}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5};
		int d[]= a;
		int sum = 0;
		for (int j = 0; j<3; ++j)
			sum += (a[j] * d[j+1] + (a[j+1] * d[j]) );
		System.out.println(sum);
		
		int arr[] = new int[5];
		System.out.println(arr);
	}

}
