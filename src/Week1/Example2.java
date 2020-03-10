package Week1;
import javax.swing.JOptionPane;

public class Example2 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "This is message dialog", "Title", JOptionPane.INFORMATION_MESSAGE);
		// JOptionPane.showMessageDialog(parentComponent, message, title, icon);
		// icon = JOptionPane.ERROR_MESSAGE || JOptionPane.INFORMATION_MESSAGE || JOptionPane.WARNING_MESSAGE || JOptionPane.QUESTION_MESSAGE || JOptionPane.PLAIN_MESSAGE
		JOptionPane.showConfirmDialog(null,"message", "title", JOptionPane.YES_NO_OPTION);
		// JOptionPane.showConfirmDialog(parentComponent, message, title, buttonOption);
		// buttonOption = DEFAULT_OPTION || YES_NO_OPTION || YES_NO_OPTION || OK_CANCEL_OPTION
		// return OK_CANCEL_OPTION || NO_OPTION || CANCEL_OPTION || OK_OPTION || CLOSED_OPTION
		Object[] options = { "OK", "CANCEL", "DONE" };
		Object selectedValue = JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		System.out.println(selectedValue); // if press OK => 0 CANCEL => 1...
		System.exit(0);
	}
}
