module com.example.alexeyfori {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.alexeyfori to javafx.fxml;
    exports com.example.alexeyfori;
}