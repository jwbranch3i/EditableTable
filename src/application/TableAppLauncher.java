package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TableAppLauncher extends Application
{

	public static void main(String[] args)
	{
		Application.launch(TableAppLauncher.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		try
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("TableApp.fxml"));
			Parent root = loader.load();

			// final Parent root =
			// FXMLLoader.load(getClass().getClassLoader().getResource("/TableApp.fxml"));

			final Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("css.css").toExternalForm());

			stage.setScene(scene);
			stage.setTitle("Table Example");

			stage.setMinHeight(250);
			stage.setMinWidth(500);

			stage.setMaxHeight(500);
			stage.setMaxWidth(1000);

			stage.show();
		}
		catch (Exception e)
		{
			System.out.print(e);
		}
	}
}