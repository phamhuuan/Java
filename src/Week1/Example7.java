package Week1;
import javax.swing.JOptionPane;

public class Example7 {
	public static void main(String[] args) {
		int choose;
        String myChoice;

        choose = JOptionPane.showConfirmDialog(null,
                "Do you want to fly?");

        if (choose == JOptionPane.YES_OPTION)
            myChoice = "Ya";
        else
            myChoice = "Nah";

        JOptionPane.showMessageDialog(null,"You chose " + myChoice);
        choose = JOptionPane.showConfirmDialog(null,
                "Do you want to fly?", "Hey answer my question", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (choose == JOptionPane.YES_OPTION)
            myChoice = "Ya";
        else
            myChoice = "Nah";
        JOptionPane.showMessageDialog(null,"You chose " + myChoice);
        System.exit(0);
    }
}
