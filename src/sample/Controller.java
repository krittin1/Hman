package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class Controller {
    @FXML
    ImageView head ,body , lefthand,righthand,leftleg,rightleg;
    @FXML
    Label lala,lab;
    @FXML
    TextField input;
    @FXML
    Button click;

    Hangman hero ;
    @FXML public void game(ActionEvent action){
        hero.check(input.getText().charAt(0));
         lala.setText(hero.draw());
        //hero.draw();
        hang();

        if(hero.isWin()){

            lab.setText("You Win!!");
        }
        else if(hero.isLose()){
            lab.setText("You Lose!!");
            click.setVisible(false);
            lala.setText("10110sbk ");
        }
        input.clear();
    }
    @FXML public void initialize(){
        hero = new Hangman("10110Sbk");
        head.setVisible(false);
        body.setVisible(false);
        lefthand.setVisible(false);
        righthand.setVisible(false);
        leftleg.setVisible(false);
        rightleg.setVisible(false);
         lala.setText(hero.draw());
        lab.setText("");

    }

    public void hang(){
        if(hero.getCount() == 5){
            head.setVisible(true);
        }
        if (hero.getCount() == 4)   {
            body.setVisible(true);
        }
        if (hero.getCount() == 3) {
            lefthand.setVisible(true);
        }
        if (hero.getCount() == 2) {
            righthand.setVisible(true);
        }
        if (hero.getCount() == 1) {
            leftleg.setVisible(true);
        }
        if (hero.getCount() == 0 ){
            rightleg.setVisible(true);
        }
     /*  @FXML
       public void collectChar() {
            if ( input.getText().charAt(0) == '1' ){
                lala.setText(hero.draw());
            }
        } */
        

    }

}
