module com.example.java_data_visualizer {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.jfree.jfreechart;


    opens com.example.java_data_visualizer to javafx.fxml;
    exports com.example.java_data_visualizer;
}