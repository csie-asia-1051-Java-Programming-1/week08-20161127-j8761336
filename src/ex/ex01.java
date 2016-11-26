package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021026 詹佩郡
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("輸入一個值10進制轉成2進制:");
		int a =scn.nextInt();
		fun(a);
	}
	public static void fun(int x){	
		String str=" ";
		while(x!=0){
			str=x%2+str;
			x=x/2;
			}
		if(x==0){
			System.out.print(str);
		}
	}

}
