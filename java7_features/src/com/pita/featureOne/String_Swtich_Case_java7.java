package com.pita.featureOne;

public class String_Swtich_Case_java7 {

	public static void main(String[] args) {
		String test="pita";
		//Before java 7 in switch conditional statement only allowed integer and charchar value but in java1.7 switch statement allowed "String"
		switch (test) {
		case "pita":
			System.out.println("Ara baba pitambar is here");
			break;
		case "damo":
			System.out.println("Are baba Damodar is here");
			break;

		default:
			System.out.println("Nothing is here re baba");
			break;
		}
		

	}

}
