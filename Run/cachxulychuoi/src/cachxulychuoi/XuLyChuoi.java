package cachxulychuoi;

public class XuLyChuoi {
public static void main(String[] args) {
	String s1 = "HeLLo ";
	String s2 = " Xin chao ";
	
	//concat(s1+s2): noi s2 vao  tren s1
	System.out.println(s1.concat(s2));
	// replace: thay the chuoi s2 vao s1
	System.out.println(s1.replaceAll(s1, s2));
	//toLowerCase: chuyen ve chu thuong
	System.out.println(s1.toUpperCase());
	//toUpperCase: chuyen ve chu hoa
	System.out.println(s1.toLowerCase());
	//trim(): xoa space o dau va cuoi chuoi	
	System.out.println(s2.trim());
	//subString: cat chuoi con
	System.out.println(s1.substring(2));
	
	
}
}
