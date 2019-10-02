package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField theight;
    public TextField tweight;

    public Label lbmi;
    public Label lresult;

    public void buttonclicked()
    {

        double height;
        double weight;
        double bmi;

        String result="";

        height= Double.parseDouble(theight.getText());
        weight= Double.parseDouble(tweight.getText());

        bmi= height*height;
        bmi= weight/bmi;

        lbmi.setText("BMI IS: "+bmi);

        if(bmi<18.5){

            result="Under weight";

        }
        else if(bmi>18.5 && bmi<25){

            result="Normal";
        }
        else if(bmi>25){

            result="Over Weight";

        }

        lresult.setText("You are "+result);

    }

}