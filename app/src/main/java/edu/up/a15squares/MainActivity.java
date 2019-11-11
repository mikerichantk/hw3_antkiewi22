package edu.up.a15squares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import static android.graphics.Color.GRAY;
import static android.graphics.Color.GREEN;
import static android.graphics.Color.LTGRAY;
import static android.graphics.Color.RED;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //create a 2D array of buttons
    public Button gameButton[][] = new Button[4][4];
    public int blankLeft;
    public int blankRight;
    public ArrayList<String> sList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // init gameButton array and onClick
        setGameGrid();
        // shuffle board to start
        reset();
        // check if numbers are in the correct spots
        correctColor();
    }

    // method to check if a move is valid
    public boolean validMove(int leftCoord, int righCoord){
        // check all valid directions
        if(((leftCoord == blankLeft) && (righCoord-1 == blankRight))){
            return true;
        }
        if((leftCoord == blankLeft) && (righCoord+1 == blankRight)){
            return true;
        }
        if((leftCoord+1 == blankLeft) && (righCoord == blankRight)){
            return true;
        }
        if((leftCoord-1 == blankLeft) && (righCoord == blankRight)){
            return true;
        }
            return false;
    }

    // method to check if the game is over
    public void correctColor(){
        // check if the buttons are in the correct places
        if(gameButton[0][0].getText()=="1"){
            gameButton[0][0].setBackgroundColor(GREEN);
        }
        // check if the buttons are not in the correct place
        else{
            gameButton[0][0].setBackgroundColor(LTGRAY);
        }
        if(gameButton[0][1].getText()=="2"){
            gameButton[0][1].setBackgroundColor(GREEN);
        }
        else{
            gameButton[0][1].setBackgroundColor(LTGRAY);
        }
        if(gameButton[0][2].getText()=="3"){
            gameButton[0][2].setBackgroundColor(GREEN);
        }
        else{
            gameButton[0][2].setBackgroundColor(LTGRAY);
        }
        if(gameButton[0][3].getText()=="4"){
            gameButton[0][3].setBackgroundColor(GREEN);
        }
        else{
            gameButton[0][3].setBackgroundColor(LTGRAY);
        }
        if(gameButton[1][0].getText()=="5"){
            gameButton[1][0].setBackgroundColor(GREEN);
        }
        else{
            gameButton[1][0].setBackgroundColor(LTGRAY);
        }
        if(gameButton[1][1].getText()=="6"){
            gameButton[1][1].setBackgroundColor(GREEN);
        }
        else{
            gameButton[1][1].setBackgroundColor(LTGRAY);
        }
        if(gameButton[1][2].getText()=="7"){
            gameButton[1][2].setBackgroundColor(GREEN);
        }
        else{
            gameButton[1][2].setBackgroundColor(LTGRAY);
        }
        if(gameButton[1][3].getText()=="8"){
            gameButton[1][3].setBackgroundColor(GREEN);
        }
        else{
            gameButton[1][3].setBackgroundColor(LTGRAY);
        }
        if(gameButton[2][0].getText()=="9"){
            gameButton[2][0].setBackgroundColor(GREEN);
        }
        else{
            gameButton[2][0].setBackgroundColor(LTGRAY);
        }
        if(gameButton[2][1].getText()=="10"){
            gameButton[2][1].setBackgroundColor(GREEN);
        }
        else{
            gameButton[2][1].setBackgroundColor(LTGRAY);
        }
        if(gameButton[2][2].getText()=="11"){
            gameButton[2][2].setBackgroundColor(GREEN);
        }
        else{
            gameButton[2][2].setBackgroundColor(LTGRAY);
        }
        if(gameButton[2][3].getText()=="12"){
            gameButton[2][3].setBackgroundColor(GREEN);
        }
        else{
            gameButton[2][3].setBackgroundColor(LTGRAY);
        }
        if(gameButton[3][0].getText()=="13"){
            gameButton[3][0].setBackgroundColor(GREEN);
        }
        else{
            gameButton[3][0].setBackgroundColor(LTGRAY);
        }
        if(gameButton[3][1].getText()=="14"){
            gameButton[3][1].setBackgroundColor(GREEN);
        }
        else{
            gameButton[3][1].setBackgroundColor(LTGRAY);
        }
        if(gameButton[3][2].getText()=="15"){
            gameButton[3][2].setBackgroundColor(GREEN);
        }
        else{
            gameButton[3][2].setBackgroundColor(LTGRAY);
        }
        if(gameButton[3][3].getText()==" "){
            gameButton[3][3].setBackgroundColor(GREEN);
        }
        else{
            gameButton[3][3].setBackgroundColor(LTGRAY);
        }
    }

    // method that randomizes the board
    public void reset(){
        // init the reset button
        Button resetButton = (Button) findViewById(R.id.buttonReset);
        resetButton.setOnClickListener(this);
        // clear list in case reset is called from clicking the reset button
        sList.clear();
        // init array list with strings of numbers 1-16 for the button text
        sList.add("1");
        sList.add("2");
        sList.add("3");
        sList.add("4");
        sList.add("5");
        sList.add("6");
        sList.add("7");
        sList.add("8");
        sList.add("9");
        sList.add("10");
        sList.add("11");
        sList.add("12");
        sList.add("13");
        sList.add("14");
        sList.add("15");
        sList.add("16");
        // shuffle array list to make numbers in random order
        Collections.shuffle(sList);
        // make a int to help iterate through the indexes of the array list
        int count = 0;
        for(int i = 0; i < gameButton.length; i++){
            for(int j = 0; j < gameButton.length; j++){
                //swap the blank and clicked button
                gameButton[i][j].setText(sList.get(count));
                // if this button does
                if (sList.get(count) == "16") {
                    blankLeft = i;
                    blankRight = j;
                    gameButton[i][j].setText(" ");
                }
                count++;

            }
        }
    }

    // method that sets up the buttons
    public void setGameGrid(){
        // fill the game button array with all the buttons
        gameButton[0][0] = (Button)findViewById(R.id.button1);
        gameButton[0][1] = (Button)findViewById(R.id.button2);
        gameButton[0][2] = (Button)findViewById(R.id.button3);
        gameButton[0][3] = (Button)findViewById(R.id.button4);
        gameButton[1][0] = (Button)findViewById(R.id.button5);
        gameButton[1][1] = (Button)findViewById(R.id.button6);
        gameButton[1][2] = (Button)findViewById(R.id.button7);
        gameButton[1][3] = (Button)findViewById(R.id.button8);
        gameButton[2][0] = (Button)findViewById(R.id.button9);
        gameButton[2][1] = (Button)findViewById(R.id.button10);
        gameButton[2][2] = (Button)findViewById(R.id.button11);
        gameButton[2][3] = (Button)findViewById(R.id.button12);
        gameButton[3][0] = (Button)findViewById(R.id.button13);
        gameButton[3][1] = (Button)findViewById(R.id.button14);
        gameButton[3][2] = (Button)findViewById(R.id.button15);
        gameButton[3][3] = (Button)findViewById(R.id.button16);
        // set the listener for all the buttons in the array
        gameButton[3][3].setOnClickListener(this);
        gameButton[0][0].setOnClickListener(this);
        gameButton[0][1].setOnClickListener(this);
        gameButton[0][2].setOnClickListener(this);
        gameButton[0][3].setOnClickListener(this);
        gameButton[1][0].setOnClickListener(this);
        gameButton[1][1].setOnClickListener(this);
        gameButton[1][2].setOnClickListener(this);
        gameButton[1][3].setOnClickListener(this);
        gameButton[2][0].setOnClickListener(this);
        gameButton[2][1].setOnClickListener(this);
        gameButton[2][2].setOnClickListener(this);
        gameButton[2][3].setOnClickListener(this);
        gameButton[3][0].setOnClickListener(this);
        gameButton[3][1].setOnClickListener(this);
        gameButton[3][2].setOnClickListener(this);
    }

    //make onClick method
    public void onClick(View v){
        // check if the reset button was clicked
        if(v.getId() == R.id.buttonReset){
            reset();
            return;
        }
        // init button to indicate which button is clicked (cb)
        Button click = (Button)v;

        //create for loop to go through array
        for(int i = 0; i < gameButton.length; i++){
            for(int j = 0; j < gameButton.length; j++){
                //swap the blank and clicked button
                if((gameButton[i][j] == click)){
                    // check if move was valid before making changes
                    if(validMove(i,j)) {
                        // set old blank button to the clicked button text
                        gameButton[blankLeft][blankRight].setText(click.getText());
                        // set clicked button to blank
                        gameButton[i][j].setText(" ");
                        // update the blank tracker
                        blankLeft = i;
                        blankRight = j;
                    }
                }
            }
        }
        // each click check to see what is in the right spot
        correctColor();
    }
}
/**External CitationDate:     7 November 2019
 * Problem:  Could not properly organize my layout
 * Soultion: Sierra showed me how to use a table layout
 */

/**External CitationDate:     7 November 2019
 * Problem:  Could not link onClickListeners to my buttons in the array
 * Soultion: Alex told me to use the form:
 *           gameButton[0][2].setOnClickListener(this);
 */

/**External CitationDate:     10 November 2019
 * Problem:  Did not know how to shuffle my array list
 * Soultion: I found the answer on https://www.geeksforgeeks.org/collections-shuffle-java-examples/
 *      and it lead to the code:
 *      Collections.shuffle(sList);
 */