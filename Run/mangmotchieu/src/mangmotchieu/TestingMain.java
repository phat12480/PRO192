package mangmotchieu;

import java.util.Arrays;

public class TestingMain {
public static void main(String[] args) {
	int mang[] = {1,2,3};
	int mang1[];

	mang1=mang.clone();
	mang1[0]=50;
	System.out.println("Mang la "+ Arrays.toString(mang));
	System.out.println("Mang1 la "+ Arrays.toString(mang1));	
}
}
