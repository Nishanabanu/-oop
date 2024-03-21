import java.util.*;
class StrManipulation{
public static void main(String args[])
{
//string using new operator
System.out.println("  USING new OPERATOR ");
System.out.println("------------------------");
System.out.print("\n");
char chs[]={'B','A','N','U'};
String newStr=new String(chs);
System.out.println("New string using new operator: "+ newStr);
//string length
System.out.print("\n");
System.out.println("  STRING LENGTH ");
System.out.println("------------------------");
System.out.print("\n");
String s1="hello";
String s2="world";
System.out.println("String length of "+s1+":"+s1.length());
//to uppercase & lowercase
System.out.print("\n");
System.out.println("  TO UPPER CASE & LOWER CASE");
System.out.println("------------------------");
System.out.print("\n");
System.out.println(s1+" to uppercase: "+ s1.toUpperCase());
System.out.println(s1+" to lowercase: "+ s1.toLowerCase());
//string concatenation
System.out.print("\n");
System.out.println("  STRING CONCATENATION  ");
System.out.println("------------------------");
System.out.print("\n");
System.out.println("Using concat(): "+s1.concat(s2));
System.out.println("Using + operator: "+s1 + s2);
//character extraction
System.out.print("\n");
System.out.println("  CHARACTER EXTRACTION  ");
System.out.println("------------------------");
System.out.print("\n"); 
System.out.println("Character at 2nd position: "+s1.charAt(2));
char c[]=new char[5];
s2.getChars(1,4,c,0);
System.out.println("character between 1 and 4: "+new String(c));
s1="world";
s2="WORLD";
System.out.print("\n");
System.out.println("  CHARACTER COMPARISON ");
System.out.println("------------------------");
System.out.print("\n");
System.out.println(s1+" Equals "+s2+":"+s1.equals(s2));
System.out.println(s1+" Equals ignore case "+s2+":"+s1.equalsIgnoreCase(s2));
System.out.println(s1+" Compare "+s2+":"+s1.compareTo(s2));
System.out.println(s1+" Compare ignore case "+s2+":"+s1.compareToIgnoreCase(s2));
System.out.println(s1+" Start with W : "+":"+s2.startsWith("W"));
System.out.println(s1+" End with d : "+":"+s1.endsWith("d"));
System.out.print("\n");
System.out.println("  SEARCH SUBSTRING ");
System.out.println("------------------------");
System.out.print("\n"); 
s1="You are beautiful";
System.out.println(" Index of are in "+s1+ ":" +s1.indexOf("are"));
System.out.print("\n");
System.out.println("  MODIFY STRING ");
System.out.println("------------------------");
System.out.print("\n"); 
System.out.println(" Substring of "+s1+":"+s1.substring(7));
System.out.println(" String replacing: "+s1.replace("You are","Am i"));
System.out.print("\n");
System.out.println("  Using valueOf()");
System.out.println("------------------------");
System.out.print("\n"); 
float n=26.2f;
System.out.println(n+" is converted to "+String.valueOf(n));
}
}

