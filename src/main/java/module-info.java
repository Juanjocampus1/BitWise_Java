module com.empresa.bitwise_trabajo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.empresa.bitwise_trabajo to javafx.fxml;
    exports com.empresa.bitwise_trabajo;
}