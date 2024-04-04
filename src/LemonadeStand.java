import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
////////////////
public class LemonadeStand extends Application{
    public void start(Stage firstStage){
        GridPane beverageGrid = new GridPane();
        Label label1 = new Label("Regular Lemonade");
        Label label2 = new Label("Limeade");
        Label label3 = new Label("Pink Lemonade");
        beverageGrid.add(label1, 0, 1);
        beverageGrid.add(label2, 0, 0);
        beverageGrid.add(label3, 1, 0);
        beverageGrid.setHgap(14);
        beverageGrid.setVgap(18);
        Scene beverageStand = new Scene(beverageGrid, 500, 250);
        firstStage.setScene(beverageStand);
        firstStage.setTitle("Weekend Lemonade Stand");
        firstStage.show(); }
    public static void main(String[] args) {
        launch(args); }

}
