package org.logu;

public class LoguClass {
	public static void main(String[] args) {
		String s= ("my name is loganathan");
		System.out.println(s);
           int length = s.length();
           System.out.println(length);
           boolean startsWith = s.startsWith("my");
           System.out.println(startsWith);
           boolean endsWith = s.endsWith("loganathan");
           System.out.println(endsWith);
           String upperCase = s.toUpperCase();
           System.out.println(upperCase);
           String lowerCase = s.toLowerCase();
           System.out.println(lowerCase);
           int indexOf = s.indexOf("o");
           System.out.println(indexOf);
           int lastIndexOf = s.lastIndexOf("t");
           System.out.println(lastIndexOf);
           boolean empty = s.isEmpty();
           System.out.println(empty);
           boolean contains = s.contains("i");
           System.out.println(contains);
           char charAt = s.charAt(5);
           System.out.println(charAt);
           boolean equals = s.equals(s);
           System.out.println(equals);
           boolean equalsIgnoreCase = s.equalsIgnoreCase(s);
           System.out.println(equalsIgnoreCase);
           
           
    	}
}
