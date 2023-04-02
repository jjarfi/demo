module com.demo.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.demo.demo to javafx.fxml;
    exports com.demo.demo;
}