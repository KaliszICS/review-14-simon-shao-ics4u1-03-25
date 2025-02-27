public class PracticeProblem {
	public static void main(String args[]) {
		System.out.println(minString("Zoo", "bear", "cat"));
	}

public static int calculate(int num1, int num2, char operator){
int result = 0;
	switch (operator) {
	case '+':
		result= num1+num2;
		break;
	case '-':
		result = num1-num2;
		break;
	case '*':
		result = num1*num2;
		break;
	case '/':
		result = num1/num2;
		break;
	case '%':
		result = num1%num2;
		break;
	case '^':
	double number1 = num1;
	double number2 = num2;
	double resultD = Math.pow(number1,number2);
	result = (int)resultD;
		break;
}
return result;
}
final static int MAXIMUM = 10;
public static boolean totalWordsChecker(String word){
	boolean result = true;
	boolean atWord = false;
	int wordCount= 0;
	for (int i=0; i<word.length(); i++){
		if ((word.charAt(i)>=65&&word.charAt(i)<=90)||(word.charAt(i)>=95&&word.charAt(i)<=122)){
			if (!atWord){
wordCount+=1;
			}
			atWord = true;
		}
		else if(word.charAt(i)==39&&atWord){
			if (!atWord){
				wordCount+=1;
							}
					atWord = true;
		}
		else{
			atWord = false;
		}

	}
if (wordCount>MAXIMUM){
	result=false;
}


return result;

}


public static String minString(String word1, String word2, String word3){
	word1 = word1.toLowerCase();
	word2 = word2.toLowerCase();
	word3 = word3.toLowerCase();
	if (word1.compareTo(word2)<0){
		if (word1.compareTo(word3)<0){
			return word1;
		}
		else{
			return word3;
		}
	}
	else{
		if (word2.compareTo(word3)<0){
			return word2;
		}
		else{
			return word3;
	}


}

}}
