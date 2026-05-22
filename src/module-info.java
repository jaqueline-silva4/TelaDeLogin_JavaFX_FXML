/**
 * 
 */
/**
 * 
 */
module JavaApplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
	requires javafx.base;

    opens JavaApplication2 to javafx.fxml, javafx.graphics;
    exports JavaApplication2;
}