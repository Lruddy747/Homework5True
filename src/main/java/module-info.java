module com.example.homewrk5_shapes {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.homewrk5_shapes to javafx.fxml;
    exports com.example.homewrk5_shapes;
}