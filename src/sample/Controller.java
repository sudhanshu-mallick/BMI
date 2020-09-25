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

        double height1;
        double weight1;
        double bmi1;

        String result="";

        height1= Double.parseDouble(theight.getText());
        weight1= Double.parseDouble(tweight.getText());

        bmi1= height1*height1;
        bmi1= weight1/bmi1;

        lbmi.setText("BMI IS: "+bmi1);

        if(bmi1<18.5){

            result="Under weight";

        }
        else if(bmi1>18.5 && bmi1<25){

            result="Normal";
        }
        else if(bmi1>25){

            result="Over Weight";

        }

        lresult.setText("You are "+result);

    }

}
