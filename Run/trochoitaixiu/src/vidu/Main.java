package vidu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double tienTaiKhoan = 5000000;
		Scanner sc = new Scanner(System.in);
		Locale lc = new Locale("vi", "VN");
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

		int luaChon = 0;
		do {
			System.out.println("moi ban lua chon");
			System.out.println("chon 1. tiep tuc choi");
			System.out.println("chon so khac de thoat");
			luaChon = sc.nextInt();
			if (luaChon == 1) {
				System.out.println("bat dau choi");
				System.out.println("so tien hien co: " + numf.format(tienTaiKhoan));
				System.out.println("ban muon dat cuoc bao nhieu");
				double datCuoc = 0;
				do {
					System.out.println("dat tien cuoc < so tien co");
					datCuoc = sc.nextDouble();
				} while (datCuoc <= 0 || datCuoc > tienTaiKhoan);
				int luaChonTaiXiu = 0;
				do {
					System.out.println("chon 1 la tai hoac 2 la xiu");
					luaChonTaiXiu = sc.nextInt();
				} while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				int giaTri1 = xucXac1.nextInt(5) + 1;
				int giaTri2 = xucXac2.nextInt(5) + 1;
				int giaTri3 = xucXac3.nextInt(5) + 1;
				int tong = giaTri1 + giaTri2 + giaTri3;
				System.out.println("ket qua la " + giaTri1 + giaTri2 + giaTri3);
				if (tong == 3 || tong == 18) {
					System.out.println("tong la " + tong);
					tienTaiKhoan -= datCuoc;
					System.out.println("so tien con lai la: " + numf.format(tienTaiKhoan));
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("tong la " + tong + "la xiu");
					if (luaChonTaiXiu == 2) {
						tienTaiKhoan += datCuoc;
						System.out.println("so tien con lai la: " + tienTaiKhoan);
					} else {
						tienTaiKhoan -= datCuoc;
						System.out.println("so tien con lai la: " + tienTaiKhoan);
					}

				} else {
					System.out.println("tong la " + tong + "la tai");
					if (luaChonTaiXiu == 1) {
						tienTaiKhoan += datCuoc;
						System.out.println("so tien con lai la: " + tienTaiKhoan);
					} else {
						tienTaiKhoan -= datCuoc;
						System.out.println("so tien con lai la: " + tienTaiKhoan);
					}

				}
			}

		} while (luaChon == 1);

	}
}
