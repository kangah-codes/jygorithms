// author = Joshua Akangah
// postfix evaluator in Java
import java.util.Stack;
import java.util.Scanner;

public class postfix{
	public static void Postfix(String expression){
		int length = expression.length();
		Stack<Integer> stack = new Stack<>(); 

		for (int i=0;i<length;i++){
			Boolean flag = Character.isDigit(expression.charAt(i));
			char curr = expression.charAt(i);
			if (flag){
				stack.add(Character.getNumericValue(curr));
			}else{
				int first = stack.pop();
				int second = stack.pop();
				switch (curr){
					case '+':
						stack.add(first+second);
						break;
					case '-':
						stack.add(second-first);
						break;
					case '*':
						stack.add(first*second);
						break;
					case '/':
						stack.add(second/first);
						break;
				}
			}
		}

		System.out.println(stack.get(0));
	}

	public static void main(String[] args){
		try{
			System.out.print("Enter the expression: ");
			Scanner in = new Scanner(System.in);
			String s = in. nextLine();
			postfix exp = new postfix();
			exp.Postfix(s);
		} catch (Exception e){
			System.out.println("Empty Stack");
		} 
		
	}
}