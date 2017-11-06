/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorajavagethub;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author fabricio.barrozo
 */
public class FXMLDocumentController implements Initializable {
    
     int countButtonNumber = 1;
    int countButtonOperator = 1;
    float numberOne;
    float numberTwo;
    
    
    @FXML
    private Label label;
    @FXML
    private TextField exit1;
    @FXML
    private TextField exit2;
    
    
    @FXML
    private void btn0(ActionEvent event) {
        exit1.setText(exit1.getText() + "0");
    }
    @FXML
    private void btn1(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número 1
            exit1.setText("1");
            exit2.setText("1");
            System.out.println("Modificando para fazer push");
        }else{ 
            exit1.setText(exit1.getText() + "1"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit1.getText()); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn2(ActionEvent event) {
        if (countButtonNumber == 1) { // contador para adicionar somente o número 1
            exit1.setText("2");
            exit2.setText("2");
        }else{ 
            exit1.setText(exit1.getText() + "2"); // para adicionar o 1 mais o que tinha antes
            exit2.setText(exit1.getText()); 
        } 
        countButtonNumber = 2;
    }
    @FXML
    private void btn3(ActionEvent event) {
        exit1.setText(exit1.getText() + "3");
        
    }
    @FXML
    private void btn4(ActionEvent event) {
        exit1.setText(exit1.getText() + "4");
        
    }
    @FXML
    private void btn5(ActionEvent event) {
        exit1.setText(exit1.getText() + "5");
        
    }
    @FXML
    private void btn6(ActionEvent event) {
        exit1.setText(exit1.getText() + "6");
        
    }
    @FXML
    private void btn7(ActionEvent event) {
        exit1.setText(exit1.getText() + "7");
        
    }
    @FXML
    private void btn8(ActionEvent event) {
        exit1.setText(exit1.getText() + "8");    
    }
    @FXML
    private void btn9(ActionEvent event) {
        exit1.setText(exit1.getText() + "9");
        
    }
    @FXML
    private void btnC(ActionEvent event){
        exit1.setText("");
    }
    
    @FXML
    private void btnSum (ActionEvent event){
        numberOne = Float.parseFloat(exit1.getText()); // obter o primeiro número da equação
        exit2.setText(exit1.getText() + " + ");
        exit1.setText("+"); // imprimir o +
        
        countButtonNumber = 1; // contador para o próximo número não vir com o sinal da soma ou outro
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
