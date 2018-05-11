/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author 00977828239
 */
public class menuprincipalController implements Initializable {
    
    @FXML
    private TextField txtN, txtNN, txtT;
    
    @FXML
    private Button btnS;
    
    @FXML
    private void soma(ActionEvent event) {
        Double n = Double.parseDouble(txtN.getText());
        Double nn = Double.parseDouble(txtN.getText());
        Double t = n + nn;
        
        txtT.setText(t.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
