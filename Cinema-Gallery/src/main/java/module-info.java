module javampg.moviepostergallery {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens javampg.moviepostergallery to javafx.fxml;
    exports javampg.moviepostergallery;
    exports javampg.cinemagallery;
    opens javampg.cinemagallery to javafx.fxml;
}