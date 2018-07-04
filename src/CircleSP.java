import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Lighting;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CircleSP extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	private class CircleHandsMade extends StackPane {

		private StackPane sp;
		private Circle circle;

		// Costruttore
		CircleHandsMade(double radius, int intero) {
			this.sp = new StackPane();
			this.circle = new Circle();
			this.circle.setRadius(radius);
			this.circle.setFill(Color.LIGHTGRAY);
			this.circle.setStroke(Color.BLACK);
			this.circle.setStrokeWidth(2.);
			DropShadow circleDropShadow = new DropShadow();
//			InnerShadow circleInnerShadow = new InnerShadow();
			circleDropShadow.setOffsetX(5);
			circleDropShadow.setOffsetY(5);
//			circleInnerShadow.setOffsetX(-3.0);
//			circleInnerShadow.setOffsetY(-3.0);
			circle.setEffect(circleDropShadow);
//			circle.setEffect(new Glow(0.10));
//			circle.setEffect(circleInnerShadow);
			this.sp.getChildren().add(circle);
			Text text = new Text("" + intero);
			Font textFont = new Font("Arial Bold", 35);
			text.setFont(textFont);
			text.setFill(Color.RED);
			text.setEffect(new Glow(0.10));
			text.setEffect(new Lighting());
			this.sp.getChildren().add(text);
			
			this.circle.setOnMouseClicked(new EventHandler<Event>() {
				@Override
				public void handle(Event event) {
					circle.setRadius(circle.getRadius() * 2);
				}
			});
			
		}

		public StackPane getStackPane() {
			return this.sp;
		}

	}

	@Override
	public void start(Stage stage) {

		BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp, 600, 600);

		stage.setTitle("Circle Hands Made!");

		CircleHandsMade circle = new CircleHandsMade(30., 23);

		HBox hBox = new HBox(0);
		hBox.setAlignment(Pos.CENTER);
		hBox.setSpacing(0);

		hBox.getChildren().add(circle.getStackPane());
		bp.setCenter(hBox);

		stage.setScene(scene);

		stage.show();
	}
}
