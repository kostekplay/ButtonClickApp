package pl.kostowski.buttonclickapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView textView;
    private int numTimesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Test\n");
        textView.setMovementMethod(new ScrollingMovementMethod());

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numTimesClicked ++;
                String resoult = "Tapped: " + numTimesClicked + " time";
                if(numTimesClicked != 1)
                {
                    resoult +="s";
                }

                String result2 = userInput.getText().toString();

                resoult += " " + result2 + " \n";
                textView.append(resoult);
            }
        };
        button.setOnClickListener(onClickListener);
    }
}
