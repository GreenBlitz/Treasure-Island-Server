package graphical_user_interface;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageFactory {

	public static void setXY(ImageView object, float X, float Y) {
		object.setX(X);
		object.setY(Y);
	}

	public void setSize(ImageView object, float SizeX, float SizeY) {
		object.setFitHeight(SizeY);
		object.setFitWidth(SizeX);
	}

	public static ImageView createIV(int X, int Y, int sizeX, int sizeY, Image image) {
		ImageView generated = new ImageView(image);

		generated.setY(Y);
		generated.setX(X);
		generated.setFitHeight(sizeY);
		generated.setFitWidth(sizeX);
		return generated;
	}
}
