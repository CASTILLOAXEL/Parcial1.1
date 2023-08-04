module edu.parcial1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens edu.parcial1 to javafx.fxml;
    exports edu.parcial1;
}