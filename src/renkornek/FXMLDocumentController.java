/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package renkornek;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.paint.Color;

/**
 *
 * @author ecir
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private ScrollBar scr_red;
    @FXML
    private ScrollBar scr_green;
    @FXML
    private ScrollBar scr_blue;
    @FXML
    private Label lbl_color;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void kirmiziDegisim(Event event) {
        Color renk=Color.rgb((int)scr_red.getValue(), (int)scr_green.getValue(), (int)scr_blue.getValue());
        lbl_color.setStyle("-fx-background-color:"+renk.toString().replace("0x", "#") +";");
    }   

    @FXML
    private void yesilDegisim(Event event) {
         Color renk=Color.rgb((int)scr_red.getValue(), (int)scr_green.getValue(), (int)scr_blue.getValue());
        lbl_color.setStyle("-fx-background-color:"+renk.toString().replace("0x", "#") +";");
    }

    @FXML
    private void maviDegisim(Event event) {
         Color renk=Color.rgb((int)scr_red.getValue(), (int)scr_green.getValue(), (int)scr_blue.getValue());
        lbl_color.setStyle("-fx-background-color:"+renk.toString().replace("0x", "#") +";");
    }
    
}
