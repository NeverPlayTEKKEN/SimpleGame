package game.utils;

public class OutputHandler {
	
	String text = "";
	char color = 'w';
	
	//テキストファイルの出力を行う
	public void outputText(String text) {
		System.out.println(text);
	}
	
	// 出力の色を変更する
	public static String outputColorText(String text, char color) {
		if(color == 'r') {
			// 赤色のテキスト
			text = "\u001B[31m" + text + "\u001B[0m";
		}else if(color == 'g') {
			// 緑色のテキスト
	        text = "\u001B[32m" + text + "\u001B[0m";
		}
        
		return text;
	}
}