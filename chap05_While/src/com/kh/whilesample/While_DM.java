package com.kh.whilesample;

import java.util.Scanner;

public class While_DM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean goodplace = true;
		
		while(goodplace) {
			System.out.println("어디 갈거냐고");
			int place = sc.nextInt();
			
			switch(place) {
				case 1 :
					System.out.println("신도림에 가서 고기를 먹자");
					goodplace = false;
					break;
				case 2 :
					System.out.println("화곡에 가서 해산물을 먹자");
					goodplace = false;
					break;
				case 3 :
					System.out.println("동네에서 아무거나 먹자");
					goodplace = false;
					break;
				default :
					System.out.println("자기가 한번 찾아볼래?");
					System.out.println("");
			}
		}
	}

}
