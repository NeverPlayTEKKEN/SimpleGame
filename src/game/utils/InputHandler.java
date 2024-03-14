package game.utils;
import java.util.Scanner;

//標準入力を扱うクラス
public class InputHandler {
	
	public Scanner scanner;
	
	public InputHandler() {
		this.scanner = new Scanner(System.in);
	}
	
	public String readLine() {
		return scanner.nextLine();
	}
	
	public void close() {
		scanner.close();
	}
}
