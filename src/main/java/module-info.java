module com.example.codingstudy_230424 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codingstudy_230424 to javafx.fxml;
    exports com.example.codingstudy_230424;
    exports com.example.codingstudy_230424.w4;
    opens com.example.codingstudy_230424.w4 to javafx.fxml;
}