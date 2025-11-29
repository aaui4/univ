import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        // ---------------------------
        // شريط علوي
        // ---------------------------
        Label title = new Label("تسجيل دخول");
        title.setFont(Font.font(16));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        HBox topBar = new HBox(10, title, spacer);
        topBar.setPadding(new Insets(10));
        topBar.setStyle("-fx-border-color: black; -fx-border-width: 0 0 1 0;");

        // ---------------------------
        // الحقول
        // ---------------------------
        TextField emailField = new TextField();
        emailField.setPromptText("الايميل");
        emailField.setPrefWidth(250);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("كلمة المرور");
        passwordField.setPrefWidth(250);

        // Labels on the right side
        Label emailLabel = new Label("الايميل");
        Label passwordLabel = new Label("كلمة المرور");

        HBox emailRow = new HBox(20, emailField, emailLabel);
        emailRow.setAlignment(Pos.CENTER_RIGHT);

        HBox passwordRow = new HBox(20, passwordField, passwordLabel);
        passwordRow.setAlignment(Pos.CENTER_RIGHT);

        VBox fields = new VBox(20, emailRow, passwordRow);
        fields.setAlignment(Pos.CENTER);

        // ---------------------------
        // زر تسجيل الدخول
        // ---------------------------
        Button loginBtn = new Button("تسجيل دخول");
        loginBtn.setPrefWidth(120);

        HBox buttonBox = new HBox(loginBtn);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(20));

        // ---------------------------
        // تجميع الواجهة
        // ---------------------------
        VBox root = new VBox(20, topBar, fields, buttonBox);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 600, 350);

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    }
