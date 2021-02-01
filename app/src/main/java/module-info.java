module java.main{
    requires javafx.controls;
    exports Homework_1;
    requires com.google.common;
    requires com.google.gson;
    opens Homework_1 to com.google.gson;

}