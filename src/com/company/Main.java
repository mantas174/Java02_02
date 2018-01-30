package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String zodis;

	    System.out.println("Iveskite zodi: ");
	    zodis = in.nextLine();

	    System.out.println("Zodzio ilgis: " + zodis.length());
    }
}
