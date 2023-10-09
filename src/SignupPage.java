import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SignupPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Signup Page");

        // Create a grid pane for the layout
        GridPane grid = new GridPane();
        grid.setAlignment(javafx.geometry.Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Create form controls
        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button signupButton = new Button("Sign Up");

        // Add controls to the grid
        grid.add(usernameLabel, 0, 0);
        grid.add(usernameField, 1, 0);
        grid.add(passwordLabel, 0, 1);
        grid.add(passwordField, 1, 1);

        // Add a signup button
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(javafx.geometry.Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(signupButton);
        grid.add(hbBtn, 1, 2);

        // Create an event handler for the signup button
        signupButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            // You can add your registration logic here
            // For simplicity, we'll just print the entered data
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            // You can replace this with your actual registration code
        });

        // Create a scene and set it on the stage
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
