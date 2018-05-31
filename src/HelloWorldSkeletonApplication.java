

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class HelloWorldSkeletonApplication extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }
    
    
	private static class SingleBox extends StackPane {
		private StackPane sp;
		
		public SingleBox(int intero) {
			this.sp = new StackPane(); 
        	Rectangle r = new Rectangle(30., 30., null);
        	sp.getChildren().add(r);
        	Text text = new Text("" + intero);
        	text.setFont(new Font("Arial", 32));
        	text.setFill(Color.RED);        	
        	sp.getChildren().add(text);
		}
		
		public StackPane getStackPane() {
			return this.sp;
		}
		
		
	}
    
    
    @Override
     public void start(Stage stage) {
    	
        BorderPane bp = new BorderPane();
    	Scene scene = new Scene(bp, 600, 600);
    	
        stage.setTitle("Welcome to FX!");
        
        Integer interi[] = {22, 33, 43, 21, 32, 76, 89};

        
        SingleBox singleBox1 = new SingleBox(23);


      
        HBox hBox = new HBox(0);
        hBox.setStyle("-fx-border-color:red");
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(0);
        hBox.getChildren().add(singleBox1.getStackPane());
        Button btnFirst = new Button("<<");
        btnFirst.setMaxWidth(50);
        btnFirst.setMaxHeight(50);
        Button btnLast = new Button(">>");
        btnLast.setMaxWidth(50);
        btnLast.setMaxHeight(50);
        hBox.getChildren().add(btnFirst);
        HBox.setHgrow(btnFirst, Priority.ALWAYS);
        HBox.setHgrow(btnLast, Priority.ALWAYS);
        Rectangle[] vRect = new Rectangle[7];
        StackPane[] vStackPane = new StackPane[7];
        Text[] vText = new Text[7];
        
        //spazio vuoto iniziale
        Rectangle vRectInit = new Rectangle(15, 50, Color.TRANSPARENT);
    	hBox.getChildren().add(vRectInit);
        
        		
        for(int i = 0; i < 7; i++) {
        	vStackPane[i] = new StackPane();

        	vText[i] = new Text("" + interi[i]);
        	vText[i].setFont(new Font("Arial", 32));
        	vText[i].setFill(Color.RED);        	
        	vStackPane[i].getChildren().add(vText[i]);
        	vRect[i] = new Rectangle(50, 50, Color.TRANSPARENT);
        	vRect[i].setStroke(Color.BLACK);
        	vRect[i].setStrokeWidth(0.2);
        	vStackPane[i].getChildren().add(vRect[i]);
        	hBox.getChildren().add(vStackPane[i]);
        }
        
        //spazio vuoto finale
        Rectangle vRectFin = new Rectangle(15, 50, Color.TRANSPARENT);
    	hBox.getChildren().add(vRectFin);
    	
        hBox.getChildren().add(btnLast);

        for(int i = 0; i < 7; i++) {

        	vRect[i].setOnMouseClicked(new EventHandler<Event>() {

        		@Override
        		public void handle(Event event) {
        			for(int j = 0; j < 7; j++) {
        			if(vRect[j].getFill().equals(Color.web("#FF0000",0.5)))
        				vRect[j].setFill(Color.TRANSPARENT);
        			}
        			((Rectangle)event.getSource()).setFill(Color.web("#FF0000",0.5));
        		}
        	});
        }
        
        btnFirst.setOnMouseClicked(e -> {
       			for(int i = 1; i < 7; i++) {
        			if(vRect[i].getFill().equals(Color.web("#FF0000",0.5))) {
        				vRect[i].setFill(Color.TRANSPARENT);
        				vRect[i - 1].setFill(Color.web("#FF0000",0.5));
        			}
        			}
			});


        btnLast.setOnMouseClicked(new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
       			for(int i = 0; i < 6; i++) {
        			if(vRect[i].getFill().equals(Color.web("#FF0000",0.5))) {
        				vRect[i].setFill(Color.TRANSPARENT);
        				vRect[i + 1].setFill(Color.web("#FF0000",0.5));
        				break;
        			}
        			}
			}
		});
        
        
        
//        vRect[0].setOnMouseExited(new EventHandler<Event>() {
//
//			@Override
//			public void handle(Event event) {
//				vRect[0].setFill(Color.TRANSPARENT);
//			}
//		});

        bp.setStyle("-fx-border-color:blue");
        bp.setCenter(hBox);
        
        stage.setScene(scene);        
        
        stage.show();
        
    }
}
