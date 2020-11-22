package com.example.csc250hw14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private Dice emptyDice;
    private Dice nextDice;
    private String numberOfDice;
    private Button d4_Button;
    private Button d6_Button;
    private Button d8_Button;
    private Button d10_Button;
    private Button d12_Button;
    private Button d20_Button;
    private Button zero_Button;
    private Button one_Button;
    private Button two_Button;
    private Button three_Button;
    private Button four_Button;
    private Button five_Button;
    private Button six_Button;
    private Button seven_Button;
    private Button eight_Button;
    private Button nine_Button;
    private Button percentile_Button;
    private Button roll_Button;
    private Button clear_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emptyDice = new Dice(20);
        nextDice = emptyDice;
        numberOfDice = "";
        this.d4_Button = this.findViewById(R.id.d4_Button);
        this.d6_Button = this.findViewById(R.id.d6_Button);
        this.d8_Button = this.findViewById(R.id.d8_Button);
        this.d10_Button = this.findViewById(R.id.d10_Button);
        this.d12_Button = this.findViewById(R.id.d12_Button);
        this.d20_Button = this.findViewById(R.id.d20_Button);
        this.zero_Button = this.findViewById(R.id.zero_Button);
        this.one_Button = this.findViewById(R.id.one_Button);
        this.two_Button = this.findViewById(R.id.two_Button);
        this.three_Button = this.findViewById(R.id.three_Button);
        this.four_Button = this.findViewById(R.id.four_Button);
        this.five_Button = this.findViewById(R.id.five_Button);
        this.six_Button = this.findViewById(R.id.six_Button);
        this.seven_Button = this.findViewById(R.id.seven_Button);
        this.eight_Button = this.findViewById(R.id.eight_Button);
        this.nine_Button = this.findViewById(R.id.nine_Button);
        this.percentile_Button = this.findViewById(R.id.percentile_Button);
        this.roll_Button = this.findViewById(R.id.roll_Button);
        this.clear_Button = this.findViewById(R.id.clear_Button);
    }

    public void onClick(View v)
    {
        if(v == this.d4_Button)
        {
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(4);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.d6_Button)
        {
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(6);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.d8_Button)
        {
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(8);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.d10_Button)
        {
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(10);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.d12_Button)
        {
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(12);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.d20_Button)
        {
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(20);
            myTextView.setText(getNumberOfDice());
        }

        else if(v == this.zero_Button)
        {
            this.numberOfDice += 0;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.one_Button)
        {
            this.numberOfDice += 1;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.two_Button)
        {
            this.numberOfDice += 2;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.three_Button)
        {
            this.numberOfDice += 3;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.four_Button)
        {
            this.numberOfDice += 4;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.five_Button)
        {
            this.numberOfDice += 5;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.six_Button)
        {
            this.numberOfDice += 6;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.seven_Button)
        {
            this.numberOfDice += 7;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.eight_Button)
        {
            this.numberOfDice += 8;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.nine_Button)
        {
            this.numberOfDice += 9;
            TextView myTextView = this.findViewById(R.id.diceAmount_TV);
            myTextView.setText(getNumberOfDice());
        }
        else if(v == this.percentile_Button)
        {
            TextView total = this.findViewById(R.id.total_TV);
            TextView separateRolls = this.findViewById(R.id.separateRolls_TV);
            TextView currentRoll = this.findViewById(R.id.diceAmount_TV);
            nextDice = new Dice(100);
            this.numberOfDice = "1";
            int nextRoll = nextDice.rollDice();
            total.setText("" + nextRoll);
            separateRolls.setText("" + nextRoll);
            currentRoll.setText("1D100");
        }
        else if(v == this.roll_Button)
        {
            int[] ar = new int[Integer.parseInt(numberOfDice)];
            int totalNumber = 0;
            int intNumberOfDice = 0;
            if(numberOfDice != "")
            {
                intNumberOfDice = Integer.parseInt(numberOfDice);
            }
            for(int i = 0; i < intNumberOfDice; i++)
            {
                int nextRoll = nextDice.rollDice();
                totalNumber += nextRoll;
                ar[i] = nextRoll;
            }
            TextView myTextView = this.findViewById(R.id.total_TV);
            myTextView.setText("" + totalNumber);
            TextView separateRolls = this.findViewById((R.id.separateRolls_TV));
            separateRolls.setText(formatSeparateRolls(ar));
        }
        else if(v == this.clear_Button)
        {
            nextDice = emptyDice;
            numberOfDice = "";
            TextView diceAmount = this.findViewById(R.id.diceAmount_TV);
            TextView total = this.findViewById(R.id.total_TV);
            TextView separateRolls = this.findViewById(R.id.separateRolls_TV);
            diceAmount.setText("____");
            total.setText("_____");
            separateRolls.setText("");
        }
    }

    public String getNumberOfDice()
    {
        return numberOfDice + nextDice.display();
    }

    public String formatSeparateRolls(int[] ar)
    {
        String formattedString = "";
        for(int i = 0; i < ar.length; i++)
        {
            if(i != ar.length - 1)
            {
                formattedString += ar[i] + " + ";
            }
            else
            {
                formattedString += ar[i];
            }
        }
        return formattedString;
    }
}