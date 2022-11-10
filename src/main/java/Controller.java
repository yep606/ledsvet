import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addUserButton;

    @FXML
    private Button findButton;

    @FXML
    private TextField loginField;

    @FXML
    private TextField passwordField;

    @FXML
    void initialize() {
        addUserButton.setOnAction(actionEvent -> {
            System.out.println("Нажал кнопку!");
        });
    }

}

//test some refs
