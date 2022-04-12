
import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage meineStage) {
		FlowPane rootNode = new FlowPane();
		
		File datei = new File(""); // Hier Pfad zur Musikdatei einfügen
		
		Media medium = new Media(datei.toURI().toString());
		MediaPlayer mediaplayer = new MediaPlayer(medium);
		MediaView mediaview = new MediaView(mediaplayer);
		
		rootNode.getChildren().add(mediaview);
		
		Scene meineSzene = new Scene(rootNode, 660, 500);
		
		meineStage.setTitle("Miniplayer von Jonas");
		meineStage.setScene(meineSzene);
		meineStage.show();
		
		mediaplayer.play();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
