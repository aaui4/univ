import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainPageUI extends Application {

    @Override
    public void start(Stage primaryStage) {

        // ---------------------------
        //  شريط علوي
        // ---------------------------
        Label title = new Label("الصفحة الرئيسية");
        title.setFont(Font.font(16));

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button userBtn = new Button("👤");
        userBtn.setStyle("-fx-background-color: transparent; -fx-font-size: 18;");

        HBox topBar = new HBox(10, title, spacer, userBtn);
        topBar.setPadding(new Insets(10));
        topBar.setStyle("-fx-border-color: black; -fx-border-width: 0 0 1 0;");

        // ---------------------------
        //  خانة البحث
        // ---------------------------
        TextField searchField = new TextField();
        searchField.setPromptText("search");
        searchField.setPrefWidth(250);
        searchField.setStyle("-fx-background-radius: 20; -fx-padding: 8;");

        HBox searchBox = new HBox(searchField);
        searchBox.setAlignment(Pos.CENTER_LEFT);
        searchBox.setPadding(new Insets(15, 0, 15, 0));

        // ---------------------------
        //  بطاقة ترحيب
        // ---------------------------
        Label welcomeTitle = new Label("مرحبا اسم الموظف");
        welcomeTitle.setFont(Font.font(24));

        Label welcomeDesc = new Label("يمكنك إدارة الأجهزة الخاصة بك من هنا");
        welcomeDesc.setFont(Font.font(14));

        VBox welcomeCard = new VBox(10, welcomeTitle, welcomeDesc);
        welcomeCard.setAlignment(Pos.CENTER);
        welcomeCard.setPadding(new Insets(20));
        welcomeCard.setStyle("-fx-border-color: black; -fx-padding: 20;");

        // ---------------------------
        //  الأزرار
        // ---------------------------
        Button borrowBtn = new Button("استعارة جهاز");
        Button deviceListBtn = new Button("قائمة الأجهزة");
        Button returnBtn = new Button("ارجاع جهاز");
        Button borrowersBtn = new Button("قائمة المستعيرين");
        Button reportBtn = new Button("انشاء تقرير التبر");

        borrowBtn.setPrefWidth(150);
        deviceListBtn.setPrefWidth(150);
        returnBtn.setPrefWidth(150);
        borrowersBtn.setPrefWidth(150);
        reportBtn.setPrefWidth(200);

        HBox row1 = new HBox(20, borrowBtn, deviceListBtn, returnBtn, borrowersBtn);
        row1.setAlignment(Pos.CENTER);
        row1.setPadding(new Insets(10));

        HBox row2 = new HBox(reportBtn);
        row2.setAlignment(Pos.CENTER);
        row2.setPadding(new Insets(10));

        // ---------------------------
        //  تجميع الواجهة
        // ---------------------------
        VBox root = new VBox(20, topBar, searchBox, welcomeCard, row1, row2);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 800, 500);

        primaryStage.setTitle("Main Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
          }
