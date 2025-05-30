package hi.verkefni.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VelkominnController {

    @FXML
    private Button spurningarButton;

    @FXML
    private Button haettaButton;

    /**
     * Meðhöndlar aðgerð þegar spurningarhnappur er ýttur.
     */
    @FXML
    private void handleSpurningarButtonAction() {
        System.out.println("Spurningar button pressed");
        ViewSwitcher viewSwitcher = new ViewSwitcher((Stage) spurningarButton.getScene().getWindow());
        viewSwitcher.switchToView("/spurningar-view.fxml");
    }

    /**
     * Meðhöndlar aðgerð þegar hætta hnappur er ýttur.
     */
    @FXML
    private void handleHaettaButtonAction() {
        System.out.println("Haetta button pressed");
        ViewSwitcher viewSwitcher = new ViewSwitcher((Stage) haettaButton.getScene().getWindow());
        viewSwitcher.switchToView("/kvedja-view.fxml");
    }
}