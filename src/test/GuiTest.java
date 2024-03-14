package test;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiTest {
	public static void test() {
		JFrame frame = new JFrame("Simple Swing Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 750);
		
		// ラベルを作成
        JLabel label = new JLabel("Hello, Swing!");
        frame.add(label, BorderLayout.CENTER);

        // ボタンを作成
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });
        frame.add(button, BorderLayout.SOUTH);
        
		frame.setVisible(true);
	}
}
