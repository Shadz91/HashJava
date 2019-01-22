package demo;

public class SplitString {

	public static void main(String[] args) {

		String st = "Hello World Yes Go Bye";
		System.out.println(st);

		String[] arr = st.split(" ");

		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(arr[i]);
			sb = sb.reverse();
			System.out.print(sb + " ");
		}

	}

}