package app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class BmiController {

    @FXML
    private MenuItem close;

    @FXML
    private TextField waga;

    @FXML
    private TextField wzrost;
    
    @FXML
    private Label wynikBmi;

    @FXML
    private Button obliczBMI;

    @FXML
    void actionClose(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void actionOblicz(ActionEvent event) {		//akcja dla buttona obliczBMI
    	double wag = Double.parseDouble(waga.getText());	//wez tekst z textfield waga
    	double wzr = Double.parseDouble(wzrost.getText());	//wez tekst z textfield wzrost
    	double bmi = wag/(wzr*wzr);	//wzor na bmi - waga/wzrost do kwadratu
    	bmi *= 100;			//zaokraglenie do 2 miejsc po przecinku, czyli pomnozenie przez 100	
    	bmi = Math.round(bmi);		//zaokraglenie do liczby calkowitej	
    	bmi /= 100;					//podzielenie przez 100 przesuwa przecinek o dwa miejsca
	
    	if(bmi<18.5)		//jesli bmi mniejsze od xx to wyswietl
    		wynikBmi.setText("Twoje BMI: "+bmi+" >>>> Masz niedowagê. Szybko coœ zjedz!");
    	if(bmi>=18.5 && bmi<=25)	//jesli bmi w przedziale xx to wyswietl
    		wynikBmi.setText("Twoje BMI: "+bmi+" >>>> Twoja waga jest optymalna. Brawo Ty!");
    	if(bmi>25)			//jesli bmi wieksze od xx to wyswietl
    		wynikBmi.setText("Twoje BMI: "+bmi+" >>>> Masz nadwagê. Dziœ kolacji nie jesz!");
    }
}
