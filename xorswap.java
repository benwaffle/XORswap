
public class xorswap {
	public static void main(String[] args) {
		int x = 1;
		int y = 235567357;
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("xor swap completed");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
