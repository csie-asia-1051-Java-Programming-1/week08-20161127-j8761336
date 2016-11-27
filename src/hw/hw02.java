package hw;

import java.util.Scanner;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021026 詹佩郡
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("將值轉換成n進制:(先輸入n再輸入值)");
		int a =scn.nextInt();
		int b =scn.nextInt();
		fun(a,b);
	}
	public static void fun(int x,int y){
		String str =" ";
		while(y!=0){
			str =y%x+str;
			y=y/x;
		}
		if(y==0){
			System.out.print(str);
		}
	}}

