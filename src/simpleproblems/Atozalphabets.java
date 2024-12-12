package simpleproblems;
public class Atozalphabets{
public static void main(String[] args) {
	//A too Z
	char letter ='a';//initialize the character variable
	//loop through the alphabets a to z
	for (int i=0;
			i<26;i++) {
		System.out.print(letter+" ");//print the current letter
		letter++;//move to the next letter
	}
}	
}