package application;
import java.io.*;
import java.util.*;
/*
Student's Name : Noura Awni Jaber Manassra
Student's ID : 1212359
Lab's Section : 6 
Instructor's Name : Bassem Sayrafi
*/
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Driver extends Application {
	@Override
	public void start(Stage primaryStage) {
		ArrayList<PizzaOrder> orders = new ArrayList<>();//creat arraylist
		try {
			Group gp = new Group ();
			Text txt = new Text ("Welcome to Manassra's resturant\n");
			Font font = Font.font("Rockwell Extra Bold",25);
			txt.setFont(font);
			txt.setFill(Color.BLACK);
			txt.setLayoutX(10);
			txt.setLayoutY(50);
			Label l1 = new Label("Customer Name : ");
			l1.setLayoutX(10);
			l1.setLayoutY(100);
			Label l2 = new Label("Order Type         : ");
			l2.setLayoutX(10);
			l2.setLayoutY(130);
			TextField t1 = new TextField();
			t1.setLayoutX(120);
			t1.setLayoutY(94);
			String name = t1.getText();
			TextField t2 = new TextField("ToGo");
			t2.setLayoutX(120);
			t2.setLayoutY(130);
			Button bt1 = new Button ("Proccess Order");
			bt1.setPrefWidth(100);
			bt1.setLayoutX(300);
			bt1.setLayoutY(350);
			Button bt2 = new Button ("Print Orders");
			bt2.setPrefWidth(90);
			bt2.setLayoutX(200);	
			bt2.setLayoutY(350);
			Button bt3 = new Button ("Reset");
			bt3.setPrefWidth(90);
			bt3.setLayoutX(100);
			bt3.setLayoutY(350);
			Label l3 = new Label("Pizza Size : ");
			l3.setLayoutX(10);
			l3.setLayoutY(190);
			Label l4 = new Label("List of Toppings:");
			l4.setLayoutX(10);
			l4.setLayoutY(230); 
			TilePane rbb = new TilePane();
			  ToggleGroup tg = new ToggleGroup();
			  RadioButton rd1 = new RadioButton("ToGo");
		        RadioButton rd2 = new RadioButton("Seated");
		        RadioButton rd3 = new RadioButton("Delivery");
		        rd1.setToggleGroup(tg);
		        rd2.setToggleGroup(tg);
		        rd3.setToggleGroup(tg);
		        rbb.getChildren().add(l4);
		        rbb.getChildren().add(rd1);
		        rbb.getChildren().add(rd2);
		        rbb.getChildren().add(rd3);
		        rbb.setLayoutX(120);
		        rbb.setLayoutY(165);
		        tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() 
		        {
		            public void changed(ObservableValue<? extends Toggle> ob, 
		                                                    Toggle o, Toggle n)
		            {
		                RadioButton rb = (RadioButton)tg.getSelectedToggle();
		                if (rb != null) {
		                    String s = rb.getText();
		                    t2.setText(s);
		                }
		            }
		        });

TilePane r = new TilePane();
String order_size[] =
{ "SMALL", "MEDIUM", "LARGE"};
ComboBox combo_box =new ComboBox(FXCollections.observableArrayList(order_size));
Label selected = new Label("SMALL");
combo_box.getSelectionModel().select(0);
EventHandler<ActionEvent> event =new EventHandler<ActionEvent>() {
public void handle(ActionEvent e)
{
selected.setText(combo_box.getValue() + "");
}
};
combo_box.setOnAction(event);
String size  = selected.getText();
combo_box.setLayoutX(120);
combo_box.setLayoutY(200);
CheckBox c1 = new CheckBox("Onions");  
CheckBox c2 = new CheckBox("Olives");  
CheckBox c3 = new CheckBox("Green Peppers");  
HBox root = new HBox();  
root.setLayoutX(120);
root.setLayoutY(250);
root.getChildren().addAll(c1,c2,c3);  
root.setSpacing(5); 
Label test=new Label ();
EventHandler<ActionEvent> eventt = new EventHandler<ActionEvent>() {
    public void handle(ActionEvent e)
    {	int counter = 0;
        if (c1.isSelected())
            counter++;
        if (c2.isSelected())
            counter++;
        if (c3.isSelected())
            counter++;
        test.setText(""+counter);
    }
};
c3.setOnAction(eventt);
c1.setOnAction(eventt);
c2.setOnAction(eventt);
Label l5 = new Label("Toppings Price :");
l5.setLayoutX(10);
l5.setLayoutY(285); 
TextField t3 = new TextField();
t3.setText("10");
t3.setLayoutX(120);
t3.setLayoutY(280);
Label l6 = new Label("order Price :");
l6.setLayoutX(10);
l6.setLayoutY(320); 
Label l7 = new Label("0");
l7.setLayoutX(120);
l7.setLayoutY(320); 
Label l8 = new Label ("tripRate     :");
l8.setLayoutY(380);
l8.setLayoutX(10);
TextField t4 = new TextField ("0");
t4.setLayoutY(380);
t4.setLayoutX(100);
Label l9 = new Label ("zone          :");
l9.setLayoutY(410);
l9.setLayoutX(10);
TextField t5 = new TextField ("0");
t5.setLayoutY(410);
t5.setLayoutX(100);
Label l10 = new Label ("ServiceCharge :");
l10.setLayoutY(440);
l10.setLayoutX(10);
TextField t6 = new TextField ("0");
t6.setLayoutY(440);
t6.setLayoutX(100);
Label l11 = new Label ("No. People :");
l11.setLayoutY(470);
l11.setLayoutX(10);
TextField t7 = new TextField ("0");
t7.setLayoutY(470);
t7.setLayoutX(100);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
Label res = new Label();
res.setVisible(false);
l7.setVisible(true);
TextField out = new TextField ("");
Label ouut = new Label ("");
int trate=0,tzone=0,nppl=0;
double scharge=0;
Label tester = new Label ();
tester.setVisible(true);
tester.setLayoutX(100); 
tester.setLayoutY(500);
bt1.setOnAction(new EventHandler <ActionEvent>() {
	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (rd3.isSelected())
		{
			l8.setVisible(true);
			l9.setVisible(true);
			l10.setVisible(false);
			l11.setVisible(false);
			t4.setVisible(true);
			t5.setVisible(true);
			t6.setVisible(false);
			t7.setVisible(false);
		}
		else if (rd2.isSelected())
		{
			l8.setVisible(false);
			l9.setVisible(false);
			l10.setVisible(true);
			l10.setLayoutY(380);
			l10.setLayoutX(10);
			l11.setVisible(true);
			l11.setLayoutY(410);
			l11.setLayoutX(10);
			t4.setVisible(false);
			t5.setVisible(false);
			t6.setVisible(true);
			t6.setLayoutY(380);
			t6.setLayoutX(100);
			t7.setVisible(true);
			t7.setLayoutY(410);
			t7.setLayoutX(100);
		}
		else {
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
		}
		bt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
		    @Override
		    public void handle(MouseEvent mouseEvent) {
		        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
		        	l7.setVisible(false);
		        	res.setLayoutX(120);
		        	res.setLayoutY(320); 
		        	res.setVisible(true);
		            if(mouseEvent.getClickCount() == 2){
		                String type = t2.getText();
		            	String name = t1.getText();
		        	double tprice =  Double.parseDouble(t3.getText());
		        	int trate =Integer.parseInt(t4.getText());
		         	int tzone = Integer.parseInt(t5.getText());
		        	double scharge =  Double.parseDouble(t6.getText());
		        	int nppl = Integer.parseInt(t7.getText());
		        	 final int b = Integer.parseInt(test.getText());
		            	if(rd3.isSelected())
		            	{	
		            		if (selected.getText().equals("SMALL"))
		            	orders.add(new Delivery (name,1,b,(int)tprice,trate,tzone));
		            		if (selected.getText().equals("MEDIUM"))
		                    	orders.add(new Delivery (name,2,b,(int)tprice,trate,tzone));
		            		if (selected.getText().equals("LARGE"))
		                    	orders.add(new Delivery (name,3,b,(int)tprice,trate,tzone));
		            		double x =0;
		            		for (int i = 0; i < orders.size(); i++) {
		            			if (i== orders.size()-1)
		            			x=orders.get(i).calculateOrderPrice();}
		            		res.setText(""+x);
		            		res.setVisible(true);
		            		l7.setVisible(false);
		            	} 
		            	else	if(rd1.isSelected())
		            	{	//if (labelList.get(i).getId().equals(name_)) {

		            		if (selected.getText().equals("SMALL"))
		            		{	orders.add(new ToGo (name,1,b,(int)tprice));}
		            		if (selected.getText().equals("MEDIUM"))
		            		{	orders.add(new ToGo (name,2,b,(int)tprice));}
		            		if (selected.getText().equals("LARGE"))
		                      	orders.add(new ToGo (name,3,b,(int)tprice));
		            		double x =0;
		            		for (int i = 0; i < orders.size(); i++) {
		            			if (i== orders.size()-1)
		            			x=orders.get(i).calculateOrderPrice();}
		            		res.setText(""+x);
		            		res.setVisible(true);
		            		l7.setVisible(false);
		            	} 
		            	else  	if(rd2.isSelected())
		            	{	
		            		if (selected.getText().equals("SMALL"))
		            			orders.add(new Seated (name, 1,b,(int)tprice,(int)scharge,nppl));//new obj
		            		if (selected.getText().equals("MEDIUM"))
		            			orders.add(new Seated (name, 2,b,(int)tprice,(int)scharge,nppl));//new obj
		            		if (selected.getText().equals("LARGE"))
		            			orders.add(new Seated (name, 3,b,(int)tprice,(int)scharge,nppl));//new obj
		            		double x =0;
		            		for (int i = 0; i < orders.size(); i++) {
		            			if (i== orders.size()-1)
		            			x=orders.get(i).calculateOrderPrice();}
		            		res.setText(""+x);
		            		res.setVisible(true);
		            		l7.setVisible(false);
		            	}
		            	else
		            		System.out.println(-1);  
		            }
		        }
		    }
		});
	}
});
Label n = new Label ();
bt3.setOnAction(e->{
	orders.removeAll(orders);	
//	orders.trimToSize();
	start(primaryStage);
	t1.setText(out.getText());
t2.setText("ToGo");	
t3.setText("10");
combo_box.getSelectionModel().select(0);
t4.setText("");
t5.setText("");
t6.setText("0");
t7.setText("0"); 
c1.setSelected(false);
c2.setSelected(false);
c3.setSelected(false);
l7.setVisible(true);
res.setVisible(false);
   l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
t4.setVisible(false);
	t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
n.setVisible(false);
n.setVisible(false);
n.setText("");
    		});
