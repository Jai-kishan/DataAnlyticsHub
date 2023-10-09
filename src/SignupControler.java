
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupControler {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;
    
    @FXML
    private TextField username;

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;
    
    @FXML
    private PasswordField confirmPassword;
    
    @FXML
    private Button SignUpBtn;

    @FXML
    void signUpBtnClicked(ActionEvent event) {
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        TextField userNameField = new TextField();
        TextField emailField = new TextField();

        PasswordField passwordField = new PasswordField();
        PasswordField confirmPasswordField = new PasswordField();

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String username = userNameField.getText();
        String email = emailField.getText();
        
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error", "Please fill in all fields.");

        } else if (!password.equals(confirmPassword)) {
            showAlert(Alert.AlertType.ERROR, "Error", "Passwords do not match.");
        } else {
            // TODO: Implement user registration logic here
            // For simplicity, we'll just print the entered data
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            // You can replace this with your actual registration code

            showAlert(Alert.AlertType.INFORMATION, "Success", "Registration successful!");

            // Clear the input fields after signup
            firstNameField.clear();
            lastNameField.clear();            
            userNameField.clear();
            emailField.clear();
            passwordField.clear();
            confirmPasswordField.clear();
        }
        // mainWindow.setTitle(email);

    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
