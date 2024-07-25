package com.example.demo;

import com.example.Operations;
import com.example.TransferException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.Scanner;

public class MainController {

    @FXML
    private TextArea outputTextArea;

    public void initialize() {
        // Initialisation du contrôleur
    }

    @FXML
    public void executeCode() {
        // Ton code existant de Main.java pour traiter les actions
        // Assure-toi de rediriger la sortie vers outputTextArea
    }



    public void afficherMessage(String message) {
        outputTextArea.appendText(message + "\n");
    }
}