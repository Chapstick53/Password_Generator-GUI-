package com.example.passwordgen;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField passwordField;
    @FXML
    private Button generateButton;

    @FXML
    protected void generatePassword() {
        // Disable the generate button
        generateButton.setDisable(true);

        // Show "..." in the password field
        passwordField.setText("...");

        // Create a new thread to generate the password
        Thread thread = new Thread(() -> {
            // Simulate a delay
            try {
                Thread.sleep(2000); // 2 seconds delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Generate the password
            String password = PasswordGenerator.generatePassword(16);

            // Update the password field with the generated password
            passwordField.setText(password);

            // Enable the generate button
            generateButton.setDisable(false);
        });

        // Start the thread
        thread.start();
    }
}
