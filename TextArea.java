import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class TextArea extends JFrame{
	private JButton
		b = new JButton("Add Data"),
		c = new JButton("Clear Data");
	private JTextArea t = new JTextArea(15,80);
	public TextArea(){
		b.addActionListener((e) -> {
			for(int i = 1;i <= 9 ;i++){
				for(int j = 1 ; j <= i; j++){
					t.append(j+"*"+i+"="+j*i+"\t");
				}
				t.append("\n");
			}
		});

		c.addActionListener((e) -> { t.setText(""); });

		setLayout(new FlowLayout());
		add(new JScrollPane(t));
		add(b);
		add(c);
	}
	public static void main(String[] args) {
		SwingConsole.run(new TextArea(), 900, 450);
	}
}
