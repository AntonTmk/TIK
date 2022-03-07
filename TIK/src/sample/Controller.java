package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


public class Controller {
    private ObservableList<value> per= FXCollections.observableArrayList();
   public ArrayList<Integer> vone1= new ArrayList(5);
    public ArrayList<Integer> vone2= new ArrayList(5);
    public ArrayList<Integer> vone3= new ArrayList(5);
    public ArrayList<Integer> vone4=  new ArrayList(5);
    public ArrayList<Integer> vone5= new ArrayList(5);
    public ArrayList<Integer> vone6= new ArrayList(5);
    public ArrayList<Integer> NP= new ArrayList(5);
    public ArrayList<results> rrr= new ArrayList(6);
    public ArrayList<Integer> cx= new ArrayList(6);

    @FXML
    private TableView<value> viv;
    @FXML
    private TableColumn<value, String> vvv;
    @FXML
    private TableColumn<value, Integer> vvv1;
    @FXML
    private TableColumn<value, Integer> vvv2;
    @FXML
    private TableColumn<value, Integer> vvv3;
    @FXML
    private TableColumn<value, Integer> vvv4;
    @FXML
    private TableColumn<value, Integer> vvv5;
    @FXML
    private TableColumn<value, Integer> vvv6;

    @FXML
    private Label np0;
    @FXML
    private Label np1;
    @FXML
    private Label np2;
    @FXML
    private Label np3;
    @FXML
    private Label np4;
    @FXML
    private Label np5;

    @FXML
    private Button exit;

    @FXML
    private Label c0;
    @FXML
    private Label c1;
    @FXML
    private Label c2;
    @FXML
    private Label c3;
    @FXML
    private Label c4;
    @FXML
    private Label c5;

    @FXML
    private Label knn0;
    @FXML
    private Label knn1;
    @FXML
    private Label knn2;
    @FXML
    private Label knn3;
    @FXML
    private Label knn4;
    @FXML
    private Label knn5;

    @FXML
    private Label ck0;
    @FXML
    private Label ck1;
    @FXML
    private Label ck2;
    @FXML
    private Label ck3;
    @FXML
    private Label ck4;
    @FXML
    private Label ck5;

    @FXML
    private Label c00;
    @FXML
    private Label c11;
    @FXML
    private Label c22;
    @FXML
    private Label c33;
    @FXML
    private Label c44;
    @FXML
    private Label c55;
private ArrayList<Label> cxx= new ArrayList(1);

    @FXML
    private Label np00;
    @FXML
    private Label np11;
    @FXML
    private Label np22;
    @FXML
    private Label np33;
    @FXML
    private Label np44;
    @FXML
    private Label np55;
    private ArrayList<Label> npx= new ArrayList(1);

    public Controller() {
    }

    @FXML
    private void initialize() {
        cxx.add(c00);
        cxx.add(c11);
        cxx.add(c22);
        cxx.add(c33);
        cxx.add(c44);
        cxx.add(c55);

        npx.add(np00);
        npx.add(np11);
        npx.add(np22);
        npx.add(np33);
        npx.add(np44);
        npx.add(np55);

        NP.add(0);
        NP.add(0);
        NP.add(0);
        NP.add(0);
        NP.add(0);
        NP.add(0);
        Controller2 m= new Controller2();
            initArr(vone1, m.get1());
            initArr(vone2, m.get2());
            initArr(vone3, m.get3());
            initArr(vone4, m.get4());
            initArr(vone5, m.get5());
            initArr(vone6, m.get6());
        initData();
        vvv.setCellValueFactory(new PropertyValueFactory<value, String>("v"));
        vvv1.setCellValueFactory(new PropertyValueFactory<value, Integer>("v1"));
        vvv2.setCellValueFactory(new PropertyValueFactory<value, Integer>("v2"));
        vvv3.setCellValueFactory(new PropertyValueFactory<value, Integer>("v3"));
        vvv4.setCellValueFactory(new PropertyValueFactory<value, Integer>("v4"));
        vvv5.setCellValueFactory(new PropertyValueFactory<value, Integer>("v5"));
        vvv6.setCellValueFactory(new PropertyValueFactory<value, Integer>("v6"));

        viv.setItems(per);
        initNP(np0, 0);
        initNP(np1, 1);
        initNP(np2, 2);
        initNP(np3, 3);
        initNP(np4, 4);
        initNP(np5, 5);

        for(int i=0; i<6; i++) {
            results C = new results(5, i, NP.get(i));
            C.init();
            cx.add(C.c);
            rrr.add(C);
        }
        int i=0;
        cknx(c0, ck0, knn0, i);
        i++;
        cknx(c1, ck1, knn1, i);
        i++;
        cknx(c2, ck2, knn2, i);
        i++;
        cknx(c3, ck3, knn3, i);
        i++;
        cknx(c4, ck4, knn4, i);
        i++;
        cknx(c5, ck5, knn5, i);

        inlab(npx, NP);
        inlab(cxx, cx);
        exit.setOnAction(event -> {System.exit(0);});

        }
    private void initArr(ArrayList<Integer> vone, String g){
        for(int i=0; i<5; i++){
            vone.add(Integer.valueOf(g.charAt(i)));
        }
    }
    private void initNP(Label np, int i){
        np.setText("NP("+String.valueOf(i)+")="+String.valueOf(NP.get(i)));
    }
    private void initData(){
        per.add(new value("v1",check(vone1, vone1), check(vone1, vone2), check(vone1, vone3),check(vone1, vone4), check(vone1, vone5), check(vone1, vone6)));
        per.add(new value("v2",check(vone2, vone1), check(vone2, vone2), check(vone2, vone3),check(vone2, vone4), check(vone2, vone5), check(vone2, vone6)));
        per.add(new value("v3",check(vone3, vone1), check(vone3, vone2), check(vone3, vone3),check(vone3, vone4), check(vone3, vone5), check(vone3, vone6)));
        per.add(new value("v4",check(vone4, vone1), check(vone4, vone2), check(vone4, vone3),check(vone4, vone4), check(vone4, vone5), check(vone4, vone6)));
        per.add(new value("v5",check(vone5, vone1), check(vone5, vone2), check(vone5, vone3),check(vone5, vone4), check(vone5, vone5), check(vone5, vone6)));
        per.add(new value("v6",check(vone6, vone1), check(vone6, vone2), check(vone6, vone3),check(vone6, vone4), check(vone6, vone5), check(vone6, vone6)));
    }
    private int check(ArrayList<Integer> one1, ArrayList<Integer> one2){
        int r=0;
        for(int i=0; i<5; i++) {
            if (one1.get(i) != one2.get(i)){
                r++;
            }
        }
        NP.set(r,NP.get(r)+1);
        return r;
    }
    public void cknx(Label al, Label bl, Label cl, int im){
        results ex=rrr.get(im);
        System.out.println("c="+ex.cs+" ck="+ex.cks+" k="+ex.ks+" a="+ex.a+" b="+ex.b+" NP="+ex.np+" ki="+ex.knn);
        al.setText(ex.cs);
        bl.setText(ex.cks);
        cl.setText(ex.ks);
    }
    public void inlab(ArrayList<Label> min, ArrayList<?> data){
        for(int i=0;i<data.size();i++){
            min.get(i).setText(String.valueOf(data.get(i)));
        }
    }

}
