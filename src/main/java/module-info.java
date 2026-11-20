module dk.sea.mytunes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens dk.sea.mytunes to javafx.fxml;
    exports dk.sea.mytunes;
}