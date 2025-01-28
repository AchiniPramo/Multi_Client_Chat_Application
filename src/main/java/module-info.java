module org.example.multi_client_chat_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.multi_client_chat_application to javafx.fxml;
    exports org.example.multi_client_chat_application;
    exports org.example.multi_client_chat_application.controller;
    opens org.example.multi_client_chat_application.controller to javafx.fxml;
    exports org.example.multi_client_chat_application.server;
    opens org.example.multi_client_chat_application.server to javafx.fxml;
    exports org.example.multi_client_chat_application.client;
    opens org.example.multi_client_chat_application.client to javafx.fxml;
}