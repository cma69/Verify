import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;

import javax.swing.*;

public class Verify extends Application {

    @Override
    public void start(Stage primaryStage) {

        String usr, pass;

        TextInputDialog textInputDialog = new TextInputDialog("");
        TextInputDialog passwordInputDialog = new TextInputDialog("");
        textInputDialog.setTitle("Authentication");

        textInputDialog.setContentText("Enter your username ");
        Optional<String> result = textInputDialog.showAndWait();
        String usrinput = result.get();


        passwordInputDialog.setContentText("Enter your password ");
        Optional<String> result2 = passwordInputDialog.showAndWait();
        String passinput = result2.get();


        if (usrinput.equals("simon") && (passinput.equals("697865"))) {
            System.out.print("Welcome simon");
        } else {
            System.out.print("Wrong password or username,please try again");

        }


    }
    public static void main(String [] args) {
        launch(args);


    }
}























































































