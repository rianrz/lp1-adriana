module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.example;

    opens org.example to javafx.fxml;
    exports org.example;
}
