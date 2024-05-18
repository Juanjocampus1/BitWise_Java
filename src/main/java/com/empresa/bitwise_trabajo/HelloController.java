package com.empresa.bitwise_trabajo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private Label resultText;

    @FXML
    protected void onAndButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        resultText.setText("Result: " + (num1 & num2));
    }

    @FXML
    protected void onOrButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        resultText.setText("Result: " + (num1 | num2));
    }

    @FXML
    protected void onXorButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        resultText.setText("Result: " + (num1 ^ num2));
    }

    @FXML
    protected void onNotButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        resultText.setText("Result: " + (~num1));
    }

    @FXML
    protected void onLeftShiftButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        resultText.setText("Result: " + (num1 << num2));
    }

    @FXML
    protected void onRightShiftButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        resultText.setText("Result: " + (num1 >> num2));
    }

    @FXML
    protected void onUnsignedRightShiftButtonClick() {
        int num1 = Integer.parseInt(number1.getText());
        int num2 = Integer.parseInt(number2.getText());
        resultText.setText("Result: " + (num1 >>> num2));
    }
}