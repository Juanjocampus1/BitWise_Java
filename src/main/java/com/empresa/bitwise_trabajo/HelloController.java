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
    private Label binaryNumber1;
    @FXML
    private Label binaryNumber2;
    @FXML
    private Label binaryResultText;

    @FXML
    protected void onNumber1KeyReleased() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            binaryNumber1.setText("Binary: " + Integer.toBinaryString(num1));
        } catch (NumberFormatException e) {
            binaryNumber1.setText("Invalid number");
        }
    }

    @FXML
    protected void onNumber2KeyReleased() {
        try {
            int num2 = Integer.parseInt(number2.getText());
            binaryNumber2.setText("Binary: " + Integer.toBinaryString(num2));
        } catch (NumberFormatException e) {
            binaryNumber2.setText("Invalid number");
        }
    }

    @FXML
    protected void onAndButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int result = num1 & num2;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers");
            binaryResultText.setText("");
        }
    }

    @FXML
    protected void onOrButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int result = num1 | num2;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers");
            binaryResultText.setText("");
        }
    }

    @FXML
    protected void onXorButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int result = num1 ^ num2;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers");
            binaryResultText.setText("");
        }
    }

    @FXML
    protected void onNotButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int result = ~num1;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter a valid number");
            binaryResultText.setText("");
        }
    }

    @FXML
    protected void onLeftShiftButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int result = num1 << num2;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers");
            binaryResultText.setText("");
        }
    }

    @FXML
    protected void onRightShiftButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int result = num1 >> num2;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers");
            binaryResultText.setText("");
        }
    }

    @FXML
    protected void onUnsignedRightShiftButtonClick() {
        try {
            int num1 = Integer.parseInt(number1.getText());
            int num2 = Integer.parseInt(number2.getText());
            int result = num1 >>> num2;
            resultText.setText("Result: " + result);
            binaryResultText.setText("Binary: " + Integer.toBinaryString(result));
        } catch (NumberFormatException e) {
            resultText.setText("Please enter valid numbers");
            binaryResultText.setText("");
        }
    }
}