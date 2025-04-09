module basi.gestionexercices {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens HelpEsi to javafx.fxml;
    exports HelpEsi;
}