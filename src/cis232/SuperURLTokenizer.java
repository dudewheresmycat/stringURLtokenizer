package cis232;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SuperURLTokenizer {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//https://www.google.com/?key1=value1&key2=value2
		System.out.println("enter a url to tokenize");
		ArrayList<String> values = new ArrayList<>();
		String input = keyboard.nextLine();
		keyboard.close();
		StringTokenizer st = new StringTokenizer(input, "?&=");
		st.nextToken();
		int tokeNum = st.countTokens();
		
		if(tokeNum == 1){
			System.out.println("Query not found.");
		}else{
			System.out.println("Query is found!");
			
			for(int i = 0 ; i < tokeNum; i ++){
			System.out.println(st.nextToken());
			}
		}
		
		
	}
	
}
