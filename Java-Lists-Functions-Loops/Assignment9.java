import java.util.Iterator;
import java.util.Scanner;

public class Assignment9 {

	static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(" ---------Question 1---------------");
		String s1 = "hello my name is  aviram";
		System.out.println(s1);
		String[] array = reverseStringArr(s1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print("\n ---------Question 2---------------");

		String s2 = "Good game boys";

		System.out.println("\n" + s2);

		System.out.println(getFirstLetters(s2));

		System.out.println("\n ---------Question 3---------------");
		String s3 = "Hi! This is a lovely day. Please join me for breakfast.";
		System.out.println("\n" + s3);
		int[] arr = ArrCountOfSentences(s3);
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");

		}
		System.out.println("\n ---------Question 4---------------");

		String s4 = "Rivka AVI MOTi VERed";
		CountWords(s4);
		System.out.println(s4 + "\n" + "count of word: " + CountWords(s4));
	}

	// -------------Question 4 ------------||
	// -------------function 1 ------------||

	public static int CountWords(String s4) {
		int counter = 0;
		String str[] = s4.split(" ");
		for (int i = 0; i < str.length; i++) {
			checkLetters(str[i]);
			if (checkLetters(str[i]))
				counter++;
		}

		return counter;

	}
	// -------------function 2 ------------||

	public static boolean checkLetters(String str) {
		int bigLetter = 0;
		int smallLetter = 0;
		int bigWord = 0;
		int smallWord = 0;
		char temp ;

		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);

			if (temp >= 65 && temp <= 90)
				bigLetter++;
			else if (temp >= 97 && temp <= 122)
				smallLetter++;

			if (temp == ' ') {

				if (bigLetter > smallLetter)
					bigWord++;
				else
					smallWord++;
				bigLetter = 0;
				smallLetter = 0;

			}
		}
		if (bigLetter > smallLetter)

			return true;
		else
			return false;

	}

	// -------------Question 3 ------------||
	// -------------function 1 ------------||
	public static int[] ArrCountOfSentences(String arrOfsent) {
		int sentCounter = 0;

		int wordCounter = -1;
		char temp;
		int arrayIdex = 0;
		for (int i = 0; i < arrOfsent.length(); i++) {
			temp = arrOfsent.charAt(i);

			if (temp == '!' || temp == '.')
				sentCounter++;
		}
		int[] array = new int[sentCounter];
		for (int i = 0; i < arrOfsent.length(); i++) {

			temp = arrOfsent.charAt(i);
			wordCounter++;
			if (arrOfsent.charAt(i) == 33 || arrOfsent.charAt(i) == 46) {
				array[arrayIdex] = wordCounter;
				arrayIdex++;
				wordCounter = -2;
				
			}
		}
		return array;
	}
	// -------------Question 2 ------------||
	// -------------function 1 ------------||

	public static String getFirstLetters(String firstLetters) {
		String theLetSend = "";
		char temp;
		boolean charExsit = false;
		theLetSend += firstLetters.charAt(0);
		for (int i = 0; i < firstLetters.length(); i++) {
			temp = firstLetters.charAt(i);
			charExsit = false;
			if (temp == ' ') {
				for (int j = 0; j < theLetSend.length(); j++) {
					if (firstLetters.charAt(i + 1) == theLetSend.charAt(j)
							|| firstLetters.charAt(i + 1) == (theLetSend.charAt(j)) + 32
							|| firstLetters.charAt(i + 1) == (theLetSend.charAt(j)) - 32)
						charExsit = true;

				}

				if (!charExsit) {
					theLetSend += firstLetters.charAt(i + 1);

				}
			}
		}

		return theLetSend;

	}

	// -------------Question 1 ------------
	// -------------function 1 ------------
	public static String[] reverseStringArr(String toRevers) {
		int wordsCount = 1;// one + spaces, we have one more word the space
		int arrayIndex = 0;
		for (int i = 0; i < toRevers.length(); i++) {
			if (toRevers.charAt(i) == ' ')
				wordsCount++;

		}
		String[] upside = new String[wordsCount];
		char temp;
		for (int i = 0; i < toRevers.length(); i++) {

			String wordRev = new String("");
			temp = toRevers.charAt(i);
			if (temp == ' ' || i == toRevers.length() - 1) {

				for (int j = i; j >= 0; j--) {
					if (toRevers.charAt(j) == ' ' && j != i)
						j = -1;

					else
						wordRev += toRevers.charAt(j);

				}
				if (arrayIndex < wordsCount)
					upside[arrayIndex] = new String(wordRev);

				arrayIndex++;
			}
		}
		return upside;
	}
}
