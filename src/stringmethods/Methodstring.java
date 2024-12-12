package stringmethods;

public class Methodstring {

	public static void main(String[] args) {
		// String class
		//concate
		String s="hello";
		String s1="hello world";
		System.out.println(s.concat(s1));//hellohelloworld
		System.out.println(s+s1);//hellohelloworld
		System.out.println(2.5+s1+8+9);//7helloworld89

		//equals
		System.out.println(s.equals(s1));//false
		String s2="Hello";
		System.out.println(s.equalsIgnoreCase(s2));//true
		System.out.println(s.equals(s2));//false
		
		//toupper and tolower
		System.out.println(s.toUpperCase());//HELLO
		System.out.println(s1.toUpperCase());//HELLO WORLD
		System.out.println(s1.toLowerCase());//hello world
		
		//length
		System.out.println(s1.length());//11
		
		//startwith and endswith
		System.out.println(s1.startsWith("july"));//false
		System.out.println(s1.endsWith("world"));//true
		
		//contain
		System.out.println(s1.contains("world"));//true
		//trim--removes whitespace from both ends of the string
		String s3="    hello     ";
		System.out.println(s3);//"   hello   "
		System.out.println(s3.trim());//hello
		
		//replace--replace occurances of a specified character?string
		System.out.println(s2.replace('H','e'));//eelo
		System.out.println(s2.replace("eelo", "Hello"));//Hello
		//substring
		String s4 ="god is great";
		System.out.println(s4.substring(4));//is great
		System.out.println(s4.substring(7,12));//great
		//split
		String s5="hello Luminar technolab";//big string i split it can be stored in array
		String[] st=s5.split(" ");
		for (String e:st)//for each is used
		{
			System.out.println(e);
			
		}
		//to chararray
		String s6="HELLO";
		char[]c=s6.toCharArray();
		for(char ele:c)//for each used
		{
			System.out.println(ele);
		}
	
	//charAt(0)==it is used injava to retrieve the character at a specific index from a string
		String s7="HELLOWORLD";
		char kan=s7.charAt(0);
		System.out.println(kan);//output H
		char kn=s7.charAt(1);
		System.out.println(kn);//outout E
	}

}
