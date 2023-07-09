module com.example.passwordgen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.passwordgen to javafx.fxml;
    exports com.example.passwordgen;
}