package game.utils;

public class OutputHandler {
	public static void colorHandler() {
		// 赤色のテキスト
        System.out.println("\u001B[31m" + "このテキストは赤色です。" + "\u001B[0m");
        // 緑色のテキスト
        System.out.println("\u001B[32m" + "このテキストは緑色です。" + "\u001B[0m");
	}
}