n.setLayoutX(500);
n.setLayoutY(95);
n.setVisible(false);
Font fontr = Font.font("Kunstler Script",40);
n.setFont(fontr);
Label tit = new Label ();
tit.setLayoutX(500);
tit.setLayoutY(60);
tit.setFont(fontr);
tit.setVisible(false);
bt2.setOnAction(e-> {
            	java.util.Collections.sort(orders);//it's easier more easier than writing full code to sort the array list and the sort is used as temlplate to sort an array list	
            	n.setVisible(true);
            	for (int i = 0; i < orders.size(); i++) {
            		tit.setVisible(true);
            		tit.setText("List Of Customers    :");
            		String nn = orders.get(i).getCustomerName();
            		double pprice = orders.get(i).calculateOrderPrice();
               n.setText("The name is : "+ nn + "\n"+"The price is : "+ pprice+ "\n"+n.getText());
    		} 	
    		});
l7.setVisible(true);
res.setLayoutX(120);
res.setLayoutY(320); 
res.setVisible(false);        
			gp.getChildren().addAll(txt,l1,l2,t1,t2,combo_box,l3,l4,root,rbb,l5,t3,l6,l7,bt1,bt2,bt3,l8,t4,l9,t5,l10,t6,l11,t7,res,n,tit);
			Scene scene = new Scene(gp,400,400);		
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
