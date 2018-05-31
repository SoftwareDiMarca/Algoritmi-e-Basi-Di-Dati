import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
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
			this.circle.setFill(Color.TRANSPARENT);
			this.circle.setStroke(Color.BLACK);
			this.circle.setStrokeWidth(1.);
			this.sp.getChildren().add(circle);
			Text text = new Text("" + intero);
			text.setFont(new Font("Arial", 32));
			text.setFill(Color.RED);
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
		hBox.setStyle("-fx-border-color:red");
		hBox.setAlignment(Pos.CENTER);
		hBox.setSpacing(0);

		hBox.getChildren().add(circle.getStackPane());

		bp.setStyle("-fx-border-color:blue");
		bp.setCenter(hBox);

		stage.setScene(scene);

		stage.show();
	}
}
