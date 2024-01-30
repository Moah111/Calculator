package CasioFx570;

import java.util.Scanner;

public class Casio {
		
	public static int tinhHieu(int n1, int n2){
		int hieu = n1 - n2;
		if(n1<n2)
			hieu = n2 - n1;
		System.out.println("Hieu = " + hieu);
		return hieu;
	}
	
	public static int tinhTong(int n1, int n2 ){
		int tong = n1 + n2;
		System.out.println("tong = " + tong);
		
		return tong;
	}
	
	public int tinhTich(int n1, int n2){
		int tich = n1*n2;
		System.out.println("Tich = " + tich);
		return tich;
	}
	
	public static float phepChia(int n1 , int n2){
		float chia = (float)n1/n2;
		System.out.println("Chia = " + chia);
		return chia;
	}
	
	public static int tinhLT(int n, int  lt){
		int luythua = 1;
		for (int i = 0; i < lt; i++) {
			luythua = luythua*n;
		}
		System.out.println("Luy Thua = " + luythua);
		return luythua;
	}
	
	public static void main(String[] args){
		tinhHieu(15 , 20);
		tinhTong( 9 , 10);
		phepChia(1, 2);
		tinhLT(3 , 3);
	}

}
