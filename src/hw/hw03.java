package hw;
import java.util.Scanner;

/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021026 詹佩郡
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		String str=" ";
		int x=0;
		while(a!=0){
			str=a%2+str;
			a=a/2;
			}
		if(a==0){
			for(int i=0;i<str.length();i++){
				int intValue = Integer.parseInt("str");
				if(intValue%10==1){
				x++;
				}
				intValue=intValue/10;
			}System.out.print(x);
		}
	}

}
