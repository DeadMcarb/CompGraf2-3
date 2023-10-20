module com.example.compgraf23 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.compgraf23 to javafx.fxml;
    exports com.example.compgraf23;
}