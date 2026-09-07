package jballs;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends GameApplication {
	
	public static String version_string = "jballs version 0.0004";

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(500);
        settings.setHeight(500);
        settings.setTitle("jballs");
        settings.setVersion("0.0004");
    }

    @Override
    protected void initGame() {
    }

    @Override
    protected void initUI() {
        Text version = new Text();
        version.setTranslateX(50); // x = 50
        version.setTranslateY(100); // y = 100

        version.setText(version_string);
        version.setFill(Color.MAGENTA);

        getGameScene().addUINode(version); // add to the scene graph
    }

    public static void main(String[] args) {
    	System.out.println(version_string);
        launch(args);
    }
}