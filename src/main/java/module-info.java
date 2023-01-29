/** Module info file for the project. */
module main.sellefsonc482 {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.sellefsonc482 to javafx.fxml;
    exports main.sellefsonc482;
    opens controller_controllerfiles to javafx.fxml;
    exports controller_controllerfiles;
    opens model_classfiles to javafx.base;
    exports model_classfiles;
}