module co.edu.uniquindio.poo.dtorecord {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.dtorecord to javafx.fxml;
    exports co.edu.uniquindio.poo.dtorecord;
}