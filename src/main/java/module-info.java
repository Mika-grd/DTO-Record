module co.edu.uniquindio.poo.dtorecord {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens co.edu.uniquindio.poo.dtorecord to javafx.fxml;
    exports co.edu.uniquindio.poo.dtorecord;
    exports co.edu.uniquindio.poo.dtorecord.controller;
    opens co.edu.uniquindio.poo.dtorecord.controller to javafx.fxml;
    opens co.edu.uniquindio.poo.dtorecord.model to javafx.base;
}