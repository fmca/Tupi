import tupi.example.Stack;

public class Main {
	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.POP();
		stack.PUSH("a");
		stack.POP();
		stack.PUSH("b");
		stack.PUSH("c");
		stack.POP();

		for (Object s : stack.list) {
			System.out.print(s.toString());
		}
	}
}
