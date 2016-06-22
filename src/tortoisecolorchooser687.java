
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class tortoisecolorchooser687 {
	// Copyright Wintriss Technical Schools 2013

	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		// String color=
		// 4. use an if/else statement to set the pen color that the user
		// requested

		// 5. if the user doesn’t enter anything, choose a random color

		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10
		for (int i = 0; i < 100; i++) {
			

			String color = JOptionPane.showInputDialog("What color do you want?cyan, magenta, or yellow");
			if (color.equals("cyan")) {
				Tortoise.show();
				Tortoise.penDown();
				Tortoise.setPenColor(Color.cyan);
				Tortoise.setPenWidth(10);
				for (int x = 0; x < 4; x++) {
					Tortoise.move(100);
					Tortoise.turn(90);
				}

			}
			if (color.equals("magenta")) {
				Tortoise.show();
				Tortoise.penDown();
				Tortoise.setPenColor(Color.magenta);
				Tortoise.setPenWidth(10);
				for (int h = 0; h < 4; h++) {
					Tortoise.move(100);
					Tortoise.turn(90);
				}

			}
			if (color.equals("yellow")) {
				Tortoise.show();

				Tortoise.penDown();
				Tortoise.setPenColor(Color.yellow);
				Tortoise.setPenWidth(10);
				for (int k = 0; k < 4; k++) {
					Tortoise.move(100);
					Tortoise.turn(90);
				}
			} else {
				Tortoise.show();
				Tortoise.penDown();
				Tortoise.setPenColor(Colors.getRandomColor());
				for (int j = 0; j < 4; j++) {
					Tortoise.move(100);
					Tortoise.turn(90);
				}
			}
		}
	}

	// 1. make the tortoise draw a shape (this will take more than one line
	// of code)

}

// TODO Auto-generated method stub
