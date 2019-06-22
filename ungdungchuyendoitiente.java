package ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class ungdungchuyendoitiente {

	public static void main(String[] args) {
		double vnd = 23000;
		double usd;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so usd");
		usd = scanner.nextDouble();
		double quydoi = usd * vnd;
		System.out.println("so tien quy doi la: "+quydoi);

	}

}
