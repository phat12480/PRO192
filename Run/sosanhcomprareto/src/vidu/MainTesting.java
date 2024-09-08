package vidu;

public class MainTesting {
public static void main(String[] args) {
	SinhVien sv1 = new SinhVien(100, "Tran A", "lop 1", 9);
	SinhVien sv2 = new SinhVien(102, "Tran B", "lop 2", 8);
	
	System.out.println(sv1.compareTo(sv2));
}
}

