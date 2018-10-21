package hieu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;
public class bt1 {
	Vector list = new Vector();
	private String maSach;
	public bt1() {
		while(true) {
			System.out.println("Quan ly Sach");
			System.out.println("1. Nhap Sach");
			System.out.println("2. Xem Sach");
			int n;
			Scanner key = new Scanner(System.in);
			System.out.println("Moi ban chon chuc nang:");
			n = key.nextInt();
			switch(n) {
				case 1: NhapTT();
					break;
				case 2: InTT();
					break;
			}
		}
	}
	public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong sach=");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ma sach=");
			String maSach=key.nextLine();
			System.out.println("Nhap ten sach");
			String tenSach=key.nextLine();
			System.out.println("Nhap ten tac gia");
			String tacgia=key.nextLine();
			System.out.println("Nhap so luong");
			int sl=Integer.parseInt(key.nextLine());
			System.out.println("Nam xuat ban:  ");
			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			String namXB=key.nextLine();	
			bt2 b = new bt2(maSach,tacgia,sl,namXB);
			list.add(b);
		}	
		
	}
	public void InTT() {
		Enumeration s = list.elements();
		int i=1;
		while(s.hasMoreElements()) {
			bt2 sa=(bt2)s.nextElement();
			System.out.println("Ma Sach: "+sa.maSach);
		}
	}			
public static void main(String[] args) {
	new bt1();
}

}
