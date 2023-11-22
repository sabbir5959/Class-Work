package clsWrk;

import java.io.IOException;
import java.util.EventObject;

public class Student {
    int roll, term;
    final int a=5;
    public Student(int roll, int term) {
        this.roll = roll;
        this.term = term;
    }
    void print()
    {
        System.out.println("Student class");
    }
}
class L4Student extends Student{
    int thesis;
    public L4Student(int roll, int term, int thesis) {
        super(roll, term);
        this.thesis=thesis;
    }
    void print(){
        System.out.println("L4Student class");
    }
    void ShowThesis(){
        System.out.println("L4Student class");
    }
}
class main {
    public static void main(String[] args) {
        Student s = new L4Student(1, 500, 90);
        s.print();

    }
}


//          STAGE............................................................................................

//    public void victim_email(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FXML/VICTIM/FORGOT/forgotPass.fxml"));
//        Global.createStage(fxmlLoader);
//    }
//    public void close(ActionEvent event) throws IOException {
//        Global.closeStage(CLOSE);
//    }
//    public void victim_otp_verify(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(HelloApplication.class.getResource("FXML/VICTIM/FORGOT/OTP.fxml"));
//        Global.switch_scene(root,event);
//    }


//      TIMELINE ERROR SHOW...................................................................................

//error_text1.setText("Password doesn't match");
//        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(3000), ae -> error_text1.setText("")));
//        timeline.play();



//      GLOBAL STAGE...........................................................................................

//public class Global {
//    private static Scene scene;
//    private Parent root;
//    private Stage stage;
//
//
//
//    public static void createStage(FXMLLoader fxmlLoader) throws IOException
//    {
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage stage = new Stage();
//        stage.setTitle("Legal Enforcement System");
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.setTitle("Legal Enforcement System");
//        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("Image/logoblack.png")));
//        stage.show();
//    }
//
//    public static void switch_scene(Parent root, EventObject event) throws IOException
//    {
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setTitle("Legal Enforcement System");
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
//    }
//    public static void closeStage(Node node)
//    {
//        Stage stage = (Stage) node.getScene().getWindow();
//        stage.close();
//    }
//}
