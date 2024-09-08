package vidu;

import java.util.Arrays;
import java.util.Collection;
public class MainTesting {
	public static int[] reverse (int[] x) {
		int[] rs = new int[x.length];
		int index=0;
		for (int i=x.length -1; i>=0;i--) {
			rs[index]=x[i];
			index++;
		}
		return rs;
	}
	
	
	
public static void main(String[] args) {
	int a[]=new int[] {1,8,2,6,4,3,7,9};
	int b[]=new int[15] ;
	//Arrays.toString: xuat mang
	System.out.println("a ban dau "+ Arrays.toString(a));
	//Arrays.sort: ham sap xep
	Arrays.sort(a);
	System.out.println("a sap xep "+ Arrays.toString(a));
	//Arrays.binarySearch: ham tim kiem
	System.out.println(Arrays.binarySearch(a, 4));
	System.out.println(Arrays.binarySearch(a, -1));
	//Arrays.fill: ham dien gia tri
	Arrays.fill(b, 5);
	System.out.println("b khi dien: "+Arrays.toString(b));
	a=MainTesting.reverse(a);
	System.out.println("a giam dan: "+Arrays.toString(a));
	
}
}
