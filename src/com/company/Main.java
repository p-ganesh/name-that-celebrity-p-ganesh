package com.company;

public class Main {

    public static void main(String[] args) {
	String s1 = "Allan Alda";
	String s2 = "John Wayne";
	String s3 = "Gregory Peck";

	int l1 = s1.length();
	int l2 = s2.length();
	int l3 = s3.length();

	int i1 = l1 - 3;
	int i2 = l2 - 3;
	int i3 = l3 - 3;

	String allanOut = s1.substring(2, i1);
	String johnOut = s2.substring(2, i2);
	String gregOut = s3.substring(2, i3);

	System.out.println(s1 + ">>>" + allanOut);
	System.out.println(s2 + ">>>" + johnOut);
	System.out.println(s3 + ">>>" + gregOut);
    }
}
