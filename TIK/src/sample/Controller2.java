package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class Controller2<vv1> {
public String V1;
    public static String V2;
    public String V3;
    public String V4;
    public String V5;
    public String V6;

    /*public ArrayList<Integer> vone1 = new ArrayList(5);
    public ArrayList<Integer> vone2 = new ArrayList(5);
    public ArrayList<Integer> vone3 = new ArrayList(5);
    public ArrayList<Integer> vone4 = new ArrayList(5);
    public ArrayList<Integer> vone5 = new ArrayList(5);
    public ArrayList<Integer> vone6 = new ArrayList(5);*/
    @FXML
    public TextField v1;
    @FXML
    private TextField v2;
    @FXML
    private TextField v3;
    @FXML
    private TextField v4;
    @FXML
    private TextField v5;
    @FXML
    private TextField v6;
    @FXML
    private Button start;
    public static String vv1;
    public static String vv2;
    public static String vv3;
    public static String vv4;
    public static String vv5;
    public static String vv6;
    @FXML
    private void initialize() {
        v1.setText("01110");
        v2.setText("10100");
        v3.setText("00110");
        v4.setText("10101");
        v5.setText("11111");
        v6.setText("10110");

        start.setOnAction(event -> {
            vv1 =v1.getText();
            vv2 =v2.getText();
            vv3 =v3.getText();
            vv4 =v4.getText();
            vv5 =v5.getText();
            vv6 =v6.getText();

            FXMLLoader loader = new FXMLLoader();
            start.getScene().getWindow().hide();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });
    }

    public Controller2() {

    }
    public String get1() {
        this.V1 = vv1;
    return V1;

    }

    public String get2() {
        this.V2 = vv2;
        return V2;

    }

    public String get3() {
        this.V3 = vv3;
        return V3;

    }
    public String get4() {
        this.V4 = vv4;
        return V4;

    }

    public String get5() {
        this.V5 = vv5;
        return V5;

    }

   /* public void ini(ArrayList<Integer> vone, ArrayList<Integer> m){
        for(int i=0; i<5;i++){
           // m.set(i, vone.get(i));
            m.add(vone.get(i));
        }
}*/
   public String get6() {
       this.V6 = vv6;
       return V6;

   }
}
