/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
    private Label label;
    
    @FXML
    private void soma(ActionEvent event) {
        Double n = Double.parseDouble(txtN.getText());
        Double nn = Double.parseDouble(txtN.getText());
        Double t = n + nn;
        
        txtT.setText(t.toString());
    }

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
                try{
                    FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),900,682);
                    Stage stage = new Stage();
            stage.setTitle("Cadastrar Aluno");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){

        }
    }

    @FXML
    private void fecharCad(ActionEvent event) {
    }
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
}
