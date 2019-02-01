package com.example.hw1_tnicholson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ViewGroup transitionsContainer = (ViewGroup) findViewById(R.id.transitions_container);
        final TextView text = (TextView) transitionsContainer.findViewById(R.id.text);
        final TextView text1 = (TextView) transitionsContainer.findViewById(R.id.text1);
        final TextView text2 = (TextView) transitionsContainer.findViewById(R.id.text2);
        final ImageView img1 = (ImageView) transitionsContainer.findViewById(R.id.imageView);

        final Button button = (Button) transitionsContainer.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            boolean visible;

            @Override
            public void onClick(View v) {
                if((button.getText()).equals("OPEN")){
                    button.setText("CLOSE");
                }else{
                    button.setText("OPEN");
                }

                TransitionManager.beginDelayedTransition(transitionsContainer);
                visible = !visible;

                img1.setVisibility(visible ? View.VISIBLE : View.GONE);
                text.setVisibility(visible ? View.VISIBLE : View.GONE);
                text1.setVisibility(visible ? View.VISIBLE : View.GONE);
                text2.setVisibility(visible ? View.VISIBLE : View.GONE);

            }

        });
    }


}

