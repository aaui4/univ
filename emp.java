import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class BorrowDeviceUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        // ---------------------------
        // شريط علوي يشبه الرسم
        // ---------------------------
        Label title = new Label("استعارة جهاز");
        title.setFont(Font.font(16));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button userBtn = new Button("👤");
        userBtn.setStyle("-fx-background-color: transparent; -fx-font-size: 18;");

        HBox topBar = new HBox(10, title, spacer, userBtn);
        topBar.setPadding(new Insets(10));
        topBar.setStyle("-fx-border-color: black; -fx-border-width: 0 0 1 0;");

        // ---------------------------
        // خانة البحث
        // ---------------------------
        TextField searchField = new TextField();
        searchField.setPromptText("search");
        searchField.setPrefWidth(250);
        searchField.setStyle("-fx-background-radius: 20; -fx-padding: 8;");

        HBox searchBox = new HBox(searchField);
        searchBox.setPadding(new Insets(20, 0, 20, 0));

        // ---------------------------
        // الحقول الرئيسية
        // ---------------------------
        TextField deviceName = new TextField();
        deviceName.setPromptText("اسم الجهاز");

        TextField deviceType = new TextField();
        deviceType.setPromptText("نوع الجهاز");

        TextField borrowTime = new TextField();
        borrowTime.setPromptText("مدة الاستعارة");

        VBox fieldsBox = new VBox(15, deviceName, deviceType, borrowTime);
        fieldsBox.setAlignment(Pos.CENTER_LEFT);

        // ---------------------------
        // الأزرار
        // ---------------------------
        Button cancelBtn = new Button("إلغاء");
        Button confirmBtn = new Button("تأكيد");

        cancelBtn.setPrefWidth(80);
        confirmBtn.setPrefWidth(80);

        HBox buttons = new HBox(20, cancelBtn, confirmBtn);
        buttons.setAlignment(Pos.CENTER);
        buttons.setPadding(new Insets(20));

        // ---------------------------
        // تجميع الواجهة
        // ---------------------------
        VBox root = new VBox(10, topBar, searchBox, fieldsBox, buttons);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 600, 400);

        primaryStage.setTitle("استعارة جهاز");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
          }
