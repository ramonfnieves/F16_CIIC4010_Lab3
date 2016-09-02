import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {

	
		JFrame myFrame = new JFrame("Hello, world!");

		MyPanelClass myPanel = new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
		
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setTitle("Ramon Nieves");
		myFrame.setLocation(800, 400);
		myFrame.setSize(210, 150);
		myFrame.setVisible(true);
	}
}